import java.util.*;

public class ManufacturedEngine implements Engine{

  private static String engineManufacturer;
  private static Date engineManufacturedDate;
  private static String engineMake;
  private static String engineModel;
  private static String engineType;
  private static int engineCylinders;
  private static String driveTrain;

  public ManufacturedEngine(){
      String engineManufacturer = "";
      Date engineManufacturedDate = new Date();
      String engineMake = "";
      String engineModel = "";
      String engineType = "";
      int engineCylinders = 0;
      String driveTrain = "";
  }
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      String engineType,
      int engineCylinders,
      String driveTrain) {
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }
}
