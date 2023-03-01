import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class CreateNewUser {

    @Test
    public void createNewUserTest() {
        // Configurar el driver de Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Navegar a la página de inicio
        driver.get("https://www.advantageonlineshopping.com/#/");
        
        // Hacer clic en el botón user
        WebElement userButton = driver.findElement(By.xpath("//*[@id=\"menuUserSVGPath\"]"));
        userButton.click();
        
        // Hacer clic en el botón Crear Usuario Nuevo
        WebElement createNewUserButton = driver.findElement(By.xpath("//a[@translate='CREATE_NEW_ACCOUNT']"));
        createNewUserButton.click();
        
        // Llenar el formulario de registro
        WebElement usernameField = driver.findElement(By.name("usernameRegisterPage"));
        usernameField.sendKeys("myUsername");
        
        WebElement emailField = driver.findElement(By.name("emailRegisterPage"));
        emailField.sendKeys("myEmail@mail.com");
        
        WebElement passwordField = driver.findElement(By.name("passwordRegisterPage"));
        passwordField.sendKeys("myPassword");
        
        WebElement confirmPasswordField = driver.findElement(By.name("confirm_passwordRegisterPage"));
        confirmPasswordField.sendKeys("myPassword");
        
        WebElement firstNameField = driver.findElement(By.name("first_nameRegisterPage"));
        firstNameField.sendKeys("John");
        
        WebElement lastNameField = driver.findElement(By.name("last_nameRegisterPage"));
        lastNameField.sendKeys("Doe");
        
        WebElement phoneNumberField = driver.findElement(By.name("phone_numberRegisterPage"));
        phoneNumberField.sendKeys("1234567890");
        
        WebElement countryField = driver.findElement(By.name("countryListboxRegisterPage"));
        countryField.sendKeys("United States");
        
        WebElement cityField = driver.findElement(By.name("cityRegisterPage"));
        cityField.sendKeys("New York");
        
        WebElement addressField = driver.findElement(By.name("addressRegisterPage"));
        addressField.sendKeys("123 Main St.");
        
        WebElement stateField = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
        stateField.sendKeys("NY");
        
        WebElement postalCodeField = driver.findElement(By.name("postal_codeRegisterPage"));
        postalCodeField.sendKeys("10001");
        
        // Hacer clic en el botón de registro
        WebElement registerButton = driver.findElement(By.id("register_btnundefined"));
        registerButton.click();
        
        // Validar que el usuario ha sido creado correctamente
        WebElement welcomeMessage = driver.findElement(By.xpath("//span[contains(text(), 'Hi,')]"));
        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Hi, John";
        assert actualMessage.contains(expectedMessage);
        
        // Cerrar el navegador
        driver.quit();
    }
}

/*
Aquí está el código completo de la clase para realizar el registro de un nuevo usuario en la página de AdvantageOnlineShopping:
}*/
