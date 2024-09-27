package model.dto;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	private static int no = 1;
	private int reviewId;
	private String userName;
	private String content;
	private String regDate;

	public Review() {
	}

	public Review(String userName, String content) { 
		this.reviewId = no++;
		this.userName = userName;
		this.content = content;
		this.regDate = new Date().toString();
	}

	public static int getNo() {
		return no;
	}

	public static void setNo(int no) {
		Review.no = no;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", userName=" + userName + ", content=" + content + ", regDate="
				+ regDate + "]";
	}

}
