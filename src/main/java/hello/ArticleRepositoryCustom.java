package hello;

import java.util.List;

public interface ArticleRepositoryCustom {
	
	public List<Article> getFiltredList(String filtre, String filterAttribut, String filterValue, int maxRowPerPage, int index);

}
