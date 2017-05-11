package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping({"/stock", "/clientFournisseur"})
	public String index() {
		return "forward:/index.html";
	}
}