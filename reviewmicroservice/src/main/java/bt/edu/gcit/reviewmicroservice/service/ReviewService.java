package bt.edu.gcit.reviewmicroservice.service;

import bt.edu.gcit.reviewmicroservice.entity.Review;
import java.util.List;

public interface ReviewService {
    Review createReview(Review review);
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    Review updateReview(Review review);
    void deleteReview(Long id);
}
