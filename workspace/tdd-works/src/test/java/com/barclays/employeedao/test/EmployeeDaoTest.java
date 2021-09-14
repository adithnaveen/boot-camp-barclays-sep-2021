package com.barclays.employeedao.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import com.barclays.business.EmmployeeDAO;
import com.barclays.exception.NameTooShortException;


@TestMethodOrder(OrderAnnotation.class)
class EmployeeDaoTest {

	private EmmployeeDAO dao; 
	@BeforeEach
	void setUp() {
		System.out.println("hey i'm in beforeEach");
		dao = new EmmployeeDAO();
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Hey i'm afterEach");
		
	}
	
	@BeforeAll
	static void beforeClass() {
		// this will execute only once for entire class
		System.out.println("Hey i'm first to be there in the test case");
	}
	
	
	@Order(1)
	@DisplayName("to check if the name get hi message from the dao layer")
	@Test
	void employeeHiTest() {
		 
		String name = "Laukik"; 
		String expected = "Hi " + name; 
		String actual = dao.sayHi(name);
		
		assertEquals(expected, actual);
	}
	
	@Order(2)
	@Test
	@DisplayName("to check the name returns true when invoked with valid data")
	void toCheckNameReturnsTrueWhenInvokedWithValidData() throws NameTooShortException {
		String name = "Harshitha"; 
		assertTrue(dao.checkName(name));
	}
	
	@Order(3)
	@Test
	@DisplayName("to check the method responds in 1000 ms")
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
	void checkAgainstValidNameIn1000ms() throws NameTooShortException {
		String name = "Harshitha"; 
		assertTrue(dao.checkName(name));
	}
	
	@Order(4)
	@Disabled("For Testing... ")
	@Test
	@DisplayName("Check name less than 6 chars, should throw NameTooShortException")
	void checkNameLessThan6chars() {
		String name = "Amit"; 
		 
		assertThrows(NameTooShortException.class, () -> dao.checkName(name));
	}
	
	
	@Order(5)
	@Test
	@DisplayName("to validate name and say hi in single test case ")
	void toTestNameMoreThan6CharsAndSayHi() {
		assertAll("TestNameMoreThan6CharsAndSayHi", 
				() -> assertEquals("Hi Harry",  dao.sayHi("Harry"), "To say hi to the name"), 
				() -> assertTrue(dao.checkName("Harshitha"), "checking name harshitha")
				);
	}
	
	
}
