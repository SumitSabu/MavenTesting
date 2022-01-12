package beta;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	@Test
	public void Demo1Logs()  {
		// TODO Auto-generated method stub
		log.debug("Demo1 Debug Message");
		log.info("Demo1 Info Message");
		log.error("Demo1 Error Message");
		log.fatal("Demo1 Fatal Message");

	}

}
