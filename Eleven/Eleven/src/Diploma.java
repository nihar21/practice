
public class Diploma {

    public String name;
    public String major;

    public Diploma(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String toString() {
        return "This certifies that " + name + "\nhas completed a course in " + major;
    }

    public static void main(String[] args) {
        Diploma diploma1 = new Diploma("Murray Smith", "Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
        System.out.println(diploma2);
        System.out.println();
    }


}

