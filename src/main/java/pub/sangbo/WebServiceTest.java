package pub.sangbo;

import javax.jws.WebService;

/**
 * Created by SangBigYe on 2018/5/10.
 */
@WebService
public class WebServiceTest {

  public String sayHello(String name){
    return "Hello " +name;
  }

}
