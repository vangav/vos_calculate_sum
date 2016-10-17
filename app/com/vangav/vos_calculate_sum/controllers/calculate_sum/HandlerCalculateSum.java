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

import com.vangav.backend.play_framework.request.Request;
import com.vangav.backend.play_framework.request.RequestJsonBody;
import com.vangav.backend.play_framework.request.response.ResponseBody;
import com.vangav.vos_calculate_sum.controllers.CommonPlayHandler;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * HandlerCalculateSum
 *   handles request-to-response processing
 *   also handles after response processing (if any)
 * */
public class HandlerCalculateSum extends CommonPlayHandler {

  private static final String kName = "CalculateSum";

  @Override
  protected String getName () {

    return kName;
  }

  @Override
  protected RequestJsonBody getRequestJson () {

    return new RequestCalculateSum();
  }

  @Override
  protected ResponseBody getResponseBody () {

    return new ResponseCalculateSum();
  }

  @Override
  protected void processRequest (final Request request) throws Exception {

    // use the following request Object to process the request and set
    //   the response to be returned
    RequestCalculateSum requestCalculateSum =
      (RequestCalculateSum)request.getRequestJsonBody();
    
    ((ResponseCalculateSum)request.getResponseBody() ).set(
      requestCalculateSum.a + requestCalculateSum.b);
  }
}
