package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class FactoryPageBird {
    WebDriver driver;
    @FindBy(xpath="//*[@id=\"MenuContent\"]/a[2]") WebElement Signin;
    @FindBy(xpath="//*[@id=\"Catalog\"]/a") WebElement RegisterID;
    @FindBy(name="username") WebElement uname;
    @FindBy(name="password") WebElement psw;
    @FindBy(name="repeatedPassword") WebElement rpsw;
    @FindBy(name="account.firstName") WebElement fname;
    @FindBy(name="account.lastName") WebElement lname;
    @FindBy(name="account.email") WebElement email;
    @FindBy(name="account.phone") WebElement ph;
    @FindBy(name="account.address1") WebElement ad1;
    @FindBy(name="account.address2") WebElement ad2;
    @FindBy(name="account.city") WebElement city;
    @FindBy(name="account.state") WebElement state;
    @FindBy(name="account.zip") WebElement zip;
    @FindBy(name="account.country") WebElement country;
    @FindBy(name="account.listOption") WebElement Lop;
    @FindBy(name="account.bannerOption") WebElement Bop;
    @FindBy(xpath="//*[@id=\"Catalog\"]/form/input") WebElement SA;
    @FindBy(xpath="//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[2]") WebElement fcat1;
    @FindBy(name="signon") WebElement Login;
  //fish
    @FindBy(xpath="//*[@id=\"SidebarContent\"]/a[1]/img") WebElement Fishes;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement Angelfish;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement LargeAngelfish;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")    WebElement ATCLargeAngelfish;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement SmallAngelfish;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCSmallAngelfish;
    @FindBy(xpath="//*[@id=\"BackLink\"]/a") WebElement RTMM;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a") WebElement TigerShark;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a") WebElement Koi;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a") WebElement GoldFish;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCTLTS;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCSEDK;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCSLSK;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCMGF;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCFGF;
  //Dog
    @FindBy(xpath="//*[@id=\"SidebarContent\"]/a[2]/img") WebElement Dog;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement Bulldog;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCMaleAdultBulldog;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCFemalePuppyBulldog;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a") WebElement Poodle;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCMalePuppyPoodle;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a") WebElement Dalmation;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCSpotlessMalePuppyDalmation;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCSpottedAdultFemaleDalmation;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a") WebElement GoldenRetriever;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAdultFemaleGoldenRetriever;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a")WebElement LabradorRetriever;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAdultMaleLabradorRetriever;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCAdultFemaleLabradorRetriever;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[5]/a") WebElement ATCAdultMaleLabradorRetriever1;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[5]/a") WebElement ATCAdultFemaleLabradorRetriever1;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a") WebElement Chihuahua;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAdultMaleChihuahua;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCAdultFemaleChihuahua;
//Reptiles
    @FindBy(xpath="//*[@id=\"SidebarContent\"]/a[4]/img") WebElement Reptiles;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement Rattlesnake;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCVenomlessRattlesnake;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCRattlelessRattlesnake;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a") WebElement Iguana;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCGreenAdultIguana;
//Birds
    @FindBy(xpath="//*[@id=\"SidebarContent\"]/a[5]/img") WebElement Birds;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement AmazonParrot;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAdultMaleAmazonParrot;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a") WebElement Finch;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAdultMaleFinch;
  //Cat
    @FindBy(xpath="//*[@id=\"SidebarContent\"]/a[3]/img") WebElement Cat;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a") WebElement Manx;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCTaillessManx;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCWithtailManx;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a") WebElement Persian    ;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a") WebElement ATCAduleFemalePersian;
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a") WebElement ATCAdultMalePersian;   
  //CompleteOrdering
    @FindBy(xpath="//*[@id=\"MenuContent\"]/a[1]/img") WebElement Cart;   
    @FindBy(xpath="//*[@id=\"Cart\"]/a") WebElement ProceedToCheckout;   
    @FindBy(xpath="//*[@id=\"Catalog\"]/form/input") WebElement ProcessContinue;   
    @FindBy(xpath="//*[@id=\"Catalog\"]/a") WebElement Conform;   
    
  //Completind Order
    public void stCart() {
        Cart.click();
    }
    public void stProceedToCheckout() {
        ProceedToCheckout.click();
    }
    public void stProcessContinue() {
        ProcessContinue.click();
    }
    public void stConform() {
        Conform.click();
    }





