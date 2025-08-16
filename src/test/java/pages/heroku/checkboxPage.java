//package pages.heroku;
//
//import org.openqa.selenium.By;
//
//import static utils.Browser.*;
//
//public class checkboxPage {
//    public void open() {
//        // Open the checkbox page
//        visit("https://the-internet.herokuapp.com/checkboxes");
//    }
//
//    public void check(String checkboxName) {
//        if (!isSelected(By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", checkboxName)))) {
//            click(By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", checkboxName)));
//        }
//    }
//
//    public void uncheck(String checkboxName) {
//        if (!isSelected(By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", checkboxName)))) {
//            click(By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", checkboxName)));
//        }
//    }
//
//    public boolean isChecked(String checkboxName) {
//        return isSelected(By.cssSelector(String.format("form#checkboxes input:nth-child(s)", checkboxName)));
//    }
//
//    public void select(String number) {
//        By checkboxLocator = By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", number));
//        if (!isSelected(number)) {
//            click(checkboxLocator);
//        }
//    }
//
//    public void unselect(String number) {
//        By checkboxLocator = By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", number));
//        if (isSelected(number)) {
//            click(checkboxLocator);
//        }
//    }
//
//    public boolean isSelected(String number) {
//        By checkboxLocator = By.cssSelector(String.format("form#checkboxes input:nth-child(%s)", number));
//        return isSelected(checkboxLocator);
//    }
//}