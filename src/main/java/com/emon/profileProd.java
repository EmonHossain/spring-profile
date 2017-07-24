package com.emon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class profileProd implements SpringProfileTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void logMessage(String msg) {
		logger.debug("Production "+msg);
	}

}
