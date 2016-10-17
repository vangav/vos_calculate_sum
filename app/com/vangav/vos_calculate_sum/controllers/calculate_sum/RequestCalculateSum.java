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

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vangav.backend.play_framework.param.ParamOptionality;
import com.vangav.backend.play_framework.param.ParamType;
import com.vangav.backend.play_framework.request.RequestJsonBodyGet;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * RequestCalculateSum represents the request's structure
 * */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestCalculateSum extends RequestJsonBodyGet {

  @Override
  @JsonIgnore
  protected String getName () throws Exception {

    return "CalculateSum";
  }

  @Override
  @JsonIgnore
  protected RequestCalculateSum getThis () throws Exception {

    return this;
  }

  @JsonIgnore
  public static final String kAName = "a";
  @JsonProperty
  public float a;

  @JsonIgnore
  public static final String kBName = "b";
  @JsonProperty
  public float b;

  @Override
  @JsonIgnore
  public RequestCalculateSum fromQueryString (
    Map<String, String[]> query) throws Exception {

    this.a = this.getFloat(kAName, query);
    this.b = this.getFloat(kBName, query);

    return this;
  }

  @Override
  @JsonIgnore
  public void validate () throws Exception {

    this.validate(
      kAName,
      this.a,
      ParamType.FLOAT,
      ParamOptionality.MANDATORY);

    this.validate(
      kBName,
      this.b,
      ParamType.FLOAT,
      ParamOptionality.MANDATORY);

  }
}
