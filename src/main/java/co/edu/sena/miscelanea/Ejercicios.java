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

}
