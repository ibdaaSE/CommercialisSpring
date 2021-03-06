package hello;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import util.DatabaseQuery;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

	@Autowired
	private EntityManager em;

	@Override
	public List<Article> findAll(@Param("filtre") String filtre, String filterAttribut, String filterValue, int maxRowPerPage,
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

	@Override
	public Long count(String filtre, String filterAttribut, String filterValue) {
		String querySearch = DatabaseQuery.getQueryJoinSearch("count(idArticle)", "Article a",
				"a.categorie a.designation a.famille a.marque a.reference a.codeBarres", filtre, filterAttribut,
				filterValue) + " ORDER BY a.idArticle DESC";

		Query query = em.createNativeQuery(querySearch);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
            return 0L;
        }
		Long count = Long.valueOf(resultList.get(0).toString());
		em.close();
		return count;
	}

}
