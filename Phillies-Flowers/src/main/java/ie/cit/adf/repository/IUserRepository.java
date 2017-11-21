package ie.cit.adf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ie.cit.adf.domain.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.userName = :userName AND u.password = :password")
	User findByLoginCredentials(
			@Param("userName") String userName, 
			@Param("password") String password);
}
