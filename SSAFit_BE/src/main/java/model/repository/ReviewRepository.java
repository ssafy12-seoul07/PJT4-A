package model.repository;

import java.util.List;

import model.dto.Review;

public interface ReviewRepository {
	//전체 리뷰 가져오기
	public abstract List<Review> selectAll();
	
	//리뷰 조회하기
	public abstract Review selectOne(int id);

	//리뷰 등록하기
	public abstract void insertReview(Review review);

	//리뷰 수정하기
	public abstract void updateReview(Review review);

	//리뷰 삭제하기
	public abstract void deleteReview(int id);

}
