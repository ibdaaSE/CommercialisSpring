package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ArticleController {
	
	@Autowired 
	private ArticleRepository articleRepository;
	
	@RequestMapping(path="/articles")
	public @ResponseBody List<Article> allArticles(@RequestParam(value="filter", defaultValue="") String filter, 
			@RequestParam(value="pageIndex", defaultValue="0") Integer pageIndex) {
		return articleRepository.getFiltredList(filter, "", "-1", 20, pageIndex);
	}

}
