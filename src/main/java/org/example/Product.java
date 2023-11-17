package org.example;

public class Product {

    //Instance field declarations
    private int numeroElemento;
    private String nombreProducto;
    private int numExistencias;
    private double precio;


    public int getNumeroElemento() {
        return numeroElemento;
    }

    public void setNumeroElemento(int numeroElemento) {
        this.numeroElemento = numeroElemento;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getNumExistencias() {
        return numExistencias;
    }

    public void setNumExistencias(int numExistencias) {
        this.numExistencias = numExistencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Product(){

    }

    public Product(int numeroElemento, String nombreProducto, int numExistencias, double precio){
        this.numeroElemento = numeroElemento;
        this.nombreProducto = nombreProducto;
        this.numExistencias = numExistencias;
        this.precio = precio;

    }

    public String toString(){
        String nm = "Item Number: \t" + getNumeroElemento() + "\nName: \t" + getNombreProducto() + "\nQuantity in Stock: \t" + getNumExistencias() + "\nPrice: \t" + getPrecio();
        return nm;

    }


}
