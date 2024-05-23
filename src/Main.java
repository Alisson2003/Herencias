//Herencia: clase padre a clase hija hereda tidis los campos y métodos de la superclase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        figurasGeometricas miFigura1 = new figurasGeometricas();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();

        Circulos miFigura5 = new Circulos(3.00);
        Triangulos miFigura6 = new Triangulos(6.00, 8.00);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.00,5.00);
        Cuadrilateros miFigura8 = new Cuadrilateros(5.00,10.00);


        System.out.println("Circulos");
        miFigura2.setNombre("Pileta del sur");
        System.out.println(miFigura2.getNombre());

        System.out.println("La pileta del sur tendra un radio de: ");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getRadio());

        System.out.println("Y su area sera de: ");
        System.out.println(Math.round(miFigura2.calcularArea() * 100.0) / 100.0);
        System.out.println("----------------------------------------------------");
        System.out.println("Triangulos");
        miFigura3.setNombre("traingulo de encebollados");
        System.out.println(miFigura3.getNombre());

        System.out.println("La altura es: ");
        miFigura3.setAltura(5.00);
        System.out.println(miFigura3.getAltura());

        System.out.println("La base es de: ");
        miFigura3.setBase(3.00);
        System.out.println(miFigura3.getBase());

        System.out.println("Y su area sera de: ");
        System.out.println(Math.round(miFigura3.calcularArea() * 100.0) / 100.0);
        System.out.println("---------------------------------------------------");

        System.out.println("Cuadrilateros");
        miFigura4.setNombre("cuadrilateros del sur");
        System.out.println(miFigura4.getNombre());

        System.out.println("Su altura es de: ");
        miFigura4.setAltura(6.00);
        System.out.println(miFigura4.getAltura());

        System.out.println("Su largo es de: ");
        System.out.println(miFigura4.getLargo());
        System.out.println("Su area es de: ");
        System.out.println(Math.round(miFigura4.calcularArea() *100.0) / 100.0);
        System.out.println("--------------------------------------------------");

        System.out.println("Circulo_Figura6");
        miFigura6.setNombre("Woola");
        System.out.println(miFigura6.getNombre());

        System.out.println("Su area es");
        miFigura6.calcularArea();
        System.out.println(miFigura6.calcularArea());
        System.out.println("--------------------------------------------------");

        System.out.println("Circulo_Figura7");
        miFigura6.setNombre("Woola x2");
        System.out.println(miFigura7.getNombre());

        System.out.println("Su area es");
        miFigura6.calcularArea();
        System.out.println(miFigura7.calcularArea());
        System.out.println("--------------------------------------------------");

        System.out.println("Circulo_Figura8");
        miFigura6.setNombre("Woola x3");
        System.out.println(miFigura8.getNombre());

        System.out.println("Su area es");
        miFigura6.calcularArea();
        System.out.println(miFigura8.calcularArea());


    }
}