public class Circulos extends figurasGeometricas {
    Double radio;
    public Circulos(Double radio) {}
    public Circulos() {}

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
