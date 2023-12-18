package domain;

public class Rating {
	
	public String ratingID;
	
	public int score;
	
	public String feedback;

	public Rating(String ratingID, int score, String feedback) {
		super();
		this.ratingID = ratingID;
		this.score = score;
		this.feedback = feedback;
	}

	public String getRatingID() {
		return ratingID;
	}

	public void setRatingID(String ratingID) {
		this.ratingID = ratingID;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public void UpdateRating() {
		
	}

}
