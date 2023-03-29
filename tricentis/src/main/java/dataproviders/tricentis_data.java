package dataproviders;

import org.testng.annotations.DataProvider;

import generic.base_test;
import generic.webActionUtil;

public class tricentis_data {

	@DataProvider
	public Object[][] adduserdata(){
		Object[][] d =new Object[1][5];
		d[0][0]=webActionUtil.getdata(base_test.excelPath, "adduser1", 1, 0);
		d[0][1]=webActionUtil.getdata(base_test.excelPath, "adduser1", 1, 1);
		d[0][2]=webActionUtil.getdata(base_test.excelPath, "adduser1", 1, 2);
		d[0][3]=webActionUtil.getdata(base_test.excelPath, "adduser1", 1, 3);
		d[0][4]=webActionUtil.getdata(base_test.excelPath, "adduser1", 1, 4);
		return d;
	}	
	}	
	
