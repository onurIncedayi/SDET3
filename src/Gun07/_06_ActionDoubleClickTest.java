package Gun07;

import Ultils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        Bekle(2);

        WebElement element =driver.findElement(By.id("doubleClickBtn"));

        Actions aksiyonlar=new Actions(driver);
        Action aksyion=aksiyonlar.moveToElement(element).doubleClick().build();
        aksyion.perform();

        Bekle(6);
        BekleKapat();
    }
}
