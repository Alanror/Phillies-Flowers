package ie.cit.adf.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ie.cit.adf.domain.Payment;

@Repository
public interface IPaymentRepository extends CrudRepository<Payment, Integer> {
	
}
