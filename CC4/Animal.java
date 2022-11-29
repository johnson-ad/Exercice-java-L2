
public class Animal {

    private String nomAnimal, typeAnimal;

    public String getNomAnimal() {
        return this.nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getTypeAnimal() {
        return this.typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public Animal(String nom, String typeAn) {
        this.nomAnimal = nom;
        this.typeAnimal = typeAn;
    }

    public String deplacer() {

        switch (getTypeAnimal()) {
            case "serpent":
                return "rompe";
            case "poisson":
                return "nage";
            case "chat":
                return "marche";
            default:
                return "Mode de deplacement inconnue !";

        }

    }

    @Override
    public String toString() {

        return "---------------------\nAnnimal type : " + getTypeAnimal() + "\nAnimal name : " + getNomAnimal()
                + " the " + getTypeAnimal() + "\nAnimal moves : " + deplacer() + "\n--------------------";

    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Milou", "chat");
        System.out.println(animal1.toString());
    }

}