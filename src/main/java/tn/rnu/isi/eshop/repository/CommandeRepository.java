package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

	Commande findByIdCommande(Long idCommande);

}
