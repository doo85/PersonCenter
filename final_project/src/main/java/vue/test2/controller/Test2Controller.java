package vue.test2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
	
	@RequestMapping(value = "/vue/data/test2",method = RequestMethod.GET)
	public void dataSendTest () {
		System.out.println("통신 성공22!");
	}
}
