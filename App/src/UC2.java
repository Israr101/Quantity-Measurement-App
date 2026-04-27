public class UC2 {

    // Inner class for Feet
    static class Feet {
        private final double value;

        public Feet(double value) {
            if (Double.isNaN(value)) {
                throw new IllegalArgumentException("Invalid Feet value");
            }
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Inner class for Inches
    static class Inches {
        private final double value;

        public Inches(double value) {
            if (Double.isNaN(value)) {
                throw new IllegalArgumentException("Invalid Inches value");
            }
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Method to check Feet equality
    public static boolean checkFeetEquality(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    // Method to check Inches equality
    public static boolean checkInchesEquality(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }

    // Main method
    public static void main(String[] args) {

        // Feet comparison
        double feet1 = 1.0;
        double feet2 = 1.0;

        boolean feetResult = checkFeetEquality(feet1, feet2);
        System.out.println("Feet: " + feet1 + " ft and " + feet2 + " ft → Equal (" + feetResult + ")");

        // Inches comparison
        double inch1 = 1.0;
        double inch2 = 1.0;

        boolean inchResult = checkInchesEquality(inch1, inch2);
        System.out.println("Inches: " + inch1 + " in and " + inch2 + " in → Equal (" + inchResult + ")");
    }
}