package my.groupid.home;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@Controller
public class HomeController {
	
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String index(Principal principal) {
	// 	return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
	// }

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> index() {
		HttpHeaders responseHeaders = new HttpHeaders();
		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}
}
