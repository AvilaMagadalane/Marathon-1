package testCase1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.pvrcinemas.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(2000);
		d.manage().window().maximize();
		//Thread.sleep(2000);
		//hamburger
		d.findElement(By.className("nav-icon")).click();
		d.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(2000);
		Select city=new Select(d.findElement(By.name("city")));
		//Select city = new Select(selectCity);
		city.selectByVisibleText("Chennai");
		Select genre=new Select(d.findElement(By.name("genre")));
		genre.selectByVisibleText("ANIMATION");
		Select language = new Select(d.findElement(By.name("lang")));
		language.selectByVisibleText("ENGLISH");
		d.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
	    d.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("cinemaName")).click();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//select[@id=cinemaName']/option[15]")).click();
		//cinema
		d.findElement(By.xpath("//select//option[15]")).click();
		//name
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("Avila");
		//time
		d.findElement(By.xpath("//select[@name='timings']/option[3]")).click();
		//date
		d.findElement(By.xpath("//div//pvr-datepicker[@id='datepicker-input']")).click();
		
		d.findElement(By.xpath("//div[@class='main-calendar-days']//span[33]")).click();
		//no of tickets
		d.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		//time
	
		//mail id
		d.findElement(By.name("email")).sendKeys("test@gmail.com");
		//mobile number
		d.findElement(By.name("mobile")).sendKeys("9876543299");
		//other Requirements
		d.findElement(By.name("comment")).sendKeys("no");
		//food and beverages
		d.findElement(By.xpath("//select[@name='food']/option[1]")).click();
		//copy to self
		d.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		//d.findElement(By.id("copySelf")).click();
		//send request
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		//cancel opt
		d.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		//close success pop up
		d.findElement(By.className("swal2-close")).click();
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		d.quit();
		

	}

}
