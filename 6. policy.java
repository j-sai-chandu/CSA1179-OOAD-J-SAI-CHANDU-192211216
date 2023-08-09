
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
 * Class policy
 */
public class policy {

  //
  // Fields
  //

  private String policynumber;
  private date startdate;
  private date enddate;
  private money premiumamount;
  
  //
  // Constructors
  //
  public policy () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of policynumber
   * @param newVar the new value of policynumber
   */
  private void setPolicynumber (String newVar) {
    policynumber = newVar;
  }

  /**
   * Get the value of policynumber
   * @return the value of policynumber
   */
  private String getPolicynumber () {
    return policynumber;
  }

  /**
   * Set the value of startdate
   * @param newVar the new value of startdate
   */
  private void setStartdate (date newVar) {
    startdate = newVar;
  }

  /**
   * Get the value of startdate
   * @return the value of startdate
   */
  private date getStartdate () {
    return startdate;
  }

  /**
   * Set the value of enddate
   * @param newVar the new value of enddate
   */
  private void setEnddate (date newVar) {
    enddate = newVar;
  }

  /**
   * Get the value of enddate
   * @return the value of enddate
   */
  private date getEnddate () {
    return enddate;
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
   * @return       String
   */
  public String getpolicydetails()
  {
  }


}
