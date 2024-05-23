public class Cuadrilateros extends figurasGeometricas{
    double Largo;
    double Altura;
    public Cuadrilateros(double Largo, double Altura){}
    public Cuadrilateros() {}

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double calcularArea(){
        return Largo * Altura;
    }
}
