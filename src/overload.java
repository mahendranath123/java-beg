import java.io.*;

class overload {

    // Method to calculate volume of a sphere
    double volume(double R) {
        return (4.0 / 3.0) * Math.PI * R * R * R;
    }

    // Method to calculate volume of a cylinder
    double volume(double H, double R) {
        return Math.PI * R * R * H;
    }

    // Method to calculate volume of a cubed
    double volume(double L, double B, double H) {
        return L * B * H;
    }

    // Main method for user interaction
    public static void main(String[] args) throws IOException {
        String ch;
        overload calculator = new overload();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Menu:");
            System.out.println("1. Volume of Sphere");
            System.out.println("2. Volume of Cylinder");
            System.out.println("3. Volume of Cuboid");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the sphere:");
                    double radiusSphere = Double.parseDouble(br.readLine());
                    System.out.println("Volume of Sphere: " + calculator.volume(radiusSphere));
                    break;

                case 2:
                    System.out.println("Enter the height of the cylinder:");
                    double heightCylinder = Double.parseDouble(br.readLine());
                    System.out.println("Enter the radius of the cylinder:");
                    double radiusCylinder = Double.parseDouble(br.readLine());
                    System.out.println("Volume of Cylinder: " + calculator.volume(heightCylinder, radiusCylinder));
                    break;

                case 3:
                    System.out.println("Enter the length of the cuboid:");
                    double lengthCuboid = Double.parseDouble(br.readLine());
                    System.out.println("Enter the breadth of the cuboid:");
                    double breadthCuboid = Double.parseDouble(br.readLine());
                    System.out.println("Enter the height of the cuboid:");
                    double heightCuboid = Double.parseDouble(br.readLine());
                    System.out.println(
                            "Volume of Cuboid: " + calculator.volume(lengthCuboid, breadthCuboid, heightCuboid));
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
                    break;
            }

            System.out.println("Do you want to continue? (Y/N)");
            ch = br.readLine();
        } while (ch.equalsIgnoreCase("y"));
    }
}
