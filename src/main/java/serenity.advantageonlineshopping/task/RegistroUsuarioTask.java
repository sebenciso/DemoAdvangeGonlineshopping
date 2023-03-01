public class RegistroUsuarioTask implements Task {

    private String usuario;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private String country;
    private String city;
    private String address;
    private String state;
    private String postalCode;

    public RegistroUsuarioTask(String usuario, String email, String password, String firstName, String lastName,
            String phone, String country, String city, String address, String state, String postalCode) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }

    public static RegistroUsuarioTask conInfo(String usuario, String email, String password, String firstName,
            String lastName, String phone, String country, String city, String address, String state,
            String postalCode) {
        return instrumented(RegistroUsuarioTask.class, usuario, email, password, firstName, lastName, phone, country,
                city, address, state, postalCode);
    }

    @Step("{0} se registra en la página de Advantage Online Shopping")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_USER),
                Click.on(HomePage.BUTTON_CREATE_NEW_ACCOUNT),
                Enter.theValue(usuario).into(CuentaDetailsPage.USERNAME_FIELD),
                Enter.theValue(email).into(CuentaDetailsPage.EMAIL_FIELD),
                Enter.theValue(password).into(CuentaDetailsPage.PASSWORD_FIELD),
                Enter.theValue(password).into(CuentaDetailsPage.CONFIRM_PASSWORD_FIELD),
                Enter.theValue(firstName).into(DetallesPersonalesPage.FIRST_NAME_FIELD),
                Enter.theValue(lastName).into(DetallesPersonalesPage.LAST_NAME_FIELD),
                Enter.theValue(phone).into(DetallesPersonalesPage.PHONE_FIELD),
                Click.on(DireccionPage.COUNTRY_DROPDOWN),
                Click.on(DireccionPage.selectCountry(country)),
                Enter.theValue(city).into(DireccionPage.CITY_FIELD),
                Enter.theValue(address).into(DireccionPage.ADDRESS_FIELD),
                Enter.theValue(state).into(DireccionPage.STATE_FIELD),
                Enter.theValue(postalCode).into(DireccionPage.POSTAL_CODE_FIELD),
                Click.on(DireccionPage.CHECKBOX_OFFERS),
                Click.on(DireccionPage.CHECKBOX_CONDITIONS),
                Click.on(DireccionPage.BUTTON_REGISTER));
    }
}

/*
Aquí está el código completo para automatizar el registro en la página de Advantage Online Shopping utilizando Serenity y el patrón de diseño Screenplay. 
Se ha creado una clase llamada "RegistroUsuarioTask" que implementa la interfaz Task, que permite modelar la acción de registro como una tarea única y coherente.
*/
