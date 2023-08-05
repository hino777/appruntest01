/**
 * 
 */
package com.nullp.appruntest01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class Exp1Controller {
	@GetMapping("/exp1")
	public String exp1() {
		return "exp1";
	}
}
