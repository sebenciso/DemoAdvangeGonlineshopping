public class LoginPage {
    private WebDriver driver;

    @FindBy(linkText = "¿YA TIENES UNA CUENTA?")
    private WebElement alreadyHaveAnAccountLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlreadyHaveAnAccountLink() {
        alreadyHaveAnAccountLink.click();
    }
}
/*
En esta clase, se utiliza la anotación @FindBy para encontrar el elemento HTML del hipervínculo utilizando el texto del enlace.
Luego, se define el método clickAlreadyHaveAnAccountLink() para hacer clic en el hipervínculo.
*/
