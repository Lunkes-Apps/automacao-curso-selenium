import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class testeExemplo3 {
    public static void main(String[] args) throws MalformedURLException {
        //Arrange
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
        driver.get("https://github.com//");
        WebElement marketPlaceButton = driver.findElement(By.xpath("//a[text()='Marketplace']"));

        //Act
        marketPlaceButton.click();

        //Assert
        WebElement texto = driver.findElement(By.xpath("//h1[text()='Extend GitHub']"));
        System.out.println("Texto encontrado : " + texto.getText());
        assert texto.getText().equals("Extend GitHub");
        driver.quit();
    }
}
