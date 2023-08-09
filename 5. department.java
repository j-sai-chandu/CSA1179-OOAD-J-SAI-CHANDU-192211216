
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
 * Class department
 */
public class department {

  //
  // Fields
  //

  private String name;
  private list<doctor> doctors;
  private list<nurse> nurses;
  
  //
  // Constructors
  //
  public department () { };
  
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
   * Set the value of doctors
   * @param newVar the new value of doctors
   */
  private void setDoctors (list<doctor> newVar) {
    doctors = newVar;
  }

  /**
   * Get the value of doctors
   * @return the value of doctors
   */
  private list<doctor> getDoctors () {
    return doctors;
  }

  /**
   * Set the value of nurses
   * @param newVar the new value of nurses
   */
  private void setNurses (list<nurse> newVar) {
    nurses = newVar;
  }

  /**
   * Get the value of nurses
   * @return the value of nurses
   */
  private list<nurse> getNurses () {
    return nurses;
  }

  //
  // Other methods
  //

  /**
   */
  public void adddoctor_doctor_doctor_()
  {
  }


  /**
   */
  public void removedoctor_doctor_doctor_()
  {
  }


  /**
   * @return       list<doctor>
   */
  public list<doctor> getdoctor()
  {
  }


  /**
   */
  public void addnurse_nurse_nurse_()
  {
  }


  /**
   */
  public void removenurse_nurse_nurse_()
  {
  }


  /**
   * @return       list<nurse>
   */
  public list<nurse> getnurse()
  {
  }


  /**
   */
  public void setname_name_string_()
  {
  }


  /**
   * @return       String
   */
  public String getname()
  {
  }


}
