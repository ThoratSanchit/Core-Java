// Enum — a special class representing a fixed set of constants
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Enum with fields and methods
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;    // in kilograms
    private final double radius;  // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}

public class EnumsDemo {
    public static void main(String[] args) {

        // Basic usage
        Day today = Day.WEDNESDAY;
        System.out.println(today);           // WEDNESDAY
        System.out.println(today.name());    // WEDNESDAY
        System.out.println(today.ordinal()); // 2 (0-indexed)

        // Switch with enum
        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("Weekend!");
            default -> System.out.println("Weekday: " + today);
        }

        // Iterate all values
        for (Day d : Day.values()) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Enum from string
        Day friday = Day.valueOf("FRIDAY");
        System.out.println(friday);  // FRIDAY

        // Enum with fields
        double earthWeight = 75.0;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s = %.2f%n", p, p.surfaceWeight(mass));
        }

        // Enum in if
        if (today == Day.WEDNESDAY) {
            System.out.println("Midweek!");
        }
    }
}
