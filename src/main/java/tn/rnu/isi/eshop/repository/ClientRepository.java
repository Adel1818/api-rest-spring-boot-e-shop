package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	Client findByIdClient(Long idClient);

}
