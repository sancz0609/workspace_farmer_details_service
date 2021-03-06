package com.kkd.farmerdetailsservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import com.kkd.farmerdetailsservice.document.Aadhar;
import com.kkd.farmerdetailsservice.document.Address;
import com.kkd.farmerdetailsservice.document.Farmer;
import com.kkd.farmerdetailsservice.repository.FarmerDetailsRepository;

import brave.sampler.Sampler;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//@EnableHystrixDashboard
//@EnableFeignClients("com.kkd.farmerdetailsservice")
//@EnableSwagger2
public class FarmerDetailsServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(FarmerDetailsServiceApplication.class, args);
	}
	//For Sleuth
	/*
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
    
    */
    //For Swagger
    /*
	@Bean
    public Docket api() throws IOException, XmlPullParserException{
        return new Docket(DocumentationType.SWAGGER_2);
    }
    */
}
