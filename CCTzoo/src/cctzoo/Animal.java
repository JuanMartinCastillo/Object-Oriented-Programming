package cctzoo;

class Animal {

    private String Dob;
    private String DoA;
    private String gender;
    private String offspring;
    private String medication;
    private String vaccine;
    private int exNumber;
    private String ani;
    private String type;

    public Animal() {

    }

    public Animal(String type, String ani, String Dob, String DoA, String gender, String offspring, String medication, String vaccine, int exNumber) {
        this.Dob = Dob;
        this.DoA = DoA;
        this.gender = gender;
        this.offspring = offspring;
        this.medication = medication;
        this.vaccine = vaccine;
        this.exNumber = exNumber;
        this.ani = ani;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDob() {
        return Dob;
    }

    public String getDoA() {
        return DoA;
    }

    public String getGender() {
        return gender;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public void setDoA(String DoA) {
        this.DoA = DoA;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }

    public void setOffspring(String offspring) {
        this.offspring = offspring;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public void setExNumber(int exNumber) {
        this.exNumber = exNumber;
    }

    @Override
    public String toString() {
        return "Animal Type: " + this.type + "\n"
                + "Animal: " + this.ani + "\n"
                + "Date of Arribal: " + this.DoA + "\n"
                + "Date of Bird: " + this.Dob + "\n"
                + "Cage Number: " + this.exNumber + "\n"
                + "Gender: " + this.gender + "\n"
                + "Medication: " + this.medication + "\n"
                + "Vaccine: " + this.vaccine + "\n"
                + "Offspring: " + this.offspring + "\n\n";

    }
}
