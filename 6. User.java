
import java.util.*;


/**
 * Class claim
 */
public class claim {

  //
  // Fields
  //

  private String claimnumber;
  private date datefiled;
  private money premiumamount;
  
  //
  // Constructors
  //
  public claim () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of claimnumber
   * @param newVar the new value of claimnumber
   */
  private void setClaimnumber (String newVar) {
    claimnumber = newVar;
  }

  /**
   * Get the value of claimnumber
   * @return the value of claimnumber
   */
  private String getClaimnumber () {
    return claimnumber;
  }

  /**
   * Set the value of datefiled
   * @param newVar the new value of datefiled
   */
  private void setDatefiled (date newVar) {
    datefiled = newVar;
  }

  /**
   * Get the value of datefiled
   * @return the value of datefiled
   */
  private date getDatefiled () {
    return datefiled;
  }

  /**
   * Set the value of premiumamount
   * @param newVar the new value of premiumamount
   */
  private void setPremiumamount (money newVar) {
    premiumamount = newVar;
  }

  /**
   * Get the value of premiumamount
   * @return the value of premiumamount
   */
  private money getPremiumamount () {
    return premiumamount;
  }

  //
  // Other methods
  //

  /**
   */
  public void getstatus()
  {
  }


  /**
   */
  public void processclaim()
  {
  }


}


import java.util.*;


/**
 * Class User
 */
public class User {

  //
  // Fields
  //

  private String username;
  private String password;
  private String email;
  private String firstname;
  private String lastname;
  
  //
  // Constructors
  //
  public User () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of username
   * @param newVar the new value of username
   */
  private void setUsername (String newVar) {
    username = newVar;
  }

  /**
   * Get the value of username
   * @return the value of username
   */
  private String getUsername () {
    return username;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  private void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  private String getPassword () {
    return password;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  private void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  private String getEmail () {
    return email;
  }

  /**
   * Set the value of firstname
   * @param newVar the new value of firstname
   */
  private void setFirstname (String newVar) {
    firstname = newVar;
  }

  /**
   * Get the value of firstname
   * @return the value of firstname
   */
  private String getFirstname () {
    return firstname;
  }

  /**
   * Set the value of lastname
   * @param newVar the new value of lastname
   */
  private void setLastname (String newVar) {
    lastname = newVar;
  }

  /**
   * Get the value of lastname
   * @return the value of lastname
   */
  private String getLastname () {
    return lastname;
  }

  //
  // Other methods
  //

  /**
   */
  public void viewpolicydetails()
  {
  }


  /**
   */
  public void fileclaim()
  {
  }


}
