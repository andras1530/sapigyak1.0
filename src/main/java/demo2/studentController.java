package demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class studentController {
	@RequestMapping("/students")
	public studentPOJO greeting(@RequestParam(value="name",defaultValue="World")String name) {
		return new studentPOJO(11,"Nagy","Andras","info",1,"2017-07-31","2018-02-02",1);
	}
}
