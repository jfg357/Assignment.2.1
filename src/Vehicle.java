import java.util.*;

public class Vehicle implements Engine, Chassis{

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  public Vehicle(){
    setEngineManufacturedDate(new Date());
    setEngineManufacturer("Generic");
    setEngineMake("Generic");
    setEngineModel("Generic");
    setEngineType("None");
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("88 AKI");
    this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
  }

  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine) {

    setEngineManufacturedDate(vehicleManufacturedDate);
    setEngineManufacturer(vehicleManufacturer);
    setEngineMake(vehicleMake);
    setEngineModel(vehicleModel);
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = vehicleEngine;

  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  public String toString() {
    return "Manufacturer Name : " + this.vehicleManufacturer + "\n"
        + "Manufactured Date : " + this.vehicleManufacturedDate.toString() + "\n"
        + "Vehicle Make : " + this.vehicleMake + "\n"
        + "Vehicle Model : " + this.vehicleModel + "\n"
        + "Vehicle Type : " + this.vehicleType + "\n"
        + vehicleEngine.toString();
  }
}
