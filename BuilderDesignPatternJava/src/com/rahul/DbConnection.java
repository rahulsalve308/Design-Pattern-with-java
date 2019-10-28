package com.rahul;

import javax.xml.bind.DataBindingException;

public class DbConnection {

	// compulsory fields
	private String dbName;
	private String dbUrl;

	// optional fields
	private boolean disableStatementPooling;

	public String getDbName() {
		return dbName;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public boolean isDisableStatementPooling() {
		return disableStatementPooling;
	}
	
	private DbConnection(DbConnectionBuilder dbConnectionBuilder) {
		this.dbName=dbConnectionBuilder.dbName;
		this.dbUrl=dbConnectionBuilder.dbUrl;
		this.disableStatementPooling=dbConnectionBuilder.disableStatementPooling;
	}

	@Override
	public String toString() {
		return "DbName : "+getDbName()+"\nDbUrl : "+getDbUrl()+"\ndisableStatementPooling : "+isDisableStatementPooling();
	}
	
	public static class DbConnectionBuilder {

		// compulsory fields
		private String dbName;
		private String dbUrl;

		// optional fields
		private boolean disableStatementPooling;

		public DbConnectionBuilder(String dbName, String dbUrl) {
			this.dbName = dbName;
			this.dbUrl = dbUrl;
		}

		public DbConnectionBuilder setDisableStatementPooling(boolean disableStatementPooling) {
			this.disableStatementPooling = disableStatementPooling;
			return this;
		}
		
		public DbConnection build() {
			return new DbConnection(this);
		}
	}
}
