package reto2;

import java.util.ArrayList;

public class Reto2 {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        Empleado empleado = new Empleado("Juan", "martinez", 1875000);
        Auto auto = new Auto("Carro", 1);
        Auto auto2 = new Auto("Carro", 2);
        Auto auto3=new Auto("lol", 3);
        autos.add(auto);
        autos.add(auto2);
        autos.add(auto3);
        Empleado.setAutos(autos);
        System.out.println(Empleado.calcularMiNomina(empleado));
    }

}
