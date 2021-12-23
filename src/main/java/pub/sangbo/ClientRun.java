package pub.sangbo;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by SangBigYe on 2018/5/10.
 */
public class ClientRun {
  public static void main(String[] args) {
    JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
    org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8080/service/hello?wsdl");
    Object[] objects;
    try {
      objects = client.invoke("sayHello", "SangBigYe");
      //输出结果
      System.out.println(objects[0].toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
