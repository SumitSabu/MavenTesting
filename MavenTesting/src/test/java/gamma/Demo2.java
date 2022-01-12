package gamma;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo2 {

	private static Logger log = LogManager.getLogger(Demo2.class.getName());

	@Test
	public void Demo2Logs() {
		// TODO Auto-generated method stub
		log.debug("Demo2 Debug Message");
		log.info("Demo2 Info Message");
		log.error("Demo2 Error Message");
		log.fatal("Demo2 Fatal Message");

	}

}
