package calculadoranb;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Abraham
 */
public class Calculadora {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Object repetir = null;
    //vamos a pedir los números    
    while (repetir == null) {
      repetir = pedirNumero();
    }
    int num = (int) repetir;
    System.out.println("numero insertado= "+num);
    System.out.println(sumar (num, 4));
    System.out.println(multiplicar (num));
  }

  public static Object pedirNumero() {
    Object num = null;
    Scanner teclado = new Scanner(System.in);
    try {
      System.out.println("Dime un número");
      num = teclado.nextInt();
      return num;
    } catch (Exception e) {
      System.err.println("No has insertado un número");
      return null;
    }
  }

  public static int sumar(int sum1, int sum2) {
    int sum = 0;

    if (sum1 < sum2) {
      sum = sum1;
      for(int i=sum1;i<sum2;i++){
        sum++;
      }
    } else {
      sum = sum2;
      for(int i=sum2;i<sum1;i++){
        sum++;
      }
    }
    return sum1 + sum2;
  }

  public static String multiplicar(int num1) {
    String result = "";

    for (int i = 0; i < 10; i++) {
      result = result + num1 + " x " + i + "=" + num1 * i + "\n";
    }
    return result;
  }
}
