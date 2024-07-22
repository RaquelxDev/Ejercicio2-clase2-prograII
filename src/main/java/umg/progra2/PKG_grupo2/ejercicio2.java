package umg.progra2.PKG_grupo2;

public class ejercicio2 {
    //area de una piramide cuadrada
    public static void PiramideCuadrada() {
            double lado = 5.0;
            double apotema = 7.0;
            double areaBase = lado * lado;
            double areaLateral = 2 * lado * apotema;
            double areaTotal = areaBase + areaLateral;
            System.out.println("El area total de la piramide cuadrada es: " + areaTotal);
    }

    //Volmen de una piramide cuadrada
    public static void VolumenPiramideCuadrada() {
            double lado = 5.0;
            double altura = 10.0;
            double areaBase = lado * lado;
            double volumen = (1.0 / 3.0) * areaBase * altura;
            System.out.println("El volumen de la piramide cuadrada es: " + volumen);
    }

    //Area de un triangulo
    public static void AreaTriangulo(){
        double base = 5.0;
        double altura = 10.0;
        double area = (base * altura) / 2;
        System.out.println("El area del triángulo es: " + area);

    }
}
