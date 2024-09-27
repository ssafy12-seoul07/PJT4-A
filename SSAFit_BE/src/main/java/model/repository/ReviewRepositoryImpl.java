package model.repository;

import java.util.*;

import model.dto.Review;

public class ReviewRepositoryImpl implements ReviewRepository {
	
	private static ReviewRepository repo = new ReviewRepositoryImpl();
	
	private Map<Integer, Review> reviews = new HashMap<>();
	
	private ReviewRepositoryImpl() {
		reviews.put(1, new Review("김싸피", "리뷰입니다."));
	}
	
	public static ReviewRepository getInstance() {
		return repo;
	}

	@Override
	public List<Review> selectAll() {
		List<Review> tmp = new ArrayList<>();
		for(int key : reviews.keySet()) {
			tmp.add(reviews.get(key));
		}
		
		return tmp;
	}
	
	@Override
	public Review selectOne(int id) {
		return reviews.get(id);
	}

	@Override
	public void insertReview(Review review) {
		reviews.put(review.getReviewId(), review);	
	}

	@Override
	public void updateReview(Review review) {
		reviews.put(review.getReviewId(), review); 
	}

	@Override
	public void deleteReview(int id) {
		reviews.remove(id);
	}
	
}
