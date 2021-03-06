 /** 
  * Ejercicio 3. Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
    usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5.
  * 
  * @author Ángeles Bueno
 */
 
public class Ex04aba3 {
  public static void main(String[] args) {
  
    System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
    int longitudLado = Integer.parseInt(System.console().readLine());
    int alturaCuadrado = longitudLado;
    int altura = 1;
    int espacios = alturaCuadrado - 4;
    int asteriscos = 1;
    

    if (longitudLado < 5) {

      System.out.print("Lo siento, los datos introducidos no son correctos, ");
      System.out.println(" el valor mínimo para la longitud de los lados es 5.");

    } else {
    
      // Línea superior ////////////////////////////////////////////////////////
        for (int i = 1; i <= longitudLado; i++) {
          System.out.print("*");
        }
        altura ++;  
        System.out.println();
        alturaCuadrado --;
        
        for (int i = 1; i <= longitudLado; i++) {
          System.out.print("*");
        }
        
        altura ++;
        asteriscos ++;  
        System.out.println();
        alturaCuadrado --;
        
        // Parte intermedia
        
        while (altura <= alturaCuadrado) {
        
          for (int i = 1; i <= asteriscos; i++) {
            System.out.print("*");
          }
          
          for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
          
          }
          
          for (int i = 1; i <= asteriscos; i++) {
            System.out.print("*");
          }
          
          System.out.println();
          altura ++;
          
        }
        
        altura ++;
        alturaCuadrado --;
        asteriscos --;
        
        for (int i = 1; i <= longitudLado; i++) {
          System.out.print("*");
        }
        altura ++;  
        System.out.println();
        alturaCuadrado --;
        
        for (int i = 1; i <= longitudLado; i++) {
          System.out.print("*");
        }
        
        altura ++;
        asteriscos ++;  
        System.out.println();
        alturaCuadrado --;
        
      }
    
  }
} 


