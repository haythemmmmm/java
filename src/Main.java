public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("african","leo",12,true);
        Animal[] a1= new Animal[10];
        a1[0]=lion;
     //   ZooManagement Myzoo=new ZooManagement(15,"Myzoo","sfax");

        Animal tiger= new Animal("asian","lewi",14,false);
        Animal[] a2= new Animal[10];
        a2[0]=tiger;
    //    Myzoo.addAnimal(tiger);
        Animal crocodile=new Animal("brazilien","lo",15,true);
        ZooManagement zoo= new ZooManagement(1,"belvider","tunis");
        zoo.displayZoo();
        System.out.println(zoo);
   //     System.out.println(Myzoo.toString()) ;
      //  Myzoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        System.out.println(zoo);
        zoo.affichage();
     //   zoo.searchAnimal(lion);
      //  zoo.searchAnimal(crocodile);
        zoo.removeAnimal(lion);
    //    zoo.comparerZoo(Myzoo,zoo);
        Aquatic k1= new Aquatic();
        Terrestria k2=new Terrestria();
        Dolphin k3=new Dolphin("atlatic","zo",5,true,"tat");
        Penguin k4=new Penguin("aquatic","lol",4,true,"iuy",522);
        k1.swim();
        k2.swim();
        k3.swim();
        k4.swim();




    }
}
