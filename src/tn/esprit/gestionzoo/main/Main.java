package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.ZooManagement;

public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("african","leo",12,true);
        Animal[] a1= new Animal[10];
        a1[0]=lion;
        ZooManagement Myzoo=new ZooManagement(15,"Myzoo",a1,"sfax");

        Animal tiger= new Animal("asian","lewi",14,false);
        Animal[] a2= new Animal[10];
        a2[0]=tiger;
        Myzoo.addAnimal(tiger);
        Animal crocodile=new Animal("brazilien","lo",15,true);
        ZooManagement zoo= new ZooManagement(15,"belvider",a2,"tunis");
        zoo.displayZoo();
        System.out.println(zoo);
        System.out.println(Myzoo.toString()) ;
        Myzoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.affichage();
        zoo.searchAnimal(lion);
        zoo.searchAnimal(crocodile);
        zoo.removeAnimal(lion);
        zoo.comparerZoo(Myzoo,zoo);



    }
}
