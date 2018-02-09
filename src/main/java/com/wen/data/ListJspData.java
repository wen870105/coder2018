package com.wen.data;

import com.wen.db.TableMetadata;

/**
 * 
 * @author wsy
 * 2011-11-9
 */
public class ListJspData extends GenerateData{

	public ListJspData(TableMetadata tm) {
		super(tm);
	}

	@Override
	public String getContent()  {
		try {
			return getContentFromTemplate("list.jsp.ftl");
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}

	@Override
	public String getPackageStoreDirectory() {
		return "jsp";
	}

	@Override
	public String getFileSuffix() {
		return "List.jsp";
	}
	

}
