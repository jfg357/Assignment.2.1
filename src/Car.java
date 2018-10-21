import java.util.*;

public final class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
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

  public String getExteriorFeatures() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }
    return list;
  }


  public String getInteriorFeatures() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }
    return list;
  }

  public String toString() {
    String list = "";
    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      }
      else {
        list += "\n" + this.feature[i];
      }
    }
    return super.toString() + "\n" + "Features : " + "\n" + list + "\n"
        + "Car Axle : " + carAxle;
  }
}
