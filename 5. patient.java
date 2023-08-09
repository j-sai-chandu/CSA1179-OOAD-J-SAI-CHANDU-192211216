
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
 * Class patient
 */
public class patient {

  //
  // Fields
  //

  private String name;
  private int id;
  private String address;
  private String phone;
  private files document;
  
  //
  // Constructors
  //
  public patient () { };
  
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
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private int getId () {
    return id;
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
   * Set the value of phone
   * @param newVar the new value of phone
   */
  private void setPhone (String newVar) {
    phone = newVar;
  }

  /**
   * Get the value of phone
   * @return the value of phone
   */
  private String getPhone () {
    return phone;
  }

  /**
   * Set the value of document
   * @param newVar the new value of document
   */
  private void setDocument (files newVar) {
    document = newVar;
  }

  /**
   * Get the value of document
   * @return the value of document
   */
  private files getDocument () {
    return document;
  }

  //
  // Other methods
  //

  /**
   */
  public void setlnfor()
  {
  }


  /**
   */
  public void getlnfor()
  {
  }


  /**
   */
  public void checkavailability()
  {
  }


  /**
   */
  public void setappointment()
  {
  }


}
