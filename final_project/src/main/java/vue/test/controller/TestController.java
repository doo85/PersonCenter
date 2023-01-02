package vue.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/vue/data/test", method = RequestMethod.GET)
	public void dataSendTest () {
		System.out.println("통신 성공!");
	}

}
