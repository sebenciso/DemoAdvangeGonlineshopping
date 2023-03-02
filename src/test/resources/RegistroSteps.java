public class RegistroSteps extends Steps {
    private WebDriver driver;
    private HomePage homePage;
    private CuentaDetailsPage cuentaDetailsPage;
    private DetallesPersonalesPage detallesPersonalesPage;
    private DireccionPage direccionPage;

    @BeforeScenario
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        cuentaDetailsPage = new CuentaDetailsPage(driver);
        detallesPersonalesPage = new DetallesPersonalesPage(driver);
        direccionPage = new DireccionPage(driver);
    }

    @Given("que el usuario está en la página de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        driver.get("https://www.advantageonlineshopping.com/");
    }

    @When("el usuario hace clic en el botón de usuario")
    public void elUsuarioHaceClicEnElBotonDeUsuario() {
        homePage.clickUserButton();
    }

    @When("el usuario hace clic en $buttonText")
    public void elUsuarioHaceClicEn(String buttonText) {
        cuentaDetailsPage.clickButton(buttonText);
    }

    @When("el usuario completa el formulario de registro con información válida")
    public void elUsuarioCompletaElFormularioDeRegistroConInformacionValida() {
        cuentaDetailsPage.enterUsername("username123");
        cuentaDetailsPage.enterEmail("username123@test.com");
        cuentaDetailsPage.enterPassword("password123");
        cuentaDetailsPage.enterConfirmPassword("password123");

        detallesPersonalesPage.enterFirstName("John");
        detallesPersonalesPage.enterLastName("Doe");
        detallesPersonalesPage.enterPhone("5555555");

        direccionPage.selectCountry("Colombia");
        direccionPage.enterCity("Bogota");
        direccionPage.enterAddress("calle 182 11 55");
        direccionPage.enterState("Cundinamarca");
        direccionPage.enterPostalCode("111111");

        direccionPage.clickCheckboxOffers();
        direccionPage.clickCheckboxConditions();
    }

    @When("el usuario hace clic en el botón de registro")
    public void elUsuarioHaceClicEnElBotonDeRegistro() {
        direccionPage.clickButtonRegister();
    }

   @Then("el usuario debe ser redirigido a la página de inicio de sesión")
   public void elUsuarioDebeSerRedirigidoALaPaginaDeInicioDeSesion() {
   
   // Verificar que la URL de la página actual es la de inicio de sesión
   String currentUrl = driver.getCurrentUrl();
   assertTrue(currentUrl.contains("https://www.advantageonlineshopping.com/account/#/sign-in"));
   
   // Verificar que el mensaje de registro exitoso se muestra
    assertTrue(homePage.isRegistrationSuccessMessageDisplayed());
    
    driver.quit();
}
  
/*
Aquí se puede escribir el archivo JBehave correspondiente que utiliza esta característica de la siguiente manera:

Archivo de pruebas JBehave (RegistroSteps.java).
*/
