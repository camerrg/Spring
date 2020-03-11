package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import product.beans.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> {

}
