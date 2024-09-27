package dto;

public class Review {
	private int reviewId;
	private String userName;
	private String content;
	private String regDate;
	
	
	public Review(int reviewId, String userName, String content, String regDate) {
		this.reviewId = reviewId;
		this.userName = userName;
		this.content = content;
		this.regDate = regDate;
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


	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", userName=" + userName + ", Content=" + content + ", regDate="
				+ regDate + "]";
	}
	
}
