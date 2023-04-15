public class Circulo {
    private String color;
    private  int diametro;

    public Circulo(String color, int diametro) {
        this.color = color;
        this.diametro = diametro;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", diametro=" + diametro +
                '}';
    }
}

