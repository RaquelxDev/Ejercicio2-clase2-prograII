
package umg.progra2.PKG_grupo1;

public class ejercicio1 {


    //area de un CalculoAreaCirculo
    public static void Calculo() {
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);
    }

    //circunferencia de un circulo
    public static void CircunferenciaDelCirculo(){
        double radio = 5.0;
        double circunferencia = Math.PI * 2 * radio;

        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    //volumen de un cubo

    public static void VolumenCubo() {
            double lado = 5.0; // Puedes cambiar este valor según tus necesidades

            // Calcula el volumen del cubo
            double volumen = lado * lado * lado;

            System.out.println("El volumen del cubo es: " + volumen);
        }
}
