package bt.edu.gcit.reviewmicroservice.dao;

import bt.edu.gcit.reviewmicroservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
