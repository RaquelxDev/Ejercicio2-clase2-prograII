package umg.progra2.PKG_grupo1;

public class ejercicio1 {
    //área de un círculo
    public static void CalculoAreaCirculo() {
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    //circunferencia de un círculo
    public static void CircunferenciaDelCirculo() {
        double radio = 5.0;
        double circunferencia = Math.PI * 2 * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    //volumen de un cubo
    public static void VolumenCubo() {
        double lado = 5.0;
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }
}

