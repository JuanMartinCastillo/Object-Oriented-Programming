package cctzoo;

public class AquaticAvian extends Animal implements AquaticInterface, AvianInterface {

    public AquaticAvian() {
    }

    public AquaticAvian(String type, String ani, String Dob, String DoA, String gender, String offspring, String medication, String vaccine, int exNumber) {
        super(type, ani, Dob, DoA, gender, offspring, medication, vaccine, exNumber);
    }

    public String type() {
        return "AquaticAvian";
    }

}
