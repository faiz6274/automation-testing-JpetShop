package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.FactoryPageBird;
import helper.Browser;





public class TestFactory {
   FactoryPageBird obj;
   WebDriver driver;
   String baseUrl = "https://petstore.octoperf.com/actions/Catalog.action";



   @BeforeTest
   /*before test is for verifying which browser is opened and passing the baseUrl
   to the corresponding browser from the "Browser" class*/
   public void setUp() {
       driver = Browser.StartBrowser("eb", baseUrl);
   }
   
   @Test(priority=1)
   public void RegisterNewID() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
	   FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
	   //This is to click the sigin button in the JpetStore
       obj.stSignin();
       //This is to clicking register button in sigin page
       obj.stRegisterID();
       //We are entering all details of the user in the corresponding text box
       obj.stuname("User91");
       obj.stpsw("user123");
       obj.strpsw("user123");
       obj.stfname("USER");
       obj.stlname("ID");
       obj.stemail("USER@GMAIL.COM");
       obj.stph("1234123412");
       obj.stad1("2E");
       obj.stad2("Palika Bazaar");
       obj.stcity("Delhi");
       obj.ststate("Delhi");
       obj.stzip("demo");
       obj.stcountry("Demo");
       obj.stfcat();
       obj.stLop();
       obj.stBop();
       //This is to save the account details
       obj.stSA();
   }
 //Sign in
   @Test(priority=2)
   public void Sigin() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //This is to click the sigin button in the JpetStore
       obj.stSignin();
       //Entering the user name and password which was created in the "priority 1"
       obj.stuname("User91");
       driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
       obj.stpsw("user123");
       //Clicking the login button to login the account
       obj.stlogin();
   }
   
  // Selecting fish for Order
   @Test(priority=3)
   public void FishOrder() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //clicking the fish icon in the screen to get into the fish breads
       obj.stFishes();
       //Selecting Angelfish
       obj.stAngelfish();
       obj.stLargeAngelfish();
       obj.stATCLargeAngelfish();
       driver.navigate().back();
       driver.navigate().back();
       obj.stATCSmallAngelfish();
       //Returning to the main menu
       obj.stRTMM();
       //Selecting Tiger Shark
       obj.stFishes();
       obj.stTigerShark();
       obj.stATCTLTS();
       //Returning to the main menu
       obj.stRTMM();
       //Selecting Koi fish
       obj.stFishes();
       obj.stKoi();
       obj.stATCSEDK();
       driver.navigate().back();
       obj.stATCSLSK();
       //Returning to the main menu
       obj.stRTMM();
       //Selecting GoldFish
       obj.stFishes();
       obj.stGoldFish();
       obj.stATCMGF();
       driver.navigate().back();
       obj.stATCFGF();
       //Returning to the main menu
       obj.stRTMM();
 }
 //Selecting dogs for order
   @Test(priority=4)
   public void DogOrder() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //clicking the Dogs icon in the screen to get into the dog breads
       obj.stDog();
       //Selecting Bulldogs
       obj.stBulldog();
       obj.stATCMaleAdultBulldog();
       driver.navigate().back();
       obj.stATCFemalePuppyBulldog();
       //Returning to the main menu
       obj.stRTMM();
       obj.stDog();
       //Selecting Poodle dogs
       obj.stPoodle();
       obj.stATCMalePuppyPoodle();
       //Returning to the main menu
       obj.stRTMM();
       obj.stDog();
       //Selecting Dalmation dods
       obj.stDalmation();
       obj.stATCSpotlessMalePuppyDalmation();
       driver.navigate().back();
       obj.stATCSpottedAdultFemaleDalmation();
       //Returning to the main menu
       obj.stRTMM();
       obj.stDog();
       //Selecting GoldenRetriever dogs
       obj.stGoldenRetriever();
       obj.stATCAdultFemaleGoldenRetriever();
       //Returning to the main menu
       obj.stRTMM();
       obj.stDog();
       //Selecting LabradorRetriever dogs
       obj.stLabradorRetriever();
       obj.stATCAdultMaleLabradorRetriever();
       driver.navigate().back();
       obj.stATCAdultFemaleLabradorRetriever();
       driver.navigate().back();
       obj.stATCAdultMaleLabradorRetriever1();
       driver.navigate().back();
       obj.stATCAdultFemaleLabradorRetriever1();
       //Returning to the main menu
       obj.stRTMM();
       obj.stDog();
       //Selecting Chihuahua dogs
       obj.stChihuahua();
       obj.stATCAdultMaleChihuahua();
       driver.navigate().back();
       obj.stATCAdultFemaleChihuahua();
       //Returning to the main menu
       obj.stRTMM();





   }
   
   
   //selecting cat for order
   @Test(priority = 5)
   public void CatOrders() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //clicking the Cats icon in the screen to get into the cat breads
       obj.stCat();
       //Selecting Manx cats
       obj.stManx();
       obj.stATCTaillessManx();
       //Back to the Manx page
       driver.navigate().back();
       obj.stATCWithtailManx();
       //Returning to the main menu
       obj.stRTMM();
       obj.stCat();
       //Selecting Persian cats
       obj.stPersian();
       obj.stATCAduleFemalePersian();
       driver.navigate().back();
       obj.stATCAdultMalePersian();
       //Returning to the main menu
       obj.stRTMM();



   }
 //selecting reptiles for order
   @Test(priority = 6)
   public void ReptilesOrder() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //clicking the Reptiles icon in the screen to get into the reptiles breads
       obj.stReptiles();
       //Selecting Rattlesnake 
       obj.stRattlesnake();
       obj.stATCVenomlessRattlesnake();
       //Returning to the main menu
       obj.stRTMM();
       obj.stReptiles();
       //electing Iguana snakes
       obj.stIguana();
       obj.stATCGreenAdultIguana();
       //Returning to the main menu
       obj.stRTMM();
   }
   //selecting birds for order
   @Test(priority = 7)
   public void BirdsOrder() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //clicking the Birds icon in the screen to get into the bird breads
       obj.stBirds();
       //Selecting AmazonParrot
       obj.stAmazonParrot();
       obj.stATCAdultMaleAmazonParrot();
       //Returning to the main menu
       obj.stRTMM();
       obj.stBirds();
       //Selecting Finch bird
       obj.stFinch();
       obj.stATCAdultMaleFinch();
       //Returning to the main menu
       obj.stRTMM();



   }
 
//Completing order
   @Test(priority = 8)
   public void CompleteOrdering() {
	   //Getting the values from the "FactoryPageBird" class as "obj" object in this class
       FactoryPageBird obj = PageFactory.initElements(driver,FactoryPageBird.class);
       //Clicking cart icon in the top of the page
       obj.stCart();
       //Clicking on ProceedToCheckout button to complete the order
       obj.stProceedToCheckout();
       //Verifying the details and clicking continue button
       obj.stProcessContinue();
       //Confirming the order place ment
       obj.stConform();
       //Getting the line of order place form the page
       String title = driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li")).getText();
       String actualTitle = "Thank you, your order has been submitted.";
       Assert.assertEquals(actualTitle, title);
       //Printing the line in the output
       System.out.println(title);
   }

   @AfterTest
   public void tearDown() {
	  //Closing the browser
      driver.quit();
   }






}