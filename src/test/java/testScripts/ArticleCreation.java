package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.NewArticle;

public class ArticleCreation {
	  WebDriver driver;
	  LoginPage LoginPage;
	  NewArticle NewArticlepage;

  
	  public ArticleCreation() {
	
		  TestBase.initdriver();
		  driver = TestBase.getDriver();
		  LoginPage = new LoginPage(driver);
		  NewArticlepage = new NewArticle(driver);
	  }
@Test
	  public void setup() {
		  TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
		  LoginPage.validLogin("divi.divyalakshmi3@gmail.com", "Divya@22");
		  NewArticlepage.NewArticleBtnC();
	  }

@Test
public void createarticle(){
	NewArticlepage.validdata("Selenium's Syperpowers: Why it Stands out",
			"Fun Facts About Selenium", 
			"Selenium is like a hero on a quest to save the user eperience from bugs and glitches", "Selenium");
}
}
