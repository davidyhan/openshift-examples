package sample.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class CamelTest extends CamelTestSupport {

  @Override
  public RouteBuilder createRouteBuilder() {
    return new SampleAutowiredAmqRoute();
  }

  @Test
  public void blank() {}
}
