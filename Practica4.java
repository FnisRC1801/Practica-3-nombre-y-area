
package practica4;

import java.util.Scanner;

public class Practica4 {

    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad (En pesos): ");
       double money = lectura.nextDouble();
       
        double Eu = 17.13;
        double Es = 18.26;
        
        double dolar = money/Eu;
        double euro = money/Es;
        
        lectura.close();
        
     System.out.println("Su cantidad en dolares es: $"+dolar+" dolares");
     System.out.println("Su cantidad en euros es: $"+euro+" euros");
     System.out.println("Bueno gracias por usarme luv u <3");
    }
    
}
