import java.io.*;
import java.util.*;
public class Project4 {
    public static void main(String[] args) throws IOException {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter gender: ");
        String gender = input.next();
        System.out.print("Enter name: ");
        String name = input.next();
        input.close();

        // Creates an arraylist of names from file according to year by calling loadNames method 
        ArrayList<BabyName> names = loadNames("babynameranking"+year+".txt");
        BabyName bName = findName(name, year, names);

        // If findName returns null (i.e. name isn't found), prints alternate message
        if (bName != null) {
            System.out.println(bName.getName()+" is ranked #"+bName.getRanking()+" in year "+bName.getYear());
        } else {
            System.out.println("The name "+name+" is not ranked in year "+year);
        }
    }

    private static ArrayList<BabyName> loadNames(String fileName) throws IOException {
        // Creates arraylist and new file object
        ArrayList<BabyName> data = new ArrayList<BabyName>();
        File file = new File(fileName);
        // If filename doesn't exist (i.e. typo or year < 2001 or > 2010), throws exception
        if (!file.exists()) {
            throw new IOException("File "+fileName+" doesn't exist.");
        }
        // Grabs year from file name
        int year = Integer.parseInt(fileName.substring(15, 19));
        // Grabs data from file
        try (Scanner scan = new Scanner(file);) {
            // While there is another line
            while (scan.hasNextLine()) {
                // Grabs rank from first int
                int rank = Integer.parseInt(scan.next());
                // Male and female names are ajacent to each other per line, so we can just create two babynames per line (one male, one female)
                String nameM = scan.next();
                String nameF = scan.next();
                // Adds new BabyName object with parsed data from file
                data.add(new BabyName(rank, nameM, "M", year));
                data.add(new BabyName(rank, nameF, "F", year));
            }
        }
        return data;
    }

    private static BabyName findName(String name, int year, ArrayList<BabyName> names) {
        // Searches passed ArrayList names
        for (BabyName babyName : names) {
            // If babyName's name equals 
            if (babyName.getName().equals(name)) {
                return babyName;
            }
        }
        // If the name isn't found, returns null
        return null;
    }
}

class BabyName {
    // Data fields
    private int ranking;
    private String name;
    private String gender;
    private int year;

    // Constructors
    BabyName(int ranking, String name, String gender, int year) {
        this.ranking = ranking;
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    // Getters
    public int getRanking() {
        return ranking;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getYear() {
        return year;
    }

    public String toString() {
        return this.ranking+", "+this.name+", "+this.gender+", "+this.year;
    } 
}