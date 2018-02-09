/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.wen.generator;

/**
 * 
 * @author wsy48420
 * @version $Id: T.java, v 0.1 2018年1月5日 下午5:38:01 wsy48420 Exp $
 */

public class Generator {
	private final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Generator.class);
	public static final String TEST_JAVA = "src/test/java/";
	public static final String TEST_RESOURCES = "src/test/resources/";
	public static final String MAIN_JAVA = "src/main/java/";
	public static final String MAIN_RESOURCES = "src/main/resources/";

	public static final String[] APPS = { Constants.BIZ, Constants.COMMON, Constants.DAL, Constants.FACADE,
			Constants.FACADE_IMPL, Constants.INTEGRATION, Constants.WEB };

	public Generator() throws Exception {
	}

	public void generateProject() throws Exception {
		this.logger.info("generateProject...");
	}

	private void generateFrame() {
	}

	private void generateCode() {
		generateDal();
		generateDomain();
		generateBiz();
		generateController();
	}

	private void generateDal() {
	}

	private void generateDomain() {
	}

	private void generateBiz() {
	}

	private void generateController() {
	}
}
