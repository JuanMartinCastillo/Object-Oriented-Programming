package cctzoo;

public class Insect extends Animal {

    public Insect() {
    }

    public Insect(String type, String ani, String Dob, String DoA, String gender, String offspring, String medication, String vaccine, int exNumber) {
        super(type, ani, Dob, DoA, gender, offspring, medication, vaccine, exNumber);

    }

    public String type() {
        return "Insect";
    }

}
