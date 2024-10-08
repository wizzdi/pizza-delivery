package com.wizzdi.examples.model.paypal.orders.v2.response;

public class Eps {

  private String name;

  private String country_code;

  private String bic;

  /**
   * @return name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name name to set
   * @return Eps
   */
  public <T extends Eps> T setName(String name) {
    this.name = name;
    return (T) this;
  }

  /**
   * @return country_code
   */
  public String getCountry_code() {
    return this.country_code;
  }

  /**
   * @param country_code country_code to set
   * @return Eps
   */
  public <T extends Eps> T setCountry_code(String country_code) {
    this.country_code = country_code;
    return (T) this;
  }

  /**
   * @return bic
   */
  public String getBic() {
    return this.bic;
  }

  /**
   * @param bic bic to set
   * @return Eps
   */
  public <T extends Eps> T setBic(String bic) {
    this.bic = bic;
    return (T) this;
  }
}
