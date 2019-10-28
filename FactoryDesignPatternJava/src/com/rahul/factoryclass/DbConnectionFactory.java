package com.rahul.factoryclass;

public class DbConnectionFactory {

	public static DbConnection getDbConnection(DbTypeEnum dbTypeEnum, String dbName, int maxDbConnection, String dbUrl) {
		if (dbTypeEnum.name().equalsIgnoreCase("Oracle")) {
			return new OracleDB(dbName, maxDbConnection, dbUrl);
		} else if (dbTypeEnum.name().equalsIgnoreCase("mysql")) {
			return new MysqlDB(dbName, maxDbConnection, dbUrl);
		} else {
			return null;
		}
	}
}
