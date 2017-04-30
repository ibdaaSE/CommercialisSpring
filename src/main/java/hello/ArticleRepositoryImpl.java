package hello;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import util.DatabaseQuery;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

	@Autowired
	private EntityManager em;

	@Override
	public List<Article> getFiltredList(String filtre, String filterAttribut, String filterValue, int maxRowPerPage,
			int index) {

		String querySearch = DatabaseQuery.getQueryJoinSearch("*", "Article a",
				"a.categorie a.designation a.famille a.marque a.reference a.codeBarres", filtre, filterAttribut,
				filterValue) + " ORDER BY a.idArticle DESC";

		Query query = em.createNativeQuery(querySearch, Article.class);
		query.setMaxResults(maxRowPerPage);
		query.setFirstResult(index);
		List<Article> resultList = (List<Article>) query.getResultList();
		em.close();
		return resultList;
	}

}
