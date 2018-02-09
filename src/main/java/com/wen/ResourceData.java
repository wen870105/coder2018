/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.wen;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.wen.annotation.ResAnt;

/**
 * 
 * @author wsy48420
 * @version $Id: ResourceData.java, v 0.1 2018年1月5日 下午3:49:35 wsy48420 Exp $
 */
public class ResourceData {
    @ResAnt("project.groupId")
    private String projectGroupId;

    @ResAnt("project.verion")
    private String projectVerion;

    @ResAnt("project.name")
    private String projectName;

    @ResAnt("jdbc.driverClassName")
    private String jdbcDriverClassName;

    @ResAnt("jdbc.url")
    private String jdbcUrl;

    @ResAnt("jdbc.username")
    private String jdbcUsername;

    @ResAnt("jdbc.password")
    private String jdbcPassword;

    @ResAnt("table.prefix")
    private String tablePrefix;

    @ResAnt("author")
    private String author;

    @ResAnt("showsql")
    private String showsql;

    @ResAnt("fileexist.delete")
    private String fileexistDelete;

    @ResAnt("package")
    private String packageName;

    @ResAnt("table.exclude.tables")
    private String tableExcludeTables;

    @ResAnt("generate.path")
    private String generatePath;

    public String getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(String projectGroupId) {
        this.projectGroupId = projectGroupId;
    }

    public String getProjectVerion() {
        return projectVerion;
    }

    public void setProjectVerion(String projectVerion) {
        this.projectVerion = projectVerion;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getJdbcDriverClassName() {
        return jdbcDriverClassName;
    }

    public void setJdbcDriverClassName(String jdbcDriverClassName) {
        this.jdbcDriverClassName = jdbcDriverClassName;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShowsql() {
        return showsql;
    }

    public void setShowsql(String showsql) {
        this.showsql = showsql;
    }

    public String getFileexistDelete() {
        return fileexistDelete;
    }

    public void setFileexistDelete(String fileexistDelete) {
        this.fileexistDelete = fileexistDelete;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTableExcludeTables() {
        return tableExcludeTables;
    }

    public void setTableExcludeTables(String tableExcludeTables) {
        this.tableExcludeTables = tableExcludeTables;
    }

    public String getGeneratePath() {
        return generatePath;
    }

    public void setGeneratePath(String generatePath) {
        this.generatePath = generatePath;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
