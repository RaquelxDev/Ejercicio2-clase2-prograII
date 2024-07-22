package umg.progra2.PKG_grupo3;

public class ejercicio3 {

    //Volumen de un prisma rectangular
    public static void PrismaRectangular() {
            double largo = 8.0;
            double ancho = 5.0;
            double altura = 10.0;
            double volumen = largo * ancho * altura;
            System.out.println("El volumen del prisma rectangular es: " + volumen);
    }

    //area de un paralelogramo
    public static void AreaParalelogramo() {
            double base = 8.0;
            double altura = 5.0;
            double area = base * altura;
            System.out.println("El area del paralelogramo es: " + area);
    }

    //volumen de un cilindro
    public static void VolumenCilindro() {
            double radio = 3.0;
            double altura = 10.0;
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("El volumen del cilindro es: " + volumen);
    }
}
