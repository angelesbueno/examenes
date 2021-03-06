 /**
  * 
  * 
  * Gusano. El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
    encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
    el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
  * 
  * 
 * @author Ángeles Bueno
 */
 
public class Gusano {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine()); //
    
    int numeroNuevo = 0;
    int volteado = 0;
    boolean esComido = false;
    
    while (numeroIntroducido >= 1) {
      
      if (((numeroIntroducido % 10) == 0) || ((numeroIntroducido % 10) == 8)) {
        numeroIntroducido = numeroIntroducido / 10;
        esComido = true;
      
      } else {
        numeroNuevo = numeroNuevo + numeroIntroducido % 10;
        numeroNuevo = numeroNuevo * 10;
        numeroIntroducido = numeroIntroducido / 10;
      }
    }
    numeroNuevo = numeroNuevo / 10;
    
    while (numeroNuevo > 0) {
        
      volteado = (volteado * 10) + (numeroNuevo % 10);

      numeroNuevo/= 10;
    }
    
    if (esComido) {
      
      System.out.print("Después de haber sido comido por el gusano numérico se queda en " + volteado);
    
    } else {
      
      System.out.print("El gusano numérico no se ha comido ningún dígito.");
    }
    
    
  }
}
      
        
    
    
      
    
