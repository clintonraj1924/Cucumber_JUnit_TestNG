package stepdefinitions;


import io.cucumber.java.*;

public class Hooks {
	@Before
	public void setup() {
		// If i write inside the setup 
		System.out.println(">>Browser got opened");
	}

	@After
	public void tearDown() {
		System.out.println("Browser got closed<<");
	}
	
	@BeforeStep("@smoke")
	public void beforeEveryStep() {
		System.out.println(">>>Before Every Step Hook");
	}
	
	@AfterStep
	public void afterEveryStep () {
		System.out.println("After every step hook<<<");
	}
}
