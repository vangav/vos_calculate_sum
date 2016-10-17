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

import play.libs.F.Promise;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * ControllerCalculateSum
 *   is the entry point for CalculateSum
 * */
public class ControllerCalculateSum extends Controller {

  public static Promise<Result> getCalculateSum () {

    final HandlerCalculateSum handlerCalculateSum =
      new HandlerCalculateSum();

    return handlerCalculateSum.handleRequestAsync(request() );
  }
}
