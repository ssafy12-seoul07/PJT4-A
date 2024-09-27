package model.service;

import java.util.List; 
import model.dto.Review;
import model.repository.ReviewRepository;
import model.repository.ReviewRepositoryImpl;

public class ReviewServiceImpl implements ReviewService {
	private static ReviewService service = new ReviewServiceImpl();
	private ReviewRepository repo = ReviewRepositoryImpl.getInstance();

	private ReviewServiceImpl() {
	}

	public static ReviewService getInstance() {
		return service;
	}

	@Override
	public List<Review> getList() {
		return repo.selectAll();
	}

	@Override
	public Review getReview(int id) {
		repo.updateViewCnt(id);
		return repo.selectOne(id);
	}

	@Override
	public void writeReview(Review board) {
		repo.insertReview(board);
	}

	@Override
	public void modifyReview(Review board) {
		repo.updateReview(board);
	}

	@Override
	public void removeReview(int id) {
		repo.deleteReview(id);
	}
}
