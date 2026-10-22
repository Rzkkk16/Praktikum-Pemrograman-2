package module4.problem3;

public class Cat extends Pet {
    private String featherColour;

    public Cat (String name, String breed, String featherColour) {
        super(name, breed);
        this.featherColour = featherColour;
    }

    public void displayCatDetail() {
        super.display();
        System.out.println("Memiliki Warna Bulu : " + featherColour);
    }
}
