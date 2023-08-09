
import java.util.*;


/**
 * Class Appointment
 */
public class Appointment {

  //
  // Fields
  //

  private date date;
  private time time;
  private department department;
  private patient patient;
  
  //
  // Constructors
  //
  public Appointment () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  private void setDate (date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  private date getDate () {
    return date;
  }

  /**
   * Set the value of time
   * @param newVar the new value of time
   */
  private void setTime (time newVar) {
    time = newVar;
  }

  /**
   * Get the value of time
   * @return the value of time
   */
  private time getTime () {
    return time;
  }

  /**
   * Set the value of department
   * @param newVar the new value of department
   */
  private void setDepartment (department newVar) {
    department = newVar;
  }

  /**
   * Get the value of department
   * @return the value of department
   */
  private department getDepartment () {
    return department;
  }

  /**
   * Set the value of patient
   * @param newVar the new value of patient
   */
  private void setPatient (patient newVar) {
    patient = newVar;
  }

  /**
   * Get the value of patient
   * @return the value of patient
   */
  private patient getPatient () {
    return patient;
  }

  //
  // Other methods
  //

  /**
   */
  public void getpatient()
  {
  }


  /**
   */
  public void cehcavailability()
  {
  }


  /**
   */
  public void checkpatient()
  {
  }


}


import java.util.*;


/**
 * Class Hospital
 */
public class Hospital {

  //
  // Fields
  //

  private String name;
  private String address;
  private list<department> department;
  
  //
  // Constructors
  //
  public Hospital () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  private void setAddress (String newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  private String getAddress () {
    return address;
  }

  /**
   * Set the value of department
   * @param newVar the new value of department
   */
  private void setDepartment (list<department> newVar) {
    department = newVar;
  }

  /**
   * Get the value of department
   * @return the value of department
   */
  private list<department> getDepartment () {
    return department;
  }

  //
  // Other methods
  //

  /**
   */
  public void adddepartment_department_Department_()
  {
  }


  /**
   */
  public void removedepartment_department_department_()
  {
  }


  /**
   * @return       list<department>
   */
  public list<department> getdepartment()
  {
  }


  /**
   * @return       String
   */
  public String setname()
  {
  }


  /**
   * @return       String
   */
  public String getname()
  {
  }


  /**
   * @return       String
   */
  public String set_address_address_()
  {
  }


  /**
   * @return       String
   */
  public String get_address()
  {
  }


}
