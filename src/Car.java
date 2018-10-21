import java.util.*;

public final class Car extends Vehicle{

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car(){
    super();

    Feature[] feature = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = feature;
    this.carAxle = 2;

  }


  public Car(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake
        , vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }



}
