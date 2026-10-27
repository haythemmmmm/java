import java.util.Arrays;
public class ZooManagement {
        private  int nbrCages;
        private static final int max=25;
        private String zooName;
        Animal[]animals=new Animal[max];
        private String city;
        private int nbranimal=0;
        Aquatic[] aquaticAnimals = new Aquatic[10];
        int nbrAquatic = 0;
        public ZooManagement(int nbrCages,String zooName,String city){
            this.zooName=zooName;
            this.city=city;
            this.animals=new Animal[nbrCages];
        }
        public void displayZoo(){
            System.out.println("le nom:"+zooName);
            System.out.println("la ville:"+city);
            System.out.println("nombre de cage"+nbrCages);
        }
        public boolean addAnimal(Animal animal){
            if (iszoofull()){
                System.out.println("zoo full");
                return false;
            }
         if(searchAnimal(animal)!=-1){
                System.out.println("deja existant");
                return false;
            } //verification si il existe
            if (nbranimal < animals.length) {
                System.out.println("dans l'ajout");
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
        public int searchAnimal(Animal animal){
            System.out.println("la taille du tableau" +animals.length);
            for(int i=0;i<animals.length;i++){
                System.out.println(animals[i]);
                if (animal!=null){
                if (animal.getName().equals(animals[i].getName()))
                    return i;
                }

            }
            return -1;
        }
        public boolean removeAnimal(Animal animal){
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
        public ZooManagement comparerZoo(ZooManagement z1, ZooManagement z2){
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

    public int getNbrCages() {
        return nbrCages;
    }

    public String getZooName() {
        return zooName;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getCity() {
        return city;
    }

    public int getNbranimal() {
        return nbranimal;
    }

    public void setZooName(String zooName) {
        if (zooName == null || zooName.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne doit pas être vide.");
            return;
        }
        this.zooName = zooName;
    }
    public boolean addAquaticAnimal(Aquatic animal) {
        if (nbrAquatic < aquaticAnimals.length) {
            aquaticAnimals[nbrAquatic] = animal;
            nbrAquatic++;
            return true;
        }
        return false;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbranimal(int nbranimal) {
        this.nbranimal = nbranimal;
    }
    public void makeAquaticsSwim() {
        for (int i = 0; i < nbrAquatic; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < nbrAquatic; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.swimmingDepth > max) {
                    max = p.swimmingDepth;
                }
            }
        }
        return max;
    }
    public void nbrdesanimals() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < nbrAquatic; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Dauphins : " + nbrDolphins);
        System.out.println("Pingouins : " + nbrPenguins);
    }
}