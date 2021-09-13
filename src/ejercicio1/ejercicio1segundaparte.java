/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author KarenEscalante
 */
public class ejercicio1segundaparte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N = 5;
        double A = 4.56;
        char C = 'a';
        
        System.out.println("Variable N = " + N);
        System.out.println("Variable C = " + C);
        System.out.println(N + "+" + A + " = " + (N + A));
        System.out.println(A + "-" + N + " = " + (A - N));
        System.out.println("Valor numerico del caracter " + C + " = " + (int) C);
       
        
 
        int numero1= 12;
        int numero2 = 2;
        
        double division;
        
        int suma, resta, multiplicacion;
        double modulo;
        double operacion;
        
        operacion = 9/3*5 - 3+ 8*2;
        
        System.out.println("El resultado de la operacion es: " + operacion);
        division = numero1 / numero2;
        System.out.println("El resultado de la division es: " + division);
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + suma);
        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resta);
        multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        modulo = numero1 % numero2;
        System.out.println("El resultado del modulo es: " + modulo);
       

    }
    
}
