package org.example;
import org.example.Animal;
public class Familia {

   String papa = "Cebra";
    String  mama= "Caballo";
    String  hijo= "Cebrallo";

    public Familia(Animal papa, Animal mama, Animal hijo) {
        this.papa = "papa";
        this.mama = "mama";
        this.hijo = "Hijo";
    }

    public Familia() {
    }

    public Familia(String cebra, String caballo) {
    }

    public void  imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa+
                        "\nLa mamá es: "+this.mama+
                            "\nEl hijo es: "+this.hijo
        );

    }

    public void tenerHijo(String nombre){

        if(this.papa!=null && this.mama != null){

            Animal hijo= new Animal(nombre,20);
            hijo.nombre = nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo="M";

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }


    public void tenerhijo(String cebrallo) {
    }
}
