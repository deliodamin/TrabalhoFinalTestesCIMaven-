package testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import page.LoginPage;

import common.TestCaseCommon;

public class TestALogin {

	public TestALogin() {
		// TODO Auto-generated constructor stub
	}
	private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setUp() throws Exception {
		TestCaseCommon.getDriver().get(TestCaseCommon.URL_BASE + "/");
	}

	

	@Test
	public void testLogin() throws Exception {
		// Login
		LoginPage loginPage = new LoginPage();
		assertEquals("SCRM", loginPage.getTitle());
		loginPage.Login("delio", "ADM66@*29");
		
	}
	@After
	public void tearDown() throws Exception {


		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
		//TestCaseCommon.getDriver().quit();
	}
}
