package com.example.profiles.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication  implements CommandLineRunner {

//	@Value("${mymessage.message}")
//	String messaging;
	@Autowired
	private MyProperties myprop;
	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("message is: " +messaging);
		System.out.println("project name is:"+myprop.getProjectname()+"version is: "+myprop.getVersion()+"launch is :"+myprop.getLaunch()+"messagingused is :"+myprop.getMessagingused());
	}
}
