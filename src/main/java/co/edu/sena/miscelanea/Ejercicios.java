package co.edu.sena.miscelanea;

public class Ejercicios {

    public double areaTriangulo(double d1, double d2) {
        return (d1 * d2) /2;
    }
    public double suma(double d1, double d2){
        return (d1 + d2);
    }
    public double elevacion(double d1){
        return (d1 * d1);
    }
    public double convercion(double d1, double d2){
        d2 = 1.08;
        return (d1 *d2);
    }
    public double areaCuadrado(double d1){
        return (d1 * d1);
    }
    public double perimetroCuadrado(double d1){
        return (4 * d1);
    }
    public double areaCilindro(double d1, double d2){
        return ( Math.PI * d1 *( d1+ d2 ));
    }
    public double volumenCilindro(double d1, double d2){
        return (Math.PI * d1 * d1 * d2);
    }
    public double longuitudCirculo( double d1){
        return (2 * Math.PI * d1);
    }
    public double areaCirculo( double d1){
        return (Math.PI * Math.pow( d1,2));
    }
    public double promedio(double d1, double d2, double d3){
        return (d1 + d2+ d3) / 3;
    }
    public String numNega(double d1) {
        return (d1 > 0) ? "El numero es positivo.": (d1 < 0) ? "El numero es negativo.": "El numero es cero.";
    }
    public  String higherLess(double d1, double d2) {
        return (d1 > d2) ? d1+ " es mayor que "+d2:(d1 < d2) ? d2+ " es mayor que " +d1: " los dos son iguales";
    }
    public String numHigherLess(double d1, double d2,double d3, double d4, double d5){
        d4=d1;
        d5=d1;
        if (d2 > d4){d4 = d2;}
        if (d3 > d4){d4 = d3;}
        if (d2 < d5){d5 = d2;}
        if (d3 < d5){d5 = d3;}
         return "El número mayor es: " + d4 + ", y el número menor es: " + d5;
        }
    public String sumRes(double d1, double d2, double d3){
        if (d1 < d2){
            d3 = (d1 + d2);
            return(d1+" es menor que "+d2+ " la suma es "+d3);
        }else{
            d3 = (d1 - d2);
            return(d1+" es mayor que "+d2+" la resta es "+d3);
        }
    }   
    public String divi(double d1, double d2, double d3){
        if  (d2 !=0){
            d3 = (d1 / d2);
            return(d1+" cociente entre "+d2+" es "+d3);
        }else{
            return("No se puede dividir entre cero");
        }
    }
    public String multi(double d1, double d2, double d3){
        if (d1 < 0 || d2 < 0 ){
            d3 = (d1 + d2);
            return("un numero es negativo. La suma es: " +d3);
        }else{
            d3 =(d1 * d2);
            return("los dos numero son positivos. La multiplicacion es " +d3);
        }
    }public String year(double d1){
        if (esBisiesto(d1)){
            return(d1+ " es un año bisiesto");
        }else{
            return(d1+" no es un años bisiesto");
        }
    }
    public static boolean esBisiesto(double d1) {
        return (d1 % 4 == 0 && d1 % 100 != 0) || (d1 % 400 == 0);
    }
    }

