package hello;

import java.util.List;

public interface ClientFournisseurRepositoryCustom {

	public List findAll(String filtre, String filterAttribut, String filterValue, int maxRowPerPage, int index);

	public Long count(String filtre, String filterAttribut, String filterValue);

}
