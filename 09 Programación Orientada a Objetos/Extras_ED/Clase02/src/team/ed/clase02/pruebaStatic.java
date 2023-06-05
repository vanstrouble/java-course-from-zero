package team.ed.clase02;

public class pruebaStatic {
    public static void main(String[] args) {
        //Matematicas m = new Matematicas();
        int r = Matematicas.sumar(3, 4);
        double  i = Math.random();
        System.out.println(r);
        System.out.println(i);
        System.out.println("PI vale: " + Matematicas.PI);
    }
}
