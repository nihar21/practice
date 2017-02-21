
public class Time {

    private int hours;
    private int mins;

    Time(int h, int m) throws Exception {
        if (h > 24 || h < 0 || m < 0 || m >= 60) {
            throw new Exception("Something wrong");
        }
        hours = h;
        mins = m;
    }

    private int toMins() {
        return 60 * this.hours + this.mins;
    }

    public boolean lessThan(Time t) {
        if (this.toMins() < t.toMins()) {
            return true;
        } else {
            return false;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int elapsedSince(Time t) {
        return (t.toMins() - this.toMins()) % (24 * 60);
    }

    public String toString() {
        return this.getHours() + " hours and " + this.getMins() + " minutes";
    }

    public static void main(String[] args) {
        Time t1, t2;
        try {
            t1 = new Time(4, 6);
            t2 = new Time(3, 50);

            System.out.println(t1.toMins());
            System.out.println(t1.lessThan(t2));
            System.out.println(t1.elapsedSince(t2));

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
