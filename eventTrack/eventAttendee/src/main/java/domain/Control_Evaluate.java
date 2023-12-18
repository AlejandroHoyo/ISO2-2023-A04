package domain;

public class Control_Evaluate {
	
	public int evaluateEvent(Rating r) {	
		return r.getScore();
	}
	
	public int calculateAverageRating(Rating r,int n) {
		return 1/n;
	}

}
