package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArticle {

	@FindBy(linkText = "New Article")
	WebElement NewArticleBtn;
	
	@FindBy(name= "title")
	WebElement ArticleName;
	
	@FindBy(name= "description")
	WebElement description;
	
	@FindBy(name= "body")
	WebElement body;

	@FindBy(name= "tags")
	WebElement tags;	
	
	@FindBy(id = "Publish Article")
	WebElement LoginBtn;	
	
	public NewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	  public void NewArticleBtnC() {
		  NewArticleBtn.click();
	  }

	public void validdata(String strTitle, String Strsum , String StrBody, String Strtags) {
		ArticleName.sendKeys(strTitle);
		description.sendKeys(Strsum);
		body.sendKeys(StrBody);
		tags.sendKeys(Strtags);
		LoginBtn.click();
}
}
