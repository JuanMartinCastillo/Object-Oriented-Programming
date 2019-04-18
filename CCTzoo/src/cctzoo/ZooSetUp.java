package cctzoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ZooSetUp {

    Scanner search = new Scanner(System.in);
    Random rm = new Random();
    int numberOfAnimals = 100;
    StoreDataUtility sdu = new StoreDataUtility();

    public ArrayList<Animal> animal = new ArrayList();

    public void BuildAnimals() {
        createData();
        fillAnimal();

    }

    public void createData() {

        for (int i = 0; i < numberOfAnimals; i++) {

            animal.add(new Animal());

        }

    }

    public void fillAnimal() {

        for (Animal a : animal) {
            a.setType(sdu.type[rm.nextInt(sdu.type.length)]);
            if (a.getType() == "Reptile") {
                a.setAni(sdu.reptiles[rm.nextInt(sdu.reptiles.length)]);
            } else if (a.getType() == "Mammal") {
                a.setAni(sdu.mammals[rm.nextInt(sdu.mammals.length)]);
            } else if (a.getType() == "Aquatic-Avian") {
                a.setAni(sdu.aquaticAvians[rm.nextInt(sdu.aquaticAvians.length)]);
            } else if (a.getType() == "Avian-Insect") {
                a.setAni(sdu.avianInsects[rm.nextInt(sdu.avianInsects.length)]);
            } else if (a.getType() == "Insect") {
                a.setAni(sdu.insects[rm.nextInt(sdu.insects.length)]);
            } else if (a.getType() == "Aquatic-Mammal") {
                a.setAni(sdu.aquaticMammals[rm.nextInt(sdu.aquaticMammals.length)]);
            } else if (a.getType() == "Aquatic-Reptiles") {
                a.setAni(sdu.aquaticReptiles[rm.nextInt(sdu.aquaticReptiles.length)]);
            }

            a.setDoA(sdu.dateOfArrival[rm.nextInt(sdu.dateOfArrival.length)]);
            a.setDob(sdu.dateOfBirth[rm.nextInt(sdu.dateOfBirth.length)]);
            a.setExNumber(sdu.ExNumber());
            a.setGender(sdu.gender());
            a.setOffspring(sdu.offspring());
            a.setMedication(sdu.medication());
            a.setVaccine(sdu.vaccine());
        }

    }

    public void displayAnimal() {
        for (int i = 0; i < animal.size(); i++) {

            Animal a = animal.get(i);
            System.out.println(i + 1 + " " + a);
        }
    }

    Scanner anim = new Scanner(System.in);
    Scanner txt = new Scanner(System.in);

    public void AddAnimal() {

        System.out.println("Select the kind of animal you would like to add");
        System.out.println("Press 1 to add a Reptile");
        System.out.println("Press 2 to add a Insect");
        System.out.println("Press 3 to add a Mammal");
        System.out.println("Press 4 to add a Aquatic-Avian");
        System.out.println("Press 5 to add a Avian-Insect");
        System.out.println("Press 6 to add a Aquatic-Mammal");
        System.out.println("Press 7 to add a Aquatic-Reptile");
        System.out.println("Press 0 return to the main menu");

        int select = anim.nextByte();
        try {
            switch (select) {
                case 1:
                    System.out.println("What kind of reptile would you like to add?");
                    String rani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + rani);
                    String rdob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + rani);
                    String rdoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + rani);
                    String rgender = txt.nextLine();
                    System.out.println("Does this " + rani + " have offspring?");
                    String roffspring = txt.nextLine();
                    System.out.println("Is this " + rani + " on medication?");
                    String rmedication = txt.nextLine();
                    System.out.println("Have this " + rani + " been vaccinated?");
                    String rvaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + rani);
                    int rexNumber = txt.nextInt();
                    animal.add(new Reptile("Reptile", rani, rdob, rdoa, rgender, roffspring, rmedication, rvaccine, rexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 2:
                    System.out.println("What kind of insect would you like to add?");
                    String iani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + iani);
                    String idob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + iani);
                    String idoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + iani);
                    String igender = txt.nextLine();
                    System.out.println("Does this " + iani + " have offspring?");
                    String ioffspring = txt.nextLine();
                    System.out.println("Is this " + iani + " on medication?");
                    String imedication = txt.nextLine();
                    System.out.println("Have this " + iani + " been vaccinated?");
                    String ivaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + iani);
                    int iexNumber = txt.nextInt();
                    animal.add(new Insect("Insect", iani, idob, idoa, igender, ioffspring, imedication, ivaccine, iexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 3:
                    System.out.println("What kind of mammal would you like to add?");
                    String mani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + mani);
                    String mdob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + mani);
                    String mdoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + mani);
                    String mgender = txt.nextLine();
                    System.out.println("Does this " + mani + " have offspring?");
                    String moffspring = txt.nextLine();
                    System.out.println("Is this " + mani + " on medication?");
                    String mmedication = txt.nextLine();
                    System.out.println("Have this " + mani + " been vaccinated?");
                    String mvaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + mani);
                    int mexNumber = txt.nextInt();
                    animal.add(new Mammal("Mammal", mani, mdob, mdoa, mgender, moffspring, mmedication, mvaccine, mexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 4:
                    System.out.println("What kind of aquatic-avian would you like to add?");
                    String aaani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + aaani);
                    String aadob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + aaani);
                    String aadoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + aaani);
                    String aagender = txt.nextLine();
                    System.out.println("Does this " + aaani + " have offspring?");
                    String aaoffspring = txt.nextLine();
                    System.out.println("Is this " + aaani + " on medication?");
                    String aamedication = txt.nextLine();
                    System.out.println("Have this " + aaani + " been vaccinated?");
                    String aavaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + aaani);
                    int aaexNumber = txt.nextInt();
                    animal.add(new AquaticAvian("Aquatic-Avian", aaani, aadob, aadoa, aagender, aaoffspring, aamedication, aavaccine, aaexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 5:
                    System.out.println("What kind of avian-insect would you like to add?");
                    String aiani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + aiani);
                    String aidob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + aiani);
                    String aidoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + aiani);
                    String aigender = txt.nextLine();
                    System.out.println("Does this " + aiani + " have offspring?");
                    String aioffspring = txt.nextLine();
                    System.out.println("Is this " + aiani + " on medication?");
                    String aimedication = txt.nextLine();
                    System.out.println("Have this " + aiani + " been vaccinated?");
                    String aivaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + aiani);
                    int aiexNumber = txt.nextInt();
                    animal.add(new AvianInsect("Avian-Insect", aiani, aidob, aidoa, aigender, aioffspring, aimedication, aivaccine, aiexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 6:
                    System.out.println("What kind of aquatic-mammal would you like to add?");
                    String amani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + amani);
                    String amdob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + amani);
                    String amdoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + amani);
                    String amgender = txt.nextLine();
                    System.out.println("Does this " + amani + " have offspring?");
                    String amoffspring = txt.nextLine();
                    System.out.println("Is this " + amani + " on medication?");
                    String ammedication = txt.nextLine();
                    System.out.println("Have this " + amani + " been vaccinated?");
                    String amvaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + amani);
                    int amexNumber = txt.nextInt();
                    animal.add(new AquaticMammal("Aquatic-Mammal", amani, amdob, amdoa, amgender, amoffspring, ammedication, amvaccine, amexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 7:
                    System.out.println("What kind of aquatic-reptile would you like to add?");
                    String arani = txt.nextLine();
                    System.out.println("Please enter the day of birth of the " + arani);
                    String ardob = txt.nextLine();
                    System.out.println("Please enter the day of the arrival of the " + arani);
                    String ardoa = txt.nextLine();
                    System.out.println("Which is the gender of this " + arani);
                    String argender = txt.nextLine();
                    System.out.println("Does this " + arani + " have offspring?");
                    String aroffspring = txt.nextLine();
                    System.out.println("Is this " + arani + " on medication?");
                    String armedication = txt.nextLine();
                    System.out.println("Have this " + arani + " been vaccinated?");
                    String arvaccine = txt.nextLine();
                    System.out.println("Please enter the cage number for this " + arani);
                    int arexNumber = txt.nextInt();
                    animal.add(new AquaticReptile("Aquatic-Reptile", arani, ardob, ardoa, argender, aroffspring, armedication, arvaccine, arexNumber));
                    System.out.println("Animal added succesfully!\n\n");
                    break;

                case 0:
                    new MenuZoo();
                    break;

                default:
                    System.out.println("Please Enter a valid option.!");

            }

        } catch (InputMismatchException e) {
            System.out.println("please try again");
            System.out.println();
            System.out.println("");

        }
        new MenuZoo();
    }

    public void searchAnimal() {

        System.out.println("Please enter the type or name of the animal you would like to search or pres 0 to go back to the main menu");
        String ani = search.nextLine();

        for (Animal a : animal) {
            if (a.getAni().equals(ani) || a.getType().equals(ani)) {

                System.out.println(a);
            }
        }
    }

    public void updateAnimal() {
        System.out.println("Enter the name of the animal that you would like to modify");
        String ani = txt.nextLine();
        for (Animal a : animal) {
            if (a.getAni().equals(ani)) {
                System.out.println(a);
                System.out.println("Enter the name of the animal");
                String newName = txt.nextLine();
                a.setAni(newName);
                System.out.println("Enter the dob of the animal");
                String newDoB = txt.nextLine();
                a.setDob(newDoB);
                System.out.println("Enter the doa of the animal");
                String newDoA = txt.nextLine();
                a.setDoA(newDoA);
                System.out.println("Enter the gender of the animal");
                String newGender = txt.nextLine();
                a.setGender(newGender);
                System.out.println("Enter offspring of the animal");
                String newOffspring = txt.nextLine();
                a.setOffspring(newOffspring);
                System.out.println("Enter the medication of the animal");
                String newMedication = txt.nextLine();
                a.setMedication(newMedication);
                System.out.println("Enter if the animals has been vaccinated");
                String newVaccine = txt.nextLine();
                a.setVaccine(newVaccine);
            }
        }
    }
}
