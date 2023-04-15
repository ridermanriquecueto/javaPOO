public class FiguraGeometrica {
    public String cuadrado;
    public String Circulo;
    public String Cuadrado;

    public FiguraGeometrica(String cuadrado, String circulo, String cuadrado1) {
        this.cuadrado = cuadrado;
        Circulo = circulo;
        Cuadrado = cuadrado1;
    }

    public String getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(String cuadrado) {
        this.cuadrado = cuadrado;
    }

    public String getCirculo() {
        return Circulo;
    }

    public void setCirculo(String circulo) {
        Circulo = circulo;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "cuadrado='" + cuadrado + '\'' +
                ", Circulo='" + Circulo + '\'' +
                ", Cuadrado='" + Cuadrado + '\'' +
                '}';
    }
}