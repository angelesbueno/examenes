package ejercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class FichaDomino2 {
  
  // atributos
  
  private int ladoArriba;
  private int ladoAbajo;
  
  // constructor

  public FichaDomino2() {
    
  }
  
  // setter

  public void setLadoArriba(int ladoArriba) {
    this.ladoArriba = ladoArriba;
  }

  public void setLadoAbajo(int ladoAbajo) {
    this.ladoAbajo = ladoAbajo;
  }
  
  // getter 

  public int getLadoArriba() {
    return ladoArriba;
  }

  public int getLadoAbajo() {
    return ladoAbajo;
  }
  
  // toString

  @Override
  public String toString() {
    String ladoArribaString = Integer.toString(ladoArriba);
    String ladoAbajoString = Integer.toString(ladoAbajo);
    if (ladoArriba == 0) {
      ladoArribaString = " ";
    }
    if (ladoAbajo == 0) {
      ladoAbajoString = " ";
    }
    return "[" + ladoArribaString + "|" + ladoAbajoString + "]";
  }
  
  // método voltea
  
  /*public FichaDomino2 voltea() {
    return new FichaDomino2(this.ladoAbajo,this.ladoArriba);
  }
  */
  // método encaja
  
  public boolean encaja(FichaDomino2 ficha2) {
    
    boolean encaja = false;
    
    if ((this.ladoArriba == ficha2.getLadoArriba()) || (this.ladoArriba == ficha2.getLadoAbajo()) 
      || (this.ladoAbajo == ficha2.getLadoArriba()) || (this.ladoAbajo == ficha2.getLadoAbajo())) {
      encaja = true;  
    }
    if (encaja) {
      return true;
    }
    return false;
  }
  
  
  
  
}
