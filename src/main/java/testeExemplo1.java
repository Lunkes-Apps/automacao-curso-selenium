import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeExemplo1 {
    public static void main(String[] args) {
        //Arrange
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
