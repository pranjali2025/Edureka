package co.edureka.generics;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider
	public String[][]  getData()
	{
		String credentials[][] = new String[1][2];
		credentials[0][0]="@gmail.com";
		credentials[0][1]="abcd";
		
		
		return credentials;
		
	}
	

}
