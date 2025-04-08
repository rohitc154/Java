public class EnumBasics {
    public static void main(String[] args) {
        enum Week {
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

            // Week Constructor
            Week() {
                System.out.println("Constructor called for " + this.toString());
            }

            // Week Method
            public void m1() {
                System.out.println("week day is : " + this);
            }
        }

        // Creating object of week
        Week week;
        week = Week.Monday;
        // System.out.println(week);
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        week.m1();
    }
}
