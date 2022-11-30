package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class MyDemoRestAPI 
{
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg()
	{
		String msg ="Demo Welcome to ASHOK IT";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	@GetMapping("/greet9")
	public ResponseEntity<String> greetMsg()
	{
		String msg="DEMO Good Mornig";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}

}
