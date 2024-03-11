package co.edu.sena.miscelanea;

import java.util.Scanner;

public class main {

    static double dato1;
    static double dato2;
    static double dato3;
    static double dato4;
    static double dato5;
    static String result;

    

    static Ejercicios ejercicios = new Ejercicios();
    static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Miscelánea de ejercicios");
            System.out.println("--Bienvenido al menu--");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("99. Salir");
            System.out.println("Por favor digite una opcion:");
            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    operadores();
                    break;
                case 2:
                    condicionales(result);
                    break;
                case 3:
                    ciclo();
                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 99);

        menu.close();
    }

    public static void operadores() {
        System.out.println("operadores");
        //actividad 1 
        System.out.println("1.1 Calcular el área de un triángulo");

        System.out.println("Ingrese la base del triángulo: ");
        dato1 = src.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        dato2 = src.nextDouble();
        dato3 = ejercicios.areaTriangulo(dato1, dato2);
        System.out.println("El área del triángulo es: " + dato3);

        //activdad 2
        System.out.println("1.2 suma");

        System.out.println("ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("ingresa el segundo numero");
        dato2 = src.nextDouble();
        dato3 = ejercicios.suma(dato1, dato2);
        System.out.println("el resultado de la suma es: " + dato3);

        //actividad 3
        System.out.println("1.3 elevacion al cuadrado");

        System.out.println("ingrese un numero");
        dato1 = src.nextDouble();
        dato2 = ejercicios.elevacion(dato1);
        System.out.println("el resultado es: " + dato2);

        //actividad 4
        System.out.println("1.4 convercion euros a doleres");

        System.out.println("ingresa cuantos Euros quieres convertir: ");
        dato1 = src.nextDouble();
        dato3 = ejercicios.convercion(dato1, dato2);
        System.out.println(dato1 + " euros equivalen a " + dato3 + " dólares.");

        //actividad 5
        System.out.println("1.5 area y perimetro de un cuadrado");

        System.out.println("Ingrese la longitud del lado del cuadrado:");
        dato1 = src.nextDouble();
        dato2 = ejercicios.areaCuadrado(dato1);
        dato3 = ejercicios.perimetroCuadrado(dato1);
        System.out.println("El área del cuadrado es: " + dato2 + " y El perímetro del cuadrado es: " + dato3);

        //actividad 6
        System.out.println("1.6 area y volumen de un cilindro");

        System.out.println("Ingrese el radio de la base del cilindro: ");
        dato1 = src.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        dato2 = src.nextDouble();
        dato3 = ejercicios.areaCilindro(dato1, dato2);
        dato4 = ejercicios.volumenCilindro(dato1, dato2);
        System.out.println("el valor del area es : " + dato3 + " y el valor del volumen es : " + dato4);

        //actividad 7
        System.out.println("1.7 longuitud y area del circulo");

        System.out.print("ingrese el radio de la circunferencia: ");
        dato1 = src.nextDouble();
        dato2 = ejercicios.longuitudCirculo(dato1);
        dato3 = ejercicios.areaCirculo(dato1);
        System.out.println("La longitud de la circunferencia es de: " + dato2 + " y el area del círculo es de: " + dato3);

        //actividad 8
        System.out.println("1.8 el promedio de tres numeros");

        System.out.println("ingresa 3 numeros para calcular el promedio: ");
        dato1 = src.nextDouble();
        dato2 = src.nextDouble();
        dato3 = src.nextDouble();
        dato4 = ejercicios.promedio(dato1, dato2, dato3);
        System.out.println("El promedio de los tres numeros es: " + dato4);
    }

    static void condicionales(String string) {
        System.out.println("condicionales");
        //actividad 1
        System.out.println("2.1 numero negativo o positivo");

        System.out.println("ingrese el numero: ");
        dato1 = src.nextDouble();
        result = ejercicios.numNega(dato1);
        System.out.println("El resultado es:" + result);

        //actividad 2 
        System.out.println("2.2 numero mayor");

        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        dato2= src.nextDouble();
        result =ejercicios.higherLess(dato1, dato2);
        System.out.println("el resultado es: " + result);

        //actividad 3
        System.out.println("2.3 numero mayor y menor");
        System.out.println("Ingrese el primer numero: ");
        dato1= src.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        dato2= src.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        dato3= src.nextDouble();
        result =ejercicios.numHigherLess(dato1, dato2, dato3, dato4, dato5);
        System.out.println(result);

        //actividad 4
        System.out.println("2.4 suma y resta");
        System.out.println("ingrese el primer numero");
        dato1= src.nextDouble();
        System.out.println("ingrese el segundo numero");
        dato2= src.nextDouble();
        result =ejercicios.sumRes(dato1, dato2, dato3);
        System.out.println(result);

        //actividad 5
        System.out.println("2.5 division");
        System.out.println("ingresa el primer numero");
        dato1= src.nextDouble();
        System.out.println("ingrese el segundo numero");
        dato2= src.nextDouble();
        result =ejercicios.divi(dato1, dato2, dato3);
        System.out.println(result);

        //actividad 6
        System.out.println("multiplicacion");
        System.out.println("ingresa el primer numero");
        dato1= src.nextDouble();
        System.out.println("ingrese el segundo numero");
        dato2= src.nextDouble();
        result =ejercicios.multi(dato1, dato2, dato3);
        System.out.println(result);

        //actividad 7
        System.out.println("años bisiesto");
        System.out.println("ingrese un año");
        dato1= src.nextDouble();
        result =ejercicios.year(dato1);
        System.out.println(result);
        
    }
    static void ciclo() {
        // Implementa tus ejercicios de ciclo aquí
    }
}
 