public class RegisterPage {
    private WebDriver driver;

    @FindBy(name = "usernameRegisterPage")
    private WebElement usernameInput;

    @FindBy(name = "emailRegisterPage")
    private WebElement emailInput;

    @FindBy(name = "passwordRegisterPage")
    private WebElement passwordInput;

    @FindBy(name = "confirm_passwordRegisterPage")
    private WebElement confirmPasswordInput;

    @FindBy(name = "first_nameRegisterPage")
    private WebElement firstNameInput;

    @FindBy(name = "last_nameRegisterPage")
    private WebElement lastNameInput;

    @FindBy(name = "phone_numberRegisterPage")
    private WebElement phoneNumberInput;

    @FindBy(name = "countryListboxRegisterPage")
    private WebElement countrySelect;

    @FindBy(name = "cityRegisterPage")
    private WebElement cityInput;

    @FindBy(name = "addressRegisterPage")
    private WebElement addressInput;

    @FindBy(name = "state_/_province_/_regionRegisterPage")
    private WebElement stateInput;

    @FindBy(name = "postal_codeRegisterPage")
    private WebElement postalCodeInput;

    @FindBy(name = "i_agree")
    private WebElement iAgreeCheckbox;

    @FindBy(id = "register_btnundefined")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
}

/*
Crear una clase PageObject para la página de registro (RegisterPage) que contenga los elementos web y los métodos necesarios para interactuar con la UserInterface

*/
