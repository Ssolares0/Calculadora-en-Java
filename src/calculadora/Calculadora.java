/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Sebastian S
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        while(!exit){
            System.out.println("-----Bienvenido-----");
            
            System.out.println("1. SUMAR");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISON");
            System.out.println("5. SALIR");
            
            System.out.println("INGRESE UNA OPCION: ");
            
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("-----Bienvenido a la SUMA-----");
                    int sum1;
                    int sum2;
                    int sumaTotal;
                    
                    System.out.println("Ingrese el primer numero:");
                    sum1 = sc.nextInt();
                    
                    System.out.println("ingrese el segundo numero:");
                    sum2 = sc.nextInt();
                    
                    sumaTotal = sum1 + sum2;
                    
                    System.out.println("LA SUMA ES:"+ sumaTotal);
                    break;
                case 2:
                    int resta1;
                    int resta2;
                    int restaTotal;
                    
                    
                    System.out.println("-----Bienvenido a la resta-----");
                    System.out.println("Ingrese el primer numero:");
                    resta1 = sc.nextInt();
                    
                    System.out.println("ingrese el segundo numero:");
                    resta2 = sc.nextInt();
                    
                    restaTotal= resta1 - resta2;
                    
                    System.out.println("La resta es: "+ restaTotal );
                    break;
                    
                case 3:
                    int mult1;
                    int mult2;
                    int multTotal;
                    
                    System.out.println("Bienvenido a la multiplicacion");
                   
                    System.out.println("Ingrese el primer numero: ");
                    mult1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    mult2 = sc.nextInt();
                    
                    multTotal  = mult1*mult2;
                    
                    System.out.println("la multiplicacion es: "+ multTotal);
                    
                    break;
                    
                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("solo numeros del 1 al 5");
            }
        
        
        }
        
        
        
    }
    
}
