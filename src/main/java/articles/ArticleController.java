package articles;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class ArticleController {
	
	@Autowired 
	private ArticleRepository articleRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@RequestMapping(path="/articles")
	public @ResponseBody Iterable<Article> getAllUsers(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return articleRepository.findAll();
	}

}
