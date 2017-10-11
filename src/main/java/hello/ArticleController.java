package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ArticleController {
	
	@Autowired 
	private ArticleRepository articleRepository;
	
	@RequestMapping(path="/api/articles/count")
	public @ResponseBody Long countArticles(@RequestParam(value="filter", defaultValue="") String filter, 
			@RequestParam(value="filterAttribute", defaultValue="") String filterAttribute,
			@RequestParam(value="advancedFilter", defaultValue="-1") String advancedFilter) {
		return articleRepository.count(filter, filterAttribute, advancedFilter);
	}

}
