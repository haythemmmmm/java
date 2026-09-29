public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("african","leo",12,true);
        ZooManagement Myzoo=new ZooManagement(15,"Myzoo","25");
        Animal crocodile=new Animal("brazilien","lo",15,true);
        Animal tiger= new Animal("asian","lewi",14,false);
        ZooManagement zoo= new ZooManagement(34,"belvider","tunis");
        zoo.displayZoo();
        System.out.println(zoo);
        System.out.println(Myzoo.toString()) ;
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.affichage();
        zoo.searchAnimal(lion);
        zoo.searchAnimal(crocodile);
        zoo.removeAnimal(lion);
        zoo.comparerZoo(Myzoo,zoo);



    }
}
