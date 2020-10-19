package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class ICD 
{
public ICD() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-users'])[2]")
	public WebElement Manage;

	@FindBy(how = How.ID, using = "Menu_ICDCode")
	public WebElement ICD;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElement Add;
	
	@FindBy(how = How.ID, using = "ICDCodeType")
	public WebElement ICD_codeType;
	
	@FindBy(how = How.ID, using = "ICDCodeName")
	public WebElement ICD_codeName;
	
	@FindBy(how = How.XPATH, using = "//button[@id='Jbtn_Submit']")
	public WebElement ICD_submit;
	
	
	 public static By wait_ICDnum() {return By.id("ICDCodeNumber");}
	 public static By wait_successMsg() {return By.xpath("//div[@class='bootstrap-dialog-message']");}

}
