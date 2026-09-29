import java.util.Arrays;
import java.util.Scanner;

public class ZooManagement {
        final int nbrCages;
        static final int max=25;
        String zooName;
        Animal[]animals=new Animal[max];
        String city;
        int nbranimal=0;
        public ZooManagement(int nbrCages,String zooName,String city){
            this.nbrCages=nbrCages;
            this.zooName=zooName;
            this.city=city;
        }
        public void displayZoo(){
            System.out.println("le nom:"+zooName);
            System.out.println("la ville:"+city);
            System.out.println("nombre de cage"+nbrCages);
        }
        boolean addAnimal(Animal animal){
            if(searchAnimal(animal)!=-1){
                return false;
            } //verification si il existe
            if (nbranimal < animals.length) {
                animals[nbranimal] = animal;
                nbranimal++;
                return true;
            }
            return false;
        }
        public void affichage(){
            for (int i=0;i<animals.length;i++){
                System.out.println(animals[i]);
            }
        }
        int searchAnimal(Animal animal){
            for(int i=0;i<animals.length;i++){
                if (animal.name==animals[i].name){
                    return i;
                }
            }
            return -1;
        }
        boolean removeAnimal(Animal animal){
            int pos=searchAnimal(animal);
            if (pos==-1){
                return false;
            }
            for (int i=pos;i<nbranimal-1;pos++){
                animals[i]=animals[i+1];
            }
            if(animals[nbranimal-1]==null){
                nbranimal--;
            }
            return true;
        }
        boolean iszoofull(){
            return nbranimal>=max;
        }
        ZooManagement comparerZoo(ZooManagement z1,ZooManagement z2){
            if(z1.nbranimal>= z2.nbranimal){
                return z1;
            }
            return z2;
        }


    @Override
    public String toString() {
        return "ZooManagement" +
                "nbrCages=" + nbrCages +
                ", zooName='" + zooName + '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", city='" + city + '\'' +
                '}';
    }
}