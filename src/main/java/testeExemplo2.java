import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class testeExemplo2 {
    public static void main(String[] args) throws MalformedURLException {
        //Arrange
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"),new ChromeOptions());
        driver.get("https://github.com//");

        //Act
        WebElement marketPlaceButton = driver.findElement(By.xpath("//a[text()='Marketplace']"));
        marketPlaceButton.click();

        //Assert
        WebElement texto = driver.findElement(By.xpath("//h1[text()='Extend GitHub']"));
        System.out.println("Texto encontrado : " + texto.getText());
        assert texto.getText().equals("Extend GitHub");
        driver.quit();
    }
}
