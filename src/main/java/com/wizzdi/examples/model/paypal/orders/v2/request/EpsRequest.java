package com.wizzdi.examples.model.paypal.orders.v2.request;

public class EpsRequest {

  private String name;

  private String country_code;

  private ExperienceContextBase experience_context;

  /**
   * @return name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name name to set
   * @return EpsRequest
   */
  public <T extends EpsRequest> T setName(String name) {
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
   * @return EpsRequest
   */
  public <T extends EpsRequest> T setCountry_code(String country_code) {
    this.country_code = country_code;
    return (T) this;
  }

  /**
   * @return experience_context
   */
  public ExperienceContextBase getExperience_context() {
    return this.experience_context;
  }

  /**
   * @param experience_context experience_context to set
   * @return EpsRequest
   */
  public <T extends EpsRequest> T setExperience_context(ExperienceContextBase experience_context) {
    this.experience_context = experience_context;
    return (T) this;
  }
}
