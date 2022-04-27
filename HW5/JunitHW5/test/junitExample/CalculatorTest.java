package junitexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author avecaschilling
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("humbug");
    }
    
    @Test
	@DisplayName("1 + 1 = 2")
	public void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.add(1, 1), "1 + 1 should equal 2");
	}
    
        
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"0,    1,   1","1,    2,   3","49,  51, 100","3,  100, 101"})
    void addParam(int first, int second, int expectedResult) {
                System.out.println("parameters here");
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}