/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * no license, I know you already got more than enough to worry about
 * keep going, never give up
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_calculate_sum.controllers.calculate_sum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vangav.backend.play_framework.request.response.ResponseBodyJson;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * ResponseCalculateSum represents the response's structure
 * */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseCalculateSum extends ResponseBodyJson {

  @Override
  @JsonIgnore
  protected String getName () throws Exception {

    return "CalculateSum";
  }

  @Override
  @JsonIgnore
  protected ResponseCalculateSum getThis () throws Exception {

    return this;
  }

  @JsonProperty
  public double c;

  @JsonIgnore
  public void set (
    double c) {

    this.c = c;
  }
}
