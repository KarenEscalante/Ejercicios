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
        
        //ejemplo2
        
        int a=2;
        int e=3;
        
                System.out.println(a+e);
                System.out.println(a+e+union);
                System.out.println(union+a+e);
                System.out.println(union+(a+e));
                        
        //ejemplo 3
        
        int numero1=8;
        int numero2=numero1;
        System.out.println("la variable numero 1 vale: " +numero1);
        System.out.println("La variable numero 2 vale: " +numero2);
        
        
        //ejemplo4
        
        long numer1=8;
        int numer2=13;
        long resta= numer1-numer2;
        System.out.println("el resultado de la resta1 es: " +resta);
        
        
        //ejemplo 5
        
        int nmro1=3;
        int nmro2=52;
        int suma = nmro1+nmro2;
        System.out.println("El resultado de la suma1 es: " +suma);
        
        
        //ejemplo 6
        
        double número1= 7.6;
        int número2= 4;
        double multiplicacion = número1*número2;
        System.out.println("El resultado de la multiplicacion1 es: " +multiplicacion);
        
        
        
        //ejemplo7
        
        float nume1 =2.3F;
        int nume2 =5;
        float division = nume1/nume2;
                System.out.println("El resultado de la division1 es: " +division);
                
                
                
         //ejemplo 8
         
        int c = 5;
        int d = ++c;
        System.out.println(c); 
        System.out.println(d); 
                
        

        //ejemplo 9
        
        int f = 5;
        int g = c++;
        System.out.println(f);
        System.out.println(g) ; 
        
          
        //ejemplo 10
        
        int h = 5;
        int i = --h;
        System.out.println(h);
        System.out.println(i);
        
        
        
        //ejemplo11
        
        int j = 5;
        int k = j--;
        System.out.println(j);
        System.out.println(k);
        
        
        //ejemplo12
        
        int l= 5;
        int n = 2;
        n += l;
        System.out.println(n);
        
        
        
        //ejemplo13
        
        int m=5;
        int o=2;
        o -= m;
        System.out.println(o);
        
        
        
        
        //ejemplo 14
        
        int p = 5;
        int q = 2;
        q *= p;
        System.out.println(q);
        
        
        
        //ejemplo15
        
        int r =5;
        double s = 2.0;
        s /= r ;
        System.out.println(s);
        
        
        
        //ejemplo16
        
        int t= 5;
        int u = 2;
        u %= t;
        System.out.println(u);
        
                
                
     
        //ejemplo17
        int N = 5;
        double A = 4.56;
        char C = 'a';
        
        System.out.println("Variable N = " + N);
        System.out.println("Variable C = " + C);
        System.out.println(N + "+" + A + " = " + (N + A));
        System.out.println(A + "-" + N + " = " + (A - N));
        System.out.println("Valor numerico del caracter " + C + " = " + (int) C);
       
        
 
        //ejemplo18
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
