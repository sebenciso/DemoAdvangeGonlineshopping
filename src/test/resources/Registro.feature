Feature: Registro de usuario en Advantage Online Shopping
  Como usuario
  Quiero registrarme en el sitio de Advantage Online Shopping
  Para poder comprar productos

  Scenario: Registro exitoso
    Given que el usuario está en la página de inicio
    When el usuario hace clic en el botón de usuario
    And el usuario hace clic en "CREATE NEW ACCOUNT"
    And el usuario completa el formulario de registro con información válida
    And el usuario hace clic en el botón de registro
    Then el usuario debe ser redirigido a la página de inicio de sesión
/*
Aquí hay un ejemplo de un archivo de características Cucumber en formato .feature que contenga el escenario 1.
*/
