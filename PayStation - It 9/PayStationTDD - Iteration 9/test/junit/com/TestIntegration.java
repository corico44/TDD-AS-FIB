package junit.com;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestIntegration {

	@Test
	  public void funcionaEstrategiaOne2One() {
		RateStrategy rs = new One2OneStrategy();
	    assertEquals(350, rs.calculaTime(350));
	  }
	
	@Test
	  public void funcionaEstrategiaNewYork() {
		RateStrategy rs = new LinearRateStrategy();
	    assertEquals(140, rs.calculaTime(350));
	  }
	
	@Test
	  public void funcionaEstrategiaBoston() {
		RateStrategy rs = new ProgressiveRateStrategy();
	    assertEquals(120, rs.calculaTime(350));
	  }

}
