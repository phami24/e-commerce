package shop.plant.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.plant.shop.model.PaymentDetail;
/**
 * This interface defines a repository for PaymentDetail objects.
 * It extends JpaRepository, which provides basic database operations.
 */
@Repository
public interface PaymentDetailRepository extends JpaRepository<PaymentDetail,Long> {
}
