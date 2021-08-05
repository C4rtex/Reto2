package reto2;
import java.util.ArrayList;

public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private static ArrayList<Auto> autos = new ArrayList<>();
    private int salario;
    private static double nomina;

    public Empleado(String nombre, String apellido, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public static double calcularMiNomina(Empleado empleado) {
        nomina=empleado.salario;
        for (Auto auto : autos) {
            nomina = nomina+auto.getvalorTipo();
        }
        double porcentaje=(nomina*4)/100;
        nomina=nomina-porcentaje-porcentaje;
        return nomina;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static ArrayList<Auto> getAutosVendidos() {
        return autos;
    }

    public static void setAutos(ArrayList<Auto> autos) {
        Empleado.autos = autos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
