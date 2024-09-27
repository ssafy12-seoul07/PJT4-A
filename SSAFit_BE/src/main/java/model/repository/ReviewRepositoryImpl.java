package model.repository;

import java.util.*;

import model.dto.Review;

public class ReviewRepositoryImpl implements ReviewRepository {
	
	private static ReviewRepository repo = new ReviewRepositoryImpl();
	
	private List<Review> list = new ArrayList<>();
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
		reviews.put(review.getReviewId(), review);	//ID를 키로 해서 맵으로관리
		list.add(review); //리스트로 목록을 관리
	}

	@Override
	public void updateReview(Review review) {
		reviews.put(review.getReviewId(), review); //맵으로
	}

	@Override
	public void deleteReview(int id) {
		reviews.remove(id);
	}
	
}
