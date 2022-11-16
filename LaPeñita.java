/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapeñita;
import java.util.Scanner;

/**
 *
 * @author 204
 */
public class LaPeñita {

    /**
     * @param args the command line arguments
     */
    public static void Suma(String[] args) {
        Scanner sumando =new Scanner(System.in);//Importar clase Scanner para recibir datos por teclado
        int suma=0;//Se declara variable suma para almacenar datos
        for(int i=0;i<5;i++){//ciclo for hace que la operaciÃ³n se repita 5 veces 
        System.out.println("Ingrese el valor del producto: ");//solicita valores al usuario para realizar la operaciÃ³n correspondiente
        int nume=sumando.nextInt();//la variable "nume" almacena los datos ingresados en el scanner "sumando"
        suma=suma+nume;//Se suman los datos ingresados en "nume"
        System.out.println("El valor total de los productos es " + suma);//Por Ãºltimo se imprime el valor resultante de la operaciÃ³n
        }
        // TODO code application logic here
    }
    
    public static void Multiplicacion(String[] args) 
    {
        Scanner multiplicando =new Scanner(System.in);//Importar clase Scanner para recibir datos por teclado
        int multiplicacion=0;//Se declara variable multiplicacion para almacenar datos
        for(int i=0;i<5;i++){//ciclo for hace que la operaciÃ³n se repita 5 veces 
        System.out.println("Digite el valor del producto: ");
        int nume1=multiplicando.nextInt();
        multiplicacion=multiplicacion*nume1;//se realiza la operaciÃ³n de multiplicaciÃ³n       
        System.out.println("El valor total de los productos es: "+multiplicacion);//Se imprime el resultado de la operaciÃ³n
        }
    }
     public static void Promedio(String[] args) {
         Scanner recogerPromedio= new Scanner(System.in);
         int promedio;
         int s=0;
         int n = 0;
         int x;
         int p;
         for(int i=0;i<5;i++){
         System.out.println("Ingrese el valor del producto: ");
         n=recogerPromedio.nextInt();
         x=recogerPromedio.nextInt();
         s=s+x;
         }
         p=s/n;
     }
}
