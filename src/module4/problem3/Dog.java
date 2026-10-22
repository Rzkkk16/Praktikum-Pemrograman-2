package module4.problem3;

public class Dog extends Pet {
    private String featherColour;
    private String skill;

    public Dog(String name, String breed, String featherColour, String skill) {
        super(name, breed);
        this.featherColour = featherColour;
        this.skill = skill;
    }

    public void displayDogDetail() {
        super.display();
        System.out.println("Memiliki Warna Bulu : " + featherColour);
        System.out.println("Memiliki Kemampuan : " + skill);
    }
}
