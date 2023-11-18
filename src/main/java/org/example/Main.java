package org.example;


public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product(3,"Arroz", 4, 12.5, true);
        Product p4 = new Product(4,"Pan", 5, 3.5, false);

        p1.setNumeroElemento(1);
        p1.setNombreProducto("Helado");
        p1.setNumExistencias(3);
        p1.setPrecio(1.2);


        p2.setNumeroElemento(2);
        p2.setNombreProducto("Lentejas");
        p2.setNumExistencias(6);
        p2.setPrecio(0.9);


        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());
        System.out.println();
        System.out.println(p3.toString());
        System.out.println();
        System.out.println(p4.toString());
        System.out.println();



    }
}