package com.bridgeLabz.facadeDesign;

import java.sql.Connection;

public class HelperFacade 
{

	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName){
		Connection con = null;
		switch (dbType){
		case MYSQL: 
			con = MysqlHelper.mySqlDBconnection();
			MysqlHelper mySqlHelper = new MysqlHelper();
			switch(reportType)
			{
			case HTML:
				mySqlHelper.mySqlHTMLreport(tableName, con);
				break;
			case PDF:
				mySqlHelper.mySqlPDFreport(tableName, con);
				break;
			}
			break;
		case ORACLE: 
			con = OracleHelper.oracleDBconnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType){
			case HTML:
				oracleHelper.oracleHTMLreport(tableName, con);
				break;
			case PDF:
				oracleHelper.oraclePDFreport(tableName, con);
				break;
			}
			break;
		}
		
	}
	
	public static enum DBTypes
	{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes
	{
		HTML,PDF;
	}
}
