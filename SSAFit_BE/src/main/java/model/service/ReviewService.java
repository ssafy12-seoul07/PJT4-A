package model.service;

import java.util.List; 

import model.dto.Review;

public interface ReviewService {

	// 전체 리뷰 조회
	public abstract List<Review> getList();
	// 리뷰 조회
	public abstract Review getReview(int id);

	// 리뷰 작성
	public abstract void writeReview(Review board);

	// 리뷰 수정
	public abstract void modifyReview(Review board);

	// 리뷰 삭제
	public abstract void removeReview(int id);

}
