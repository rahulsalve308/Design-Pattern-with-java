package com.rahul.factoryclass;

public class TestFactoryClass {

	static public void main(String[] params) {
		
		DbConnection oracleConn = DbConnectionFactory.getDbConnection(DbTypeEnum.Oracle, "Oracle database", 50, "10.20.25.266:45");
		DbConnection mysqlConn = DbConnectionFactory.getDbConnection(DbTypeEnum.Mysql, "mysql database", 20, "45.20.25.266:42");
		
		System.out.println(oracleConn);
		System.out.println(mysqlConn);
		
	}
	
}
