package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	    WebDriver driver;
	    @Test(dataProvider="testdata")
		public  void DemoProject(String firstname,String lastname, String phone, String email,String Address,String city,String State, String postal ,String username,String password,String confirm) 
	    {
	 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91964\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys(firstname);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys(lastname);
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys(phone);
	    driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(email);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys(Address);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys(city);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(State);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys(postal);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")).sendKeys("INDIA");
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys(password);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(confirm);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
	    }
	    @DataProvider(name="testdata")
	    public Object[] [] testDataFeed()

	    {
	    	ReadExcel config=new ReadExcel("C:\\Users\\91964\\Desktop\\Guru99.xlsx");
	    	int rows=config.getRowCount(0);
	    	Object[][] credntls=new Object[rows][11];
	    	for(int i=0;i<rows;i++)
	    	{
	    		credntls[i][0]=config.getData(0,i,0);
	    		credntls[i][1]=config.getData(0,i,1);
	    		credntls[i][2]=config.getData(0,i,2);
	    		credntls[i][3]=config.getData(0,i,3);
	    		credntls[i][4]=config.getData(0,i,4);
	    		credntls[i][5]=config.getData(0,i,5);
	    		credntls[i][6]=config.getData(0,i,6);
	    		credntls[i][7]=config.getData(0,i,7);
	    		credntls[i][8]=config.getData(0,i,8);
	    		credntls[i][9]=config.getData(0,i,9);
	    		credntls[i][10]=config.getData(0,i,10);
	    	}
	    	return credntls;
		}

}
