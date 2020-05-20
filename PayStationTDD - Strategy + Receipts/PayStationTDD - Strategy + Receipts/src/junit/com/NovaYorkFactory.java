package junit.com;

public class NovaYorkFactory implements PayStationFactory {
	Receipt r;
	RateStrategy rs;
	
	@Override
	public Receipt createRebut(int value) {
		// TODO Auto-generated method stub
		r = new StandardReceipt(value);
		return r;
	}

	@Override
	public RateStrategy createStrategy() {
		// TODO Auto-generated method stub
		rs = new LinearRateStrategy();
		return rs;
	}

}
