package com.wen.db.handlers;

import java.util.List;

import com.wen.ResourceManager;
import com.wen.data.BaseData;
import com.wen.data.GenerateData;
import com.wen.data.IbatisDaoData;
import com.wen.data.JavaDomainData;
import com.wen.data.MybatistXmlData;
import com.wen.data.ServiceData;
import com.wen.data.ServiceImplData;
import com.wen.db.TableMetadata;

/**
 * 
 * @author wsy
 * 2011-11-3
 */
public class HandlerFacade {
    public HandlerFacade() {

    }

    public HandlerFacade(String test) {
        MysqlHandler h = new MysqlHandler();
        List<TableMetadata> tms = h.getAllTableMetadata();
        createFiles(new BaseData(null));
        //		createFiles(new BaseServiceData(null));
        //		createFiles(new BaseServiceImplData(null));
        //String[] arr = ResourceManager.getInstance().getArray("table.excute");
        for (TableMetadata tm : tms) {

            if (!isExcludeTable(tm.getTableName())) {
                createFiles(new IbatisDaoData(tm));
                createFiles(new JavaDomainData(tm));

                createFiles(new ServiceData(tm));
                createFiles(new ServiceImplData(tm));
                createFiles(new MybatistXmlData(tm));

                /*
                createFiles(new ActionData(tm));
                createFiles(new IbatistXmlData(tm));
                createFiles(new CreateJspData(tm));
                createFiles(new ListJspData(tm));
                createFiles(new EditJspData(tm));
                */
            }

        }
    }

    // 只生成相应文件
    private boolean isExcuteTable(String tableName) {
        String[] arr = ResourceManager.getInstance().getArray("table.excute");
        for (String a : arr) {
            if (tableName.indexOf(a) > -1)
                return true;
        }
        return false;
    }

    // 排除表不生成相应文件
    private boolean isExcludeTable(String tableName) {
        String[] arr = ResourceManager.getInstance().getArray("table.exclude.tables");
        for (String a : arr) {
            if (tableName.toLowerCase().contains(a.toLowerCase()))
                return true;
        }
        return false;
    }

    private void createFiles(GenerateData gd) {
        gd.creatFile();
    }
}
