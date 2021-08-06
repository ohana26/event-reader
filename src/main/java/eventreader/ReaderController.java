package eventreader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReaderController {

	@RequestMapping("/test")
	public Root ssayHay() {
		return XmlToObject.getXml();
	}
		
}
