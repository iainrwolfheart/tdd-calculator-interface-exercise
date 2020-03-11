
public class Calculator {
	
	private CalcInterface calcService;
	
	public Calculator(CalcInterface calcService) {
		this.calcService = calcService;
	}

	public CalcInterface getCalcService() {
		return calcService;
	}

}
