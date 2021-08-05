package reto2;
public class Auto {

    private String marca;
    private int tipo;
    private double valor;

    public Auto(String marca, int tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public double getvalorTipo(){
        if(getTipo()==1){
            valor=750000;
        }
        else if(getTipo()==2){
            valor=500000;
        }
        else if(getTipo()==3){
            valor=350000;
        }
        return valor;
    }

    
       

}
