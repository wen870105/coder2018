package com.wen.data;

import com.wen.db.TableMetadata;

/**
 * 
 * @author wsy
 * 2011-11-9
 */
public class CreateJspData extends GenerateData{

	public CreateJspData(TableMetadata tm) {
		super(tm);
	}

	@Override
	public String getContent()  {
		try {
			return getContentFromTemplate("create.jsp.ftl");
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
		return "Create.vm";
	}
	

}
