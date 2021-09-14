/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author KarenEscalante
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //ejemplo 1
        
        var nombre1="maría";
        var nombre2="paula";
        var union=nombre1 + " " + nombre2;
               System.out.println("union=" +union);
        
        
        int i=2;
        int e=3;
        
                System.out.println(i+e);
                System.out.println(i+e+union);
                System.out.println(union+i+e);
                System.out.println(union+(i+e));
                
    //ejemplo 2
    
        int numero1=8;
        int numero2=numero1;
                System.out.println("la variable numero 1 vale: " +numero1);
                System.out.println("La variable numero 2 vale: " +numero2);
    
    //ejemplo 3
    
        long numer1=8;
        int numer2=13;
        long resta= numer1-numer2;
                System.out.println("el resultado de la resta1 es: " +resta);
        
        
        
    //ejemplo 4
    
        int nmro1=3;
        int nmro2=52;
        int suma = nmro1+nmro2;
                System.out.println("El resultado de la suma1 es: " +suma);    
                
           
    //ejemplo 5
    
        double número1= 7.6;
        int número2= 4;
        double multiplicacion = número1*número2;
                System.out.println("El resultado de la multiplicacion1 es: " +multiplicacion);
        
        
        
    //ejemplo 6
    
        float nume1 =2.3F;
        int nume2 =5;
        float division = nume1/nume2;
                System.out.println("El resultado de la division1 es: " +division);    
                            
     
     
    //ejemplo 7
    
        int s = 5;
        int m = ++s; 
             System.out.println(s); 
             System.out.println(m); 
               
        int g = 5;
        int f = g++;
             System.out.println(g);
             System.out.println(f); 
             
        int h = 5;
        int o = --h;
            System.out.println(h);
            System.out.println(o);     
            
         
        int j = 5;
        int k = j--;
             System.out.println(j);
             System.out.println(k);
        
          
             
             
     //ejemplo 8        
    
        int a =5;
        int b = 2;
     
        b += a;
           System.out.println(b);
     
        b -= a;
           System.out.println(b);
     
        b *= a;
           System.out.println(b);
    
        double d = 2.0;
        d /= a;
           System.out.println(d);
            
           
         //ejemplo9
        int N = 5;
        double A = 4.56;
        char C = 'a';
        
        System.out.println("Variable N = " + N);
        System.out.println("Variable C = " + C);
        System.out.println(N + "+" + A + " = " + (N + A));
        System.out.println(A + "-" + N + " = " + (A - N));
        System.out.println("Valor numerico del caracter " + C + " = " + (int) C);
       
        
 
        //ejemplo10
        int numero3= 12;
        int numero4 = 2;
        
        double divisi;
        
        int sum, rest, multiplica;
        double modulo;
        double operacion;
        
        operacion = 9/3*5 - 3+ 8*2;
        
        System.out.println("El resultado de la operacion es: " + operacion);
        divisi = numero3 / numero4;
        System.out.println("El resultado de la division es: " + divisi);
        sum = numero3+ numero4;
        System.out.println("El resultado de la suma es: " + sum);
        rest = numero3 - numero4;
        System.out.println("El resultado de la resta es: " + rest);
        multiplica = numero3 * numero4;
        System.out.println("El resultado de la multiplicacion es: " + multiplica);
        modulo = numero3 % numero4;
        System.out.println("El resultado del modulo es: " + modulo);
                 
      
                        
                        
        
        
        
        
        
        
    }
   
    
    
}
