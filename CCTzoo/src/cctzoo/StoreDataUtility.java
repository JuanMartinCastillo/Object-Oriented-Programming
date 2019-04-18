package cctzoo;

import java.util.Random;

public class StoreDataUtility {

    public int ExNumber() {
        int number = (int) (Math.random() * 100) + 1;
        return number;
    }

    public String gender() {
        int number = (int) (Math.random() * 2) + 1;
        if (number == 1) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public String offspring() {
        int number = (int) (Math.random() * 2) + 1;
        if (number == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String vaccine() {
        int number = (int) (Math.random() * 2) + 1;
        if (number == 1) {
            return "yes";
        } else {
            return "No";
        }
    }

    public String medication() {
        int number = (int) (Math.random() * 2) + 1;
        if (number == 1) {
            Random rm = new Random();
            return medication[rm.nextInt(medication.length)];
        } else {
            return "No";
        }
    }

    public String[] type = new String[]{"Mammal", "Reptile", "Aquatic-Avian", "Avian-Insect", "Insect", "Aquatic-Mammal", "Aquatic-Reptiles"};

    public String[] mammals = new String[]{"red fox", "fennec fox", "artic fox", "giant panda", "asian black bear", "brown bear", "polar bear",
        "asiatic lion", "bengal tiger", "siberian tiger", "african leopard", "persion leopard", "chimpanzee", "gorilla", "orangutan", "lemur", "baboons",
        "rat", "mouse", "hamster", "squirrel"};

    public String[] insects = new String[]{"fire ant", "black garden ant", "carpenter ant", "mantidae", "cornu aspersum",
        "tarantulas", "widow spider", "wolf spider", "cellar spider"};

    public String[] reptiles = new String[]{"leopard gecko", "knight anole", "panther chameleon", "rhinoceros iguana", "flap-necked chameleon",
        "komodo dragon", "anaconda", "vipers", "python", "cobra", "boa", "kingsnakes"};

    public String[] aquaticMammals = new String[]{"earless seal", "sea lion", "walrus", "eared seal", "humpback whale", "sperm whale", " blue whale",
        "beluga whale", "gray whale", "bottlenose dolphin", "killer whale", "baiji", "amazon river dolphin", "striped dolphin",
        "risso's dolphin", "spinner dolphin", "dusky dolphin"};

    public String[] aquaticAvians = new String[]{"mallard", "black-bellied whistling duck", "marbled duck",
        "mute swan", "cygnini", "black swan", "whooper swan", "tundra swan"};

    public String[] avianInsects = new String[]{"swalowtail butterfly", "skipper", "pieridae", "lycaenidae", "hedylidae",
        "honey bee", "carpenter bee", "sweat bee", "european hornet", "asian giant hornet", "avispa", "oriental hornet", "mosquito",
        "fruit flies", "tsetse fly", "black fly", "crane fly", "ladybird", "scarabs", "stag beetle", "leaf beetle", "firefly"};

    public String[] aquaticReptiles = new String[]{"saltwater crocodile", "nile crocodile", "mugger crocodile",
        "american alligator", "chinese alligater", "alligator prenasaliss", "sea turtle", "box turtle", "emydidae", "pelomedusa"};

    public String[] dateOfBirth = new String[]{"10/02/2004", "10/03/2011", "08/10/2012", "30/04/2008", "12/12/2017",
        "04/04/2005", "18/12/2006", "28/07/2003", "12/07/2002", "21/04/2005", "29/08/2011", "15/12/2006", "20/11/2015", "01/02/2005",
        "03/02/2013", "23/11/2012", "10/03/2003", "13/02/2003", "18/07/2003", "29/04/2017", "18/04/2007", "29/06/2012", "09/05/2002",
        "25/09/2012", "08/07/2005", "29/05/2012", "03/08/2008", "03/10/2017", "13/10/2005", "18/10/2003", "26/05/2012", "09/04/2008",
        "01/01/2007", "15/08/2016", "19/10/2015", "26/11/2004", "20/04/2011", "15/11/2009", "20/07/2015", "27/03/2002", "06/01/2003",
        "05/01/2009", "03/08/2012", "19/08/2011", "14/11/2017", "15/06/2007", "18/12/2017", "23/09/2008", "03/04/2008", "27/05/2010",
        "23/04/2008", "16/12/2006", "01/11/2004", "24/06/2015", "16/11/2014", "21/03/2017", "16/03/2012", "17/03/2016", "21/06/2005",
        "29/11/2002", "03/12/2016", "27/06/2009", "22/02/2015", "05/06/2017", "05/06/2013", "14/12/2007", "23/02/2007", "25/01/2017",
        "21/07/2014", "24/01/2011", "11/07/2013", "11/08/2017", "11/02/2005", "12/09/2008", "24/04/2002", "10/05/2014", "21/03/2005",
        "07/07/2012", "01/08/2008", "10/11/2002", "03/04/2018", "15/04/2004", "06/10/2017", "10/01/2012", "14/05/2007", "19/03/2010",
        "13/11/2003", "13/06/2017", "01/04/2010", "19/01/2005", "17/11/2007", "30/07/2010", "11/09/2002", "01/02/2009", "23/09/2009",
        "04/07/2007", "10/01/2003", "24/12/2012", "25/09/2007", "16/11/2012", "11/01/2012"};

    public String[] dateOfArrival = new String[]{"08/07/2017", "09/01/2018", "10/05/2017", "27/03/2016", "19/11/2017", "05/03/2016", "19/05/2017",
        "14/06/2017", "09/01/2018", "01/10/2016", "15/02/2018", "21/03/2016", "06/09/2017", "27/01/2018",
        "06/01/2016", "01/09/2016", "17/09/2017", "19/06/2016", "24/04/2017", "30/09/2017", "06/04/2018",
        "18/12/2016", "01/04/2018", "19/03/2017", "07/11/2016", "30/07/2016", "29/05/2016", "22/08/2017",
        "23/01/2017", "29/09/2016", "02/01/2016", "02/02/2018", "05/02/2017", "05/04/2017", "08/03/2017",
        "02/04/2017", "22/12/2016", "10/05/2016", "15/01/2018", "17/01/2016", "11/01/2017", "11/02/2018",
        "14/09/2017", "05/01/2017", "04/03/2018", "23/09/2016", "30/01/2016", "25/02/2017", "15/12/2017",
        "02/03/2017", "24/11/2017", "05/02/2017", "13/09/2017", "25/02/2016", "07/05/2016", "05/03/2018",
        "26/01/2016", "09/03/2017", "23/06/2017", "25/01/2016", "23/07/2016", "13/08/2017", "17/05/2017",
        "14/02/2017", "25/03/2016", "24/02/2018", "09/04/2016", "28/09/2017", "24/02/2017", "08/08/2016",
        "29/07/2016", "18/02/2017", "28/01/2016", "22/04/2018", "18/05/2017", "27/10/2016", "22/01/2018",
        "18/02/2017", "17/12/2016", "02/05/2017", "10/09/2017", "11/03/2016", "03/01/2017", "23/02/2016",
        "27/11/2016", "18/11/2016", "20/08/2016", "02/05/2017", "06/02/2017", "22/02/2016", "19/10/2016",
        "06/04/2018", "13/08/2016", "20/06/2017", "12/09/2016", "24/05/2016", "13/11/2017", "27/09/2016",
        "08/01/2018", "23/03/2018", "24/03/2018"};

    public String[] keeper = new String[]{"Leroy Master", "Clifton Blackshear", "Sonny Culler", "Eddie Deere",
        "Luciano Milne", "Omer Montrose", "Cornell Shrum", "Miles Minear", "Dominique Bengtson", "Carroll Bergeson", "Charley Stpierre",
        "Vito Rhinehart", "Val Holmstrom", "Jose Ranney", "Freeman Jan", "Dante Nussbaum", "Rodrick Corner", "Elroy Wiren",
        "Fredrick Vezina", "Quentin Clyburn", "Evangelina Baade", "Daine Hawke", "Lulu Alford", "Donna Byram", "Margery Steptoe",
        "Gertude Marth", "Saturnina Borne", "Tera Brazee", "Willetta Mcdivitt", "Jonie Pertuit", "Kaycee Freed", "Shari Hasting",
        "Branda Waddy", "Laraine Karp", "Mandie Anson", "Easter Muszynski", "Lilli Senior", "Sybil Bartlebaugh", "Lilian Harville",
        "Dawn Flippen"};

    public String[] medication = new String[]{"alsutrace", "ademnazole", "acetafinil", "pemizone", "cerephine", "ribaclude",
        "pancreferol epzirabine", "neopex acycvirenz", "boospan hemanovate", "romathacin clarinate"};

}
