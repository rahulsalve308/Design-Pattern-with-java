package com.rahul;

public class TestBuilderPattern {

	public static void main(String[] args) {

		DbConnection dbConnection = new DbConnection.DbConnectionBuilder("oracle", "120.25.26.24:5060")
				.setDisableStatementPooling(true).build();
		
		System.out.println(dbConnection);
		
	}
}
