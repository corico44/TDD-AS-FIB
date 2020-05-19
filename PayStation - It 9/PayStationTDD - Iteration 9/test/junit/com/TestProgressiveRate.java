package junit.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProgressiveRate {
	  PayStation ps;

	  /** Fixture for pay station testing. */
	  @Before
	  public void setUp() {
		RateStrategy rs = new ProgressiveRateStrategy();
	    ps = new PayStationImpl(rs);
	  }
	  
	  @Test
	  public void primeraHoraAmb5() throws IllegalCoinException {
	    ps.addPayment(5);
	    assertEquals( "Should display 2 min for 5 cents", 
	                  5 / 5 * 2, ps.readDisplay() );
	  }
	  
	  @Test
	  public void primeraHoraAmb10() throws IllegalCoinException {
	    ps.addPayment(10);
	    assertEquals( "Should display 4 min for 10 cents", 
	                  10 / 5 * 2, ps.readDisplay() );
	  }
	  
	  @Test
	  public void segonaHoraAmb5() throws IllegalCoinException {
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(5);
	    assertEquals( "Should display 61 min for 155 cents", 
	                 61, ps.readDisplay() );
	  }
	  
	  @Test
	  public void segonaHoraAmb25() throws IllegalCoinException {
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    ps.addPayment(25);
	    assertEquals( "Should display 67 min for 175 cents", 
	    		150 / 5 * 2 + 25 / 10*3, ps.readDisplay() );  
	  }

}
