package Clase2;

public class Carro {
    Carro(){}
    Carro(int valocidadInicial){
      this.valocidadInicial=valocidadInicial;
    }

    Carro(String color){
        this.color=color;
    }

    private String id;
    private String modelo;
    private String anio;
    private String color;
    private String referenciaLlanas;
    private int valocidadInicial;
    private int caballosDeFuerza;
    private int numeroDePuertas;

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int aceleracionMaxima(int valorInicial){
        return 350;
    }


    public String toString() {
        return "Carro{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", color='" + color + '\'' +
                ", referenciaLlanas='" + referenciaLlanas + '\'' +
                ", valocidadInicial=" + valocidadInicial +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }


}
