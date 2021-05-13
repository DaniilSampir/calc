package calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class DataDrivenTest {

	@RunWith(value = Parameterized.class)
	public static class ParameterizeTest {
		CalculatorEngine myCalc = new CalculatorEngine();
		int firstNumber;
		int secondNumber;
		int result;

		public ParameterizeTest(int firstNumber, int secondNumber, int result) {
			this.firstNumber = firstNumber;
			this.secondNumber = secondNumber;
			this.result = result;
		}

		@Parameterized.Parameters
		public static Collection<Object[]> dataForTest() {
			Object[][] data = new Object[][] { { 1, 23, 24 }, { 2, 12, 14 }, { 3, 43, 46 }, { 4, 4, 8 } };
			return Arrays.asList(data);
		}
		@Test
		public void dataDrivenTest() {
			assertEquals(result, myCalc.operatePlus(firstNumber, secondNumber), 0);
		}
	}
}
