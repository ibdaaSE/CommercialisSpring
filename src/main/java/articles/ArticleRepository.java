package articles;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import util.DatabaseQuery;

public interface ArticleRepository extends CrudRepository<Article, Integer>{
	
	public static final String FILTRED_ARTICLES = DatabaseQuery.getQueryJoinSearch("a.id, a.acommander, a.categorie, a.designation, a.famille, a.inventaire, a.marque, "
            + "a.pmp, a.prixachat, a.prixpublic, a.prixrevendeur, a.prixspecial, a.qtemax, a.qtemin, a.qtestock, a.qteCarton, a.reference, a.unite, "
            + "a.utilise, a.codeBarres, a.tva, a.vrac",
            "Article a",
            "a.categorie a.designation a.famille a.marque a.reference a.codeBarres", ":filtre",
            ":filterAttribut", ":filterValue") + " ORDER BY a.id DESC";
	
	@Query(value ="articles.ArticleRepository.FILTRED_ARTICLES")
	public Iterable<Article> getFiltredList(@Param("filtre") String filtre, @Param("filterAttribut") String filterAttribut, @Param("filterValue") String filterValue);

}
