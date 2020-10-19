package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class Login {

public Login() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.ID, using = "Username")
	public WebElement userName;

	@FindBy(how = How.ID, using = "Password")
	public WebElement Password;

	
	  
	  public static By wait_signIn() {return By.xpath("//button[@title='Sign in']");}

}
