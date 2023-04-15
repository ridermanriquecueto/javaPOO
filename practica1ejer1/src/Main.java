public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Circulo c1 =new Circulo("rojo",4);
        System.out.println(c1.toString());
        Circulo c2 = new Circulo("amarillo",7);
        System.out.println(c2.toString());
        Circulo c3 = new Circulo("verde",9);
        System.out.println(c3.toString());

        Persona p1=new Persona("juan","perez",409412545,21,"soltero");
        System.out.println(p1.toString());

        FiguraGeometrica a =new FiguraGeometrica ("cuadrado","circulo","cuadrado" );
        System.out.println(a.toString());

        calcula n=new calcula(8,4,"suma");
        System.out.println(n.operar());
        calcula m=new calcula(4,7,"multiplicacion");
        System.out.println(m.operar());
        calcula o=new calcula(12,5,"resta");
        System.out.println(o.operar());
        calcula p=new calcula (12,3,"division");
        System.out.println(p.operar());

        cuentaBancaria cb=new cuentaBancaria(15555554,8955);
        Cliente c=new Cliente("juan", 1254675,1112121,"juan@gmail.com",cb);
        System.out.println(c.conocerSaldo());
        c.extraxines(1000);
        System.out.println(c.conocerSaldo());

    }


}