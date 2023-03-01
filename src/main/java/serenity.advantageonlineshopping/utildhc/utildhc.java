import org.openqa.selenium.WebElement;

public class UtilDHC {
    
    public static void limpiarTexto(WebElement elemento) {
        elemento.clear();
    }
    
    public static void escribirTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }
    
    public static void hacerClick(WebElement elemento) {
        elemento.click();
    }
    
    public static boolean estaVisible(WebElement elemento) {
        return elemento.isDisplayed();
    }
    
    public static boolean estaHabilitado(WebElement elemento) {
        return elemento.isEnabled();
    }
    
    public static String obtenerTexto(WebElement elemento) {
        return elemento.getText();
    }
    
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
El código proporciona una clase UtilDHC en Java que contiene un método estático generarNumeroAleatorio(int min, int max) 
que genera un número entero aleatorio dentro de un rango determinado. 
Este método puede ser utilizado en pruebas de automatización de software para generar datos aleatorios como nombres de usuario, contraseñas, correos electrónicos
*/
