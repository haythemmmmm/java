public class Terrestria extends Animal{
    int nbrLegs;

    public Terrestria(){

    }
    public Terrestria(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestria{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }

    public void swim() {
        System.out.println(
                "This dolphin is swimming."
        );
    }
}
