
public class DiplomaWithHonors extends Diploma {
    public DiplomaWithHonors(String name, String Major) {
        super(name, Major);
    }

    @Override
    public String toString() {
        return super.toString() + "\n*** with honors ***";
    }
}
