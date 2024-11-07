package Day_12_Inheritence_1.in.kgcoding.NestedClasses;

public class Car {
    private static int numberOfDoors;

    public void repair() {
        Tire tw = new Tire(27.36, 45.89, "Rubber");
        System.out.println(tw);
        tw.inflate();
    }

    private static class Tire {
        private double width;
        private double pressure;
        private String material;

        public Tire(double width, double pressure, String material) {
            this.width = width;
            this.pressure = pressure;
            this.material = material;
        }

        @Override
        public String toString() {
            return "Tire [width=" + width + ", pressure=" + pressure + ", material=" + material + "]";
        }

        public void inflate() {
            numberOfDoors = 4; //
            System.out.println(numberOfDoors);
        }
    }
}
