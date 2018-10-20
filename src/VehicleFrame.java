public class VehicleFrame implements Chassis {

  public static String vehicleFrameType;

  public VehicleFrame(){
    setChassisType("Unibody");
  }

  public VehicleFrame(String vehicleFrameType){
    setVehicleFrameType(vehicleFrameType);
  }

  @Override
  public Chassis getChassisType()  {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    setVehicleFrameType(vehicleFrameType);
  }

  public void setVehicleFrameType(String vehicleFrameType) {
    VehicleFrame.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    if (VehicleFrame.vehicleFrameType.equals("Unibody")){
      return "Chassis           : " + VehicleFrame.chassis +
          "\nVehicle Frame     : " + VehicleFrame.vehicleFrameType;
    }
    else {
      return "Vehicle Frame     : " + VehicleFrame.vehicleFrameType;
    }
  }
}
