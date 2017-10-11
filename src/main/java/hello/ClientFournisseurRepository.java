package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "CFs", path = "CFs")
public interface ClientFournisseurRepository extends JpaRepository<Clientfournisseur, Integer>, ClientFournisseurRepositoryCustom{

}
