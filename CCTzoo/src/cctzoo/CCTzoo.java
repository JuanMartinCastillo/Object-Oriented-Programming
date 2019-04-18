package cctzoo;

public class CCTzoo {

    public static void main(String[] args) {

        System.out.println("WELCOME TO CCTzoo ADMIN");
        System.out.println();
        System.out.println("Please select the action you would like to perform:");
        System.out.println();

        ZooSetUp st = new ZooSetUp();
        st.BuildAnimals();
        MenuZoo men = new MenuZoo();
        men.menu(st);

    }

}