//Registration   
    public void stSignin() {
        Signin.click();
    }
    public void stRegisterID() {
        RegisterID.click();
    }
    public void stuname(String Uname) {
        uname.sendKeys(Uname);
    }
    public void stpsw(String Psw) {
        psw.sendKeys(Psw);
    }
    public void strpsw(String rPsw) {
        rpsw.sendKeys(rPsw);
    }
    public void stfname(String Fname) {
        fname.sendKeys(Fname);
    }
    public void stlname(String Lname) {
        lname.sendKeys(Lname);
    }
    public void stemail(String Email) {
        email.sendKeys(Email);
    }
    public void stph(String Ph) {
        ph.sendKeys(Ph);
    }
    public void stad1(String Ad1) {
        ad1.sendKeys(Ad1);
    }
    public void stad2(String Ad2) {
        ad2.sendKeys(Ad2);
    }
    public void stcity(String City) {
        city.sendKeys(City);
    }
    public void ststate(String State) {
        state.sendKeys(State);
    }
    public void stzip(String Zip) {
        zip.sendKeys(Zip);
    }
    public void stcountry(String Country) {
        country.sendKeys(Country);
    }
    public void stfcat() {
        fcat1.click();
    }
    public void stLop() {
        Lop.click();
    }
    public void stBop() {
        Bop.click();
    }
    public void stSA() {
        SA.click();
    }
    public void stlogin() {
        Login.click();
    }

//Fish method
    public void stFishes() {
        Fishes.click();
    }
    public void stAngelfish() {
        Angelfish.click();
    }
    public void stLargeAngelfish() {
        LargeAngelfish.click();
    }
    public void stATCLargeAngelfish() {
        ATCLargeAngelfish.click();
    }
    public void stATCSmallAngelfish() {
        ATCSmallAngelfish.click();
    }
    public void stRTMM() {
        RTMM.click();
    }
    public void stTigerShark() {
        TigerShark.click();
    }
    public void stKoi() {
        Koi.click();
    }
    public void stGoldFish() {
        GoldFish.click();
    }
    public void stATCTLTS() {
        ATCTLTS.click();
    }
    public void stATCSEDK() {
        ATCSEDK.click();
    }
    public void stATCSLSK() {
        ATCSLSK.click();
    }
    public void stATCMGF() {
        ATCMGF.click();
    }
    public void stATCFGF() {
        ATCFGF.click();
    }

 

 

    
    //Dog method

    public void stDog() {
       Dog.click();
    }
    public void stBulldog() {
        Bulldog.click();
    }
    public void stATCMaleAdultBulldog() {
        ATCMaleAdultBulldog.click();
    }
    public void stATCFemalePuppyBulldog() {
        ATCFemalePuppyBulldog.click();
    }
    public void stPoodle() {
        Poodle.click();
    }
    public void stATCMalePuppyPoodle() {
        ATCMalePuppyPoodle.click();
    }
    public void stDalmation() {
        Dalmation.click();
    }
    public void stATCSpotlessMalePuppyDalmation() {
        ATCSpotlessMalePuppyDalmation.click();
    }
    public void stATCSpottedAdultFemaleDalmation() {
        ATCSpottedAdultFemaleDalmation.click();
    }
    public void stGoldenRetriever() {
        GoldenRetriever.click();
    }
    public void stATCAdultFemaleGoldenRetriever() {
        ATCAdultFemaleGoldenRetriever.click();
    }

    public void stLabradorRetriever() {
        LabradorRetriever.click();
    }
    public void stATCAdultMaleLabradorRetriever() {
        ATCAdultMaleLabradorRetriever.click();
    }
    public void stATCAdultFemaleLabradorRetriever() {
        ATCAdultFemaleLabradorRetriever.click();
    }
    public void stATCAdultMaleLabradorRetriever1() {
        ATCAdultMaleLabradorRetriever1.click();
    }
    public void stATCAdultFemaleLabradorRetriever1() {
        ATCAdultFemaleLabradorRetriever1.click();
    }

    public void stChihuahua() {
        Chihuahua.click();
    }
    public void stATCAdultMaleChihuahua() {
        ATCAdultMaleChihuahua.click();
    }
    public void stATCAdultFemaleChihuahua() {
        ATCAdultFemaleChihuahua.click();
    }


  //Reptile method
    public void stReptiles() {
        Reptiles.click();
    }
    public void stRattlesnake() {
        Rattlesnake.click();
    }
    public void stATCVenomlessRattlesnake() {
        ATCVenomlessRattlesnake.click();
    }
    public void stATCRattlelessRattlesnake() {
        ATCAdultMaleChihuahua.click();
    }
    public void stIguana() {
        Iguana.click();
    }
    public void stATCGreenAdultIguana() {
        ATCGreenAdultIguana.click();
    }

   //Bird method
    public void stBirds() {
        Birds.click();
    }
    public void stAmazonParrot() {
        AmazonParrot.click();
    }
    public void stATCAdultMaleAmazonParrot() {
        ATCAdultMaleAmazonParrot.click();
    }
    public void stFinch() {
        Finch.click();
    }
    public void stATCAdultMaleFinch() {
        ATCAdultMaleFinch.click();
    }



//Cat method   
    public void stCat() {
        Cat.click();
    }
    public void stManx() {
        Manx.click();
    }

    public void stATCTaillessManx() {
        ATCTaillessManx.click();
    }
    public void stATCWithtailManx() {
        ATCWithtailManx.click();
    }
    public void stPersian() {
        Persian.click();
    }
    public void stATCAduleFemalePersian() {
        ATCAduleFemalePersian.click();
    }
    public void stATCAdultMalePersian() {
        ATCAdultMaleFinch.click();
    }

}


 