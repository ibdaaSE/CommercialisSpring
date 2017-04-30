package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ArticleController {
	
	@Autowired 
	private ArticleRepository articleRepository;
	
	@RequestMapping(path="/articles")
	public @ResponseBody List<Article> findAllArticles() {
		return articleRepository.getFiltredList("", "", "-1", 10, 0);
	}
	
	@RequestMapping(path="/articles/{filter}")
	public @ResponseBody List<Article> findAllArticles(@PathVariable String filter) {
		return articleRepository.getFiltredList(filter, "", "-1", 10, 0);
	}

}
