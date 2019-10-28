package com.rahul.factoryclass;

public abstract class DbConnection {

	public abstract String getDbName();

	public abstract int getDbMaxConnection();

	public abstract String getDbUrl();

	@Override
	public String toString() {
		return "DB Name : " + getDbName() + ";\n DB Url : " + getDbUrl() + "\n Db Max Connection :"
				+ getDbMaxConnection();
	}
}