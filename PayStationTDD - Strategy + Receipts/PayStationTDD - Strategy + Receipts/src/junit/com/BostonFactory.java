package junit.com;

public class BostonFactory implements PayStationFactory {
	Receipt r;
	RateStrategy rs;
	
	@Override
	public Receipt createRebut(int value) {
		// TODO Auto-generated method stub
		r = new BarCodeReceipt(value);
		return r;
	}

	@Override
	public RateStrategy createStrategy() {
		// TODO Auto-generated method stub
		rs = new ProgressiveRateStrategy();
		return rs;
	}

}
