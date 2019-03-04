package co.edureka.generics;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider
	public String[][]  getData()
	{
		String credentials[][] = new String[1][2];
		credentials[0][0]="pranjali.yadav2025@gmail.com";
		credentials[0][1]="pranjali.yadav2025@3073";
		//credentials[1][0]="pranjali.yadav2025@gmail.com";
		//credentials[1][1]="pranjali.yadav2025@3073";
		
		return credentials;
		
	}
	

}
