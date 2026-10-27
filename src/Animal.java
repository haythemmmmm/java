sealed class Animal permits Aquatic,Terrestria {
        public String family;
        public String name;
        public int age;
        public boolean isMammal;
        public Animal(String family,String name,int age,boolean isMammal){
            this.family=family;
            this.name=name;
            setAge(age);
            this.isMammal=isMammal;
        }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif (" + age + ").");
            return;
        }
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}

