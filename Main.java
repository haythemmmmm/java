public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("african","leo",12,true);
        ZooManagement Myzoo=new ZooManagement(15,"Myzoo","25");
        Animal tiger= new Animal("asian","lewi",14,false);
        ZooManagement zoo= new ZooManagement(34,"belvider","tunis");
        zoo.displayZoo();
        //tableau

        System.out.println(zoo);
        System.out.println(Myzoo.toString()) ;




    }
}
