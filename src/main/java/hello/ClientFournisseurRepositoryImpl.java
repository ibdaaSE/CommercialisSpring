package hello;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import util.DatabaseQuery;

public class ClientFournisseurRepositoryImpl implements ClientFournisseurRepositoryCustom {

	@Autowired
	private EntityManager em;

	@Override
	public List<Clientfournisseur> findAll(String filtre, String filterAttribut, String filterValue, int maxRowPerPage, int index) {
		String querySearch = DatabaseQuery.getQueryJoinSearch("*", "Clientfournisseur c",
                "c.raisonsocial c.nom c.remarque c.adress c.email c.telephone", filtre, filterAttribut, filterValue) + 
				" ORDER BY c.idClientFournisseur";

		Query query = em.createNativeQuery(querySearch, Clientfournisseur.class);
		query.setMaxResults(maxRowPerPage);
		query.setFirstResult(index);
		List<Clientfournisseur> resultList = (List<Clientfournisseur>) query.getResultList();
		em.close();
		return resultList;
	}

	@Override
	public Long count(String filtre, String filterAttribut, String filterValue) {
		String querySearch = DatabaseQuery.getQueryJoinSearch("count(idClientFournisseur)", "Clientfournisseur c",
				"c.raisonsocial c.nom c.remarque c.adress c.email c.telephone", filtre, filterAttribut,
				filterValue);

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
