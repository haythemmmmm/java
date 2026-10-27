public  sealed class Aquatic extends Animal permits Dolphin, Penguin {
    String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }

    public Aquatic() {

    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
    public void swim(){

    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null){return false;}
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic a = (Aquatic) obj;
        return this.name.equals(a.name)
                && this.age == a.age
                && this.habitat.equals(a.habitat);
    }
}
