
import java.util.*;


/**
 * Class intermediate_officer
 */
public class intermediate_officer {

  //
  // Fields
  //

  private String vehicle_details;
  private String owner_details;
  private String render_details;
  
  //
  // Constructors
  //
  public intermediate_officer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of vehicle_details
   * @param newVar the new value of vehicle_details
   */
  private void setVehicle_details (String newVar) {
    vehicle_details = newVar;
  }

  /**
   * Get the value of vehicle_details
   * @return the value of vehicle_details
   */
  private String getVehicle_details () {
    return vehicle_details;
  }

  /**
   * Set the value of owner_details
   * @param newVar the new value of owner_details
   */
  private void setOwner_details (String newVar) {
    owner_details = newVar;
  }

  /**
   * Get the value of owner_details
   * @return the value of owner_details
   */
  private String getOwner_details () {
    return owner_details;
  }

  /**
   * Set the value of render_details
   * @param newVar the new value of render_details
   */
  private void setRender_details (String newVar) {
    render_details = newVar;
  }

  /**
   * Get the value of render_details
   * @return the value of render_details
   */
  private String getRender_details () {
    return render_details;
  }

  //
  // Other methods
  //

  /**
   */
  public void render_vehicle()
  {
  }


  /**
   */
  public void receive_payment()
  {
  }


  /**
   */
  public void return_vehicle()
  {
  }


}


import java.util.*;


/**
 * Class vehicle_owner
 */
public class vehicle_owner {

  //
  // Fields
  //

  private void vehicle_details;
  private int rending_amount;
  
  //
  // Constructors
  //
  public vehicle_owner () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of vehicle_details
   * @param newVar the new value of vehicle_details
   */
  private void setVehicle_details (void newVar) {
    vehicle_details = newVar;
  }

  /**
   * Get the value of vehicle_details
   * @return the value of vehicle_details
   */
  private void getVehicle_details () {
    return vehicle_details;
  }

  /**
   * Set the value of rending_amount
   * @param newVar the new value of rending_amount
   */
  private void setRending_amount (int newVar) {
    rending_amount = newVar;
  }

  /**
   * Get the value of rending_amount
   * @return the value of rending_amount
   */
  private int getRending_amount () {
    return rending_amount;
  }

  //
  // Other methods
  //

  /**
   */
  public void render_vehicle()
  {
  }


  /**
   */
  public void not_render_vehile()
  {
  }


}
