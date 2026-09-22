import java.util.Arrays;
import java.util.Scanner;

public class ZooManagement {
        int nbrCages;
        String zooName;
        Animal[]animals=new Animal[25];
        String city;
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