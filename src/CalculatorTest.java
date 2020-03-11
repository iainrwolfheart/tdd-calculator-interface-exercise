import static org.junit.Assert.*;

import org.easymock.EasyMock;

import static org.easymock.EasyMock.createMock;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	CalcInterface testFunction;
	Calculator testCalc;

	@Before
	public void setUp() throws Exception {
		testFunction = createMock(CalcInterface.class);
		testCalc = new Calculator(testFunction);
	}

	@Test
	public void testAddFunction() {
		EasyMock.expect(testFunction.addFunction(5, 2)).andReturn(7);
		EasyMock.replay(testFunction);
		assertEquals(7, testCalc.getCalcService().addFunction(5, 2));
		EasyMock.verify(testFunction); //Verifies that the service was actually used to pass expected value
	}
	
	@Test
	public void testSubtractFunction() {
		EasyMock.expect(testFunction.subtractFunction(5, 2)).andReturn(3);
		EasyMock.replay(testFunction);
		assertEquals(3, testCalc.getCalcService().subtractFunction(5, 2));
		EasyMock.verify(testFunction); 
	}
	
	@Test
	public void testMultiplyFunction() {
		EasyMock.expect(testFunction.multiplyFunction(5, 2)).andReturn(10);
		EasyMock.replay(testFunction);
		assertEquals(10, testCalc.getCalcService().multiplyFunction(5, 2));
		EasyMock.verify(testFunction); 
	}
	
	@Test
	public void testDivideFunction() {
		EasyMock.expect(testFunction.divideFunction(5, 2)).andReturn(2);
		EasyMock.replay(testFunction);
		assertEquals(2, testCalc.getCalcService().divideFunction(5, 2));
		EasyMock.verify(testFunction); 
	}
	
	@Test(expected = Exception.class)
	public void testDivideByZeroException() {
		EasyMock.expect(testFunction.divideFunction(5, 0)).andThrow(new ArithmeticException("Cannot divide by zero"));
		EasyMock.replay(testFunction);
		
		
	}
}
