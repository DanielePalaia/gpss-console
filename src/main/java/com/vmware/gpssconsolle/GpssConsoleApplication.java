package com.vmware.gpssconsolle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class GpssConsoleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GpssConsoleApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {


		GpssWrapper gpssWrapper = new GpssWrapper("172.16.125.163", 50009);
		gpssWrapper.connectToGrpc();
		gpssWrapper.submitJob("/Users/dpalaia/gpsscli.yaml", "jobFromRemote");

		gpssWrapper.startJob("jobFromRemote");


	}

}


