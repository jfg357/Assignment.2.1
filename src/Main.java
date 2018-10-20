public class Main {

  public static void main(String[] args) {
    // write your code here
    testVehicleChassis();
    testVehicleFrame();
  }

  public static void testVehicleChassis() {
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());
  }

  public static void testVehicleFrame() {
    // Step 4 Test
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);
  }
}
