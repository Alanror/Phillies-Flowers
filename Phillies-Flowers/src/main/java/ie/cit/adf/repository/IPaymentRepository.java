package ie.cit.adf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ie.cit.adf.domain.Payment;

@Repository
public interface IPaymentRepository extends CrudRepository<Payment, Integer> {}
