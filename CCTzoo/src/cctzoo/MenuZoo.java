package cctzoo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuZoo {

    Scanner sc = new Scanner(System.in);

    public void menu(ZooSetUp st) {

        System.out.println("1 To start a search");
        System.out.println("2 To add a new animal");
        System.out.println("3 To add a new keeper");
        System.out.println("4 To update an existing animal");
        System.out.println("5 To update an existing keeper");
        System.out.println("6 To display animals");
        System.out.println("0 To exit the program");

        int action = sc.nextInt();

        try {
            switch (action) {
                case 1:
                    Scanner sl = new Scanner(System.in);

                    System.out.println("1 To search an animal");
                    System.out.println("2 To search a kepper");

                    int selection = sl.nextInt();

                    try {
                        switch (selection) {
                            case 1:
                                st.BuildAnimals();
                                st.searchAnimal();
                                menu(st);

                                break;
                            case 2:
                                System.out.println("you have chosen search for a kepper");
                                break;
                            default:
                                System.out.println("please try again");
                                System.out.println();
                                menu(st);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("please try again");
                        System.out.println();
                        menu(st);
                    }
                    break;
                case 2:
                    st.AddAnimal();
                    menu(st);
                    break;
                case 3:
                    System.out.println("you have chosen a kepper");
                    break;
                case 4:
                    st.updateAnimal();
                    menu(st);
                    break;
                case 5:
                    System.out.println("you have chosen update a keeper");
                    break;
                case 6:
                    st.displayAnimal();
                    menu(st);
                case 0:
                    System.out.println("Thanks");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid action");
                    System.out.println();
                    menu(st);

            }
        } catch (InputMismatchException e) {
            System.out.println("Please try again");

            sc.next();
            menu(st);

        }

    }

}
