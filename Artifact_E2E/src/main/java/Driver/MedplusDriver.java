package Driver;

import Excel.TestData;
import Pages.ICD;
import Pages.Login;
import DB.dbConnection;


public class MedplusDriver {
	public static Login getLogin()
	{
		return new Login();
	}
	public static ICD getICD()
	{
		return new ICD();
	}
	public static TestData getExcel()
	{
		return new TestData();
	}
	public static dbConnection getDbConnection()
	{
		return new dbConnection();
	}

}
