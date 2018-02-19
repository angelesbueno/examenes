/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaDomino2 {
  @SuppressWarnings("empty-statement")
  public static void main(String[] args) {
    
    //FichaDomino2 f1 = new FichaDomino2(((int)(Math.random() * 7)), ((int)(Math.random() * 7)));
    FichaDomino2 f1 = new FichaDomino2();
    FichaDomino2 f2 = new FichaDomino2();
    FichaDomino2 f3 = new FichaDomino2();
    FichaDomino2 f4 = new FichaDomino2();
    FichaDomino2 f5 = new FichaDomino2();
    FichaDomino2 f6 = new FichaDomino2();
    FichaDomino2 f7 = new FichaDomino2();
    FichaDomino2 f8 = new FichaDomino2();
    
    f1.setLadoArriba((int)(Math.random() * 7));
    f1.setLadoAbajo((int)(Math.random() * 7));
    f2.setLadoArriba(f1.getLadoAbajo());
    f2.setLadoAbajo((int)(Math.random() * 7));
    f3.setLadoArriba(f2.getLadoAbajo());
    f3.setLadoAbajo((int)(Math.random() * 7));
    f4.setLadoArriba(f3.getLadoAbajo());
    f4.setLadoAbajo((int)(Math.random() * 7));
    f5.setLadoArriba(f4.getLadoAbajo());
    f5.setLadoAbajo((int)(Math.random() * 7));
    f6.setLadoArriba(f5.getLadoAbajo());
    f6.setLadoAbajo((int)(Math.random() * 7));
    f7.setLadoArriba(f6.getLadoAbajo());
    f7.setLadoAbajo((int)(Math.random() * 7));
    f8.setLadoArriba(f7.getLadoAbajo());
    f8.setLadoAbajo((int)(Math.random() * 7));
    
    System.out.print(f1);
    System.out.print(f2);
    System.out.print(f3);
    System.out.print(f4);
    System.out.print(f5);
    System.out.print(f6);
    System.out.print(f7);
    System.out.print(f8);
   
  }
  
}
