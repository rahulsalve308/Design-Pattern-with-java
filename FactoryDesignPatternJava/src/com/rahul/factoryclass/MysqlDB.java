package com.rahul.factoryclass;

public class MysqlDB extends DbConnection{
	
	private String dbName;
	private int maxDbConnection;
	private String dbUrl;
	
	@Override
	public String getDbName() {
		return dbName;
	}
	
	@Override
	public int getDbMaxConnection() {
		return maxDbConnection;
	}
	
	@Override
	public String getDbUrl() {
		return dbUrl;
	}

	public MysqlDB(String dbName, int maxDbConnection, String dbUrl) {
		super();
		this.dbName = dbName;
		this.maxDbConnection = maxDbConnection;
		this.dbUrl = dbUrl;
	}
}
