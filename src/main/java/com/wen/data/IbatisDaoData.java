package com.wen.data;

import com.wen.db.TableMetadata;

/**
 * 
 * @author wsy
 * 2011-11-9
 */
public class IbatisDaoData extends GenerateData{

	public IbatisDaoData(TableMetadata tm) {
		super(tm);
	}

	@Override
	public String getContent()  {
		try {
			return getContentFromTemplate("dao.java.ftl");
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}

	@Override
	public String getPackageStoreDirectory() {
		return "dao";
	}

	@Override
	public String getFileSuffix() {
		return "Dao.java";
	}
	

}
