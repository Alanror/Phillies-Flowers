package ie.cit.adf.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ie.cit.adf.domain.Package;

public interface IPackageRepository extends CrudRepository<Package, Integer>{
	
	@Transactional
	@Modifying
	@Query("UPDATE Package p SET p.description = :descriptionEdit WHERE p.id = :id")
	void editPackageDescription(
			@Param("id") int id,
			@Param("descriptionEdit") String descriptionEdit);
	

}
