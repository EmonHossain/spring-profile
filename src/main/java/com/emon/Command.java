package com.emon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("init")
public class Command implements CommandLineRunner{
	
	@Autowired
	private SpringProfileTest profile;

	@Override
	public void run(String... args) throws Exception {
		profile.logMessage("is active now.");
	}
	
}
