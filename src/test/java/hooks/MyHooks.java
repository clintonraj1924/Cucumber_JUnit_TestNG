package hooks;

import io.cucumber.java.*;

public class MyHooks {

	@Before
	public void setup(Scenario scenario) {
		System.out.println("==>Execution started" + scenario.getName());
		System.out.println("==> Browser got launched <==");
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("==> Browser closed <==");
		System.out.println("==>Execution ended" + scenario.getName());
	}

}
