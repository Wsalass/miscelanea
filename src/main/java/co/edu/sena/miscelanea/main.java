package co.edu.sena.miscelanea;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        double dato1;
         double dato2;
         double dato3;
         double dato4;

         Ejercicios ejercicios = new Ejercicios();
         Scanner src = new Scanner(System.in);

         System.out.println("Miscelánea de ejercicios");
 
 
        //actividad 1 
         System.out.println("1.1 Calcular el área de un triángulo");
 
         System.out.println("Ingrese la base del triángulo: ");
         dato1= src.nextDouble();
         System.out.println("Ingrese la altura del triángulo: ");
         dato2= src.nextDouble();
         dato3= ejercicios.areaTriangulo(dato1, dato2);
         System.out.println("El área del triángulo es: " + dato3);
         
         
         //activdad 2
         System.out.println("1.2 suma");

         System.out.println("ingrese el primer numero");
         dato1= src.nextDouble();
         System.out.println("ingresa el segundo numero");
         dato2= src.nextDouble();
         dato3=ejercicios.suma(dato1, dato2);
         System.out.println("el resultado de la suma es: " +dato3);

         
         //actividad 3
         System.out.println("1.3 elevacion al cuadrado");

         System.out.println("ingrese un numero");
         dato1= src.nextDouble();
         dato2= ejercicios.elevacion(dato1);
         System.out.println("el resultado es: " +dato2);


         //actividad 4
         System.out.println("1.4 convercion euros a doleres");

         System.out.println("ingresa cuantos Euros quieres convertir: ");
         dato1= src.nextDouble();
         dato3= ejercicios.convercion(dato1, dato2);
         System.out.println(dato1 + " euros equivalen a " + dato3 + " dólares.");


         //actividad 5
         System.out.println("1.5 area y perimetro de un cuadrado");

         System.out.println("Ingrese la longitud del lado del cuadrado:");
         dato1= src.nextDouble();
         dato2= ejercicios.areaCuadrado(dato1);
         dato3= ejercicios.perimetroCuadrado(dato1);
         System.out.println("El área del cuadrado es: " + dato2 + " y El perímetro del cuadrado es: " +dato3);


         //actividad 6
         System.out.println("1.6 area y volumen de un cilindro");

         System.out.println("Ingrese el radio de la base del cilindro: ");
         dato1= src.nextDouble();
         System.out.println("Ingrese la altura del cilindro: ");
         dato2= src.nextDouble();
         dato3= ejercicios.areaCilindro(dato1, dato2);
         dato4= ejercicios.volumenCilindro(dato1, dato2);
         System.out.println("el valor del area es : " +dato3+ " y el valor del volumen es : " +dato4);


         //actividad 7
         System.out.println("1.7 longuitud y area del circulo");

         System.out.print("ingrese el radio de la circunferencia: ");
         dato1= src.nextDouble();
         dato2= ejercicios.longuitudCirculo(dato1);
         dato3= ejercicios.areaCirculo(dato1);
         System.out.println("La longitud de la circunferencia es de: " + dato2 + "y el area del círculo es de: " + dato3);


         //actividad 8
         System.out.println("1.8 el promedio de tres numeros");

         System.out.println("ingresa 3 numeros para calcular el promedio: ");
         dato1= src.nextDouble();
         dato2= src.nextDouble();
         dato3= src.nextDouble();
         dato4= ejercicios.promedio(dato1, dato2, dato3);
         System.out.println("El promedio de los tres numeros es: " + dato4);
      }
 }
 