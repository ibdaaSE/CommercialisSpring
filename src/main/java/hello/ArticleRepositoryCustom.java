package hello;

import java.util.List;

import org.springframework.data.rest.core.annotation.RestResource;

public interface ArticleRepositoryCustom {
	
	public List findAll(String filtre, String filterAttribut, String filterValue, int maxRowPerPage, int index);
	
	public Long count(String filtre, String filterAttribut, String filterValue);

}
