package pub.sangbo;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by SangBigYe on 2018/5/10.
 */
public class ServiceRun {

  public static void main(String[] args) {
    JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
    factory.setServiceClass(WebServiceTest.class);
    factory.setAddress("http://localhost:8080/service/hello");
    Server server = factory.create();
    server.start();
  }
}
