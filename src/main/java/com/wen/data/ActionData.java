package com.wen.data;

import com.wen.db.TableMetadata;

/**
 * 
 * @author wsy
 * 2011-11-9
 */
public class ActionData extends GenerateData {
	public ActionData(TableMetadata tm) {
		super(tm);
	}

	@Override
	public String getContent() {
		try {
			return getContentFromTemplate("controller.java.ftl");
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@Override
	public String getFileSuffix() {
		return "Controller.java";
	}

	@Override
	public String getPackageStoreDirectory() {
		return "web";
	}
}
