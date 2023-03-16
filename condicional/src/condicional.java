import java.util.Scanner;

public class condicional {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // Declaramos la clase "Scanner"
    // Pedimos el numero
    System.out.println("Ingrese el numero : ");
    // "nextInt()" lee valores int introducidos por el usario
    int numero1 = entrada.nextInt();
    // usamos la condicional if
    if (numero1 < 10){
      //imprimimos
     System.out.println("Hola Luis");
     System.out.println("El valor que ingresaste es menor que 10");
     }
     else {
      System.out.println("Hola Luis");
     System.out.println("El valor que ingresaste es mayor que 10");
     }
     
     }
  }