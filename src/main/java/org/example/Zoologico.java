package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("cebra",20);
        animal1.nombre="Cebra";
        animal1.peso=2;


        Animal animal2 = new Animal("caballo", 30);
        animal2.nombre="Caballo";
        animal2.peso=30;


        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia("cebra","caballo");


        familia.tenerhijo("Cebrallo");


        familia.imprimirFamilia();




    }
}