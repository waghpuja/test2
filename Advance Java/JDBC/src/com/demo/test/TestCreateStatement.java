package com.demo.test;
import java.sql.DriverManager;
public class TestCreateStatement {

	public static void main(String[] args) {
		//1. Register Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

	}

}
