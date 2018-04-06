package com.kkd.farmerdetailsservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.kkd.farmerdetailsservice.document.Farmer;
import com.kkd.farmerdetailsservice.repository.FarmerDetails;

@EnableMongoRepositories(basePackageClasses = FarmerDetails.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(FarmerDetails farmerDetails) {
		return strings -> {
			//farmerDetails.save(new Farmer(<data>);
			//farmerDetails.save(new Farmer(<data>);
		};
	}
	
	

}
