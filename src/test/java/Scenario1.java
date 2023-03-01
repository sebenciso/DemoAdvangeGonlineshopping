Feature: Registro de usuario en Advantage Online Shopping

  Scenario: Registro exitoso de un nuevo usuario
    Given que el usuario se encuentra en la página de inicio de Advantage Online Shopping
    When el usuario hace clic en el botón "Crear cuenta nueva"
    And completa el formulario de registro con los siguientes datos:
      | Nombre de usuario | ejemplo_usuario |
      | Correo electrónico | ejemplo@correo.com |
      | Contraseña | ejemplo1234 |
      | Confirmar contraseña | ejemplo1234 |
      | Nombre | Ejemplo |
      | Apellido | Usuario |
      | Número de teléfono | 123456789 |
      | País | Colombia |
      | Ciudad | Bogotá |
      | Dirección | Calle 123 |
      | Estado/Provincia/Región | Cundinamarca |
      | Código Postal | 111111 |
    And selecciona las opciones de recibir ofertas y promociones exclusivas de Advantage y aceptar las condiciones de uso y aviso de privacidad
    And hace clic en el botón "Registrar"
    Then el usuario debe ver un mensaje de confirmación de registro exitoso.
/*
   Este es un ejemplo genérico de cómo se podría escribir un escenario de registro en Gherkin.
    
*/
    
