package assignment;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lak {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//Click the 'sort on date' checkbox
		
		  //Clear and type in the from station text field
		  driver.findElementById("txtOriginGeneral").clear();
		  driver.findElementById("txtOriginGeneral").sendKeys("Cameron Highlands",Keys.ENTER);
		  		  
		  //Clear and type in the to station text field
		  driver.findElementById("txtDestinationGeneral").clear();
		  driver.findElementById("txtDestinationGeneral").sendKeys("Kaula Lampur",Keys.ENTER); 
		  Thread.sleep(2000);
		  
		  driver.findElementById("txtDepartDateBooking").click();
		 
//		  driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		  driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a").click();
//		  
		  Thread.sleep(2000);
//		  
		  
	  driver.findElementByXPath("//*[@id=\"btnBusSearchNewGeneral\"]").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[1]/td[6]/a").click();
//		  //*[@id="subtab1"]/table/tbody/tr[1]/td[6]/a
		  
		  
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[3]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[4]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[5]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[6]/div").click();
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[7]/div").click();
		//*[@id="subtab1"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/input
		  
		  driver.findElementByXPath("//*[@id=\"subtab1\"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/input").click();
		  Thread.sleep(3000);
		  
		  
		  
		//*[@id="subtab1"]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/div
//		  System.out.println("Sort on date checkbox is selected: " + driver.findElementById("chkSelectDateOnly").isSelected());
//			
//		 
//		  Set<String> set = new HashSet<String>();
//		 //Store all the train names in a list	
//		 List<WebElement> elements=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
//		 System.out.println("List of train names: ");
//		 System.out.println("-------------------");
//		  for(int i=0;i<elements.size();i++) {
//			WebElement element=elements.get(i);
//			System.out.println(element.getText());
//			//Add the list into a new Set
//			set.add(element.getText());
//		}
//		
//		//Get the size of list
//		System.out.println("List Size: " + elements.size());
//		 System.out.println("---------");
//		
//		 System.out.println("Set of train name: ");
//		 System.out.println("-----------------");
//         for (String eachSet : set) {
//			System.out.println(eachSet.toString());
//			 			}
//		 
//		 //Get the size of set
//		 System.out.println("Set Size: " + set.size());
//		 System.out.println("---------");
//		 
//		// Compare the Size of list and Set to verify the names are unique
//		 if(elements.size()==(set.size())) {
//			 System.out.println("Train names are matched");
//			}else {
//				System.out.println("Train Names are not matched");
//			}
} }
		