package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	Categorie findByIdCateg(Long idCateg);

}
