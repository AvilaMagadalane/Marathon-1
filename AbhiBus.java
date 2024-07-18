package testCase1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.abhibus.com/");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		d.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		d.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banga");
		//WebElement to = d.findElement(By.xpath("//div[@id='search-to']//div[text()='Bengaluru']"));
		//to.click();
		d.findElement(By.xpath("//div[@id='search-to']//div[text()='Bangalore']")).click();
		d.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		//Thread.sleep(2000);
		//Name of First bus
		WebElement service = d.findElement(By.xpath("(//div[@id='service-cards-container']/div)[1]//h5"));
		System.out.println("First resulting bus: "+service.getText());
		Thread.sleep(2000);
		//SLEEPER
		d.findElement(By.xpath("(//div[@id='seat-filter-bus-type']//a)[4]")).click();
		//seat count
		WebElement seatsAvailable=d.findElement(By.xpath("(//div[@id='service-cards-container']/div)[1]//div[@class='text-grey'][1]"));
	    System.out.println(seatsAvailable.getText());
	   //available seat
	    d.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
	    //select seat
	    d.findElement(By.xpath("//button[@class='seat sleeper']")).click();
	    //Check box
	    d.findElement(By.xpath("(//div[@id='place-container']//input[@type='checkbox'])[1]")).click();
	    d.findElement(By.xpath("(//div[@id='place-container']//input[@type='checkbox'])[1]")).click();
	    //Seat selected and total fee
	    WebElement seatSelected=d.findElement(By.xpath("(//div[@id='seating-selected-seat-details']/span)[1]"));
	    System.out.println(seatSelected.getText());
	    WebElement totalFare = d.findElement(By.xpath("(//div[@id='seating-selected-seat-details']/span)[2]"));
	    System.out.println(totalFare.getText());
		System.out.println("Title of the page: "+d.getTitle());
		Thread.sleep(2000);
		//d.quit();

	}

}
