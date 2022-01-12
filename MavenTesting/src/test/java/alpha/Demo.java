package alpha;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	@Test
	public void DemoLogs() {
		// TODO Auto-generated method stub
		log.debug("Demo Debug Message");
		log.info("Demo Info Message");
		log.error("Demo Error Message");
		log.fatal("Demo Fatal Message");

	}

}
