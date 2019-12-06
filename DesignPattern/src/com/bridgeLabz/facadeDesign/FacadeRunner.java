package com.bridgeLabz.facadeDesign;

import java.sql.Connection;
import com.bridgeLabz.utility.*;
public class FacadeRunner 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter the Table Name");
		String tableName = Util.next();
		System.out.println(tableName);
		
		Connection con = MysqlHelper.mySqlDBconnection();
		MysqlHelper SqlHelper = new MysqlHelper();
		SqlHelper.mySqlHTMLreport(tableName, con);
		
		Connection con1 = OracleHelper.oracleDBconnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.oraclePDFreport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
