public non-sealed class Dolphin extends Aquatic{
    protected float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
