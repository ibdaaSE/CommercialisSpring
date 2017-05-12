package hello;

import java.util.List;

public interface ArticleRepositoryCustom {
	
	public List getFiltredList(String filtre, String filterAttribut, String filterValue, int maxRowPerPage, int index);
	
	public Long count(String filtre, String filterAttribut, String filterValue);

}
