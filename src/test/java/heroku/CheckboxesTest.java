//package heroku;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import pages.heroku.HyperlinkPage;
//import pages.heroku.MoatazeldebsyPage;
//import pages.heroku.checkboxPage;
//import utils.Browser;
//
//import static utils.Browser.openBrowser;
//import static utils.Browser.quit;
//
//public class CheckboxesTest {
//    checkboxPage checkboxPage;
//    MoatazeldebsyPage moatazeldebsyPage;
//    @BeforeClass
//    void setup() {
//        openBrowser("chrome");
//        checkboxPage = new checkboxPage();
//        moatazeldebsyPage = new MoatazeldebsyPage();
//    }
//
//    @Test
//    void tc02() {
//        /*Checkboxes Check to a box
//        Open prowser
//        Navigate to https://the-internet.herokuapp.com/checkboxes
//        Check on checkbox1
//        Verify checkbox is checked
//        Check on checkbox2
//        Verify checkbox2 is checked*/
//        checkboxPage.open();
//
//        checkboxPage.check("1");
//        Assert.assertTrue(checkboxPage.isChecked("1"));
//
//        checkboxPage.check("3");
//        Assert.assertTrue(checkboxPage.isChecked("3"));
//    }
//
//    @Test
//    void theCheckboxesShouldSelected() {
//        checkboxPage.open();
//        checkboxPage.select("1");
//        Assert.assertTrue(checkboxPage.isSelected("1"));
//        checkboxPage.select("2");
//        Assert.assertTrue(checkboxPage.isSelected("2"));
//    }
//    @Test
//    void theCheckboxesShouldDeselected() {
//        checkboxPage.open();
//        checkboxPage.unselect("1");
//        Assert.assertFalse (checkboxPage.isSelected("1"));
//        checkboxPage.unselect("2");
//        Assert.assertFalse(checkboxPage.isSelected("2"));
//    }
//
//    @Test
//    void verifyUncheckAllButtonWorking() {
//        openBrowser("chrome");
//        MoatazeldebsyPage moatazeldebsyPage = new MoatazeldebsyPage();
//        moatazeldebsyPage.open();
//        moatazeldebsyPage.checkAll();
//        Assert.assertTrue(moatazeldebsyPage.isChecked("1"));
//        Assert.assertTrue(moatazeldebsyPage.isChecked("2"));
//        Assert.assertTrue(moatazeldebsyPage.isChecked("3"));
//    }
//
//    @Test
//    void verifyUncheckAllButtonWorking() {
//        moatazeldebsyPage.open();
//        moatazeldebsyPage.uncheckAll();
//        Assert.assertFalse(moatazeldebsyPage.isChecked("1"));
//        Assert.assertFalse(moatazeldebsyPage.isChecked("2"));
//        Assert.assertFalse(moatazeldebsyPage.isChecked("3"));
//    }
//
//    @AfterClass
//    void teardown() {
//        Browser.quit();
//    }
//}