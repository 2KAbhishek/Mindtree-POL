package set2;

public class CoffeeCustomer {

	private String name = "", mobileNo = "";
	private double feedbackRating = 0;

	public CoffeeCustomer() {
	}

	public CoffeeCustomer(String name, String mobileNo, double feedbackRating) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.feedbackRating = feedbackRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	@Override
	public String toString() {
		return "CoffeeCustomer [name=" + name + ", mobileNo=" + mobileNo + ", feedbackRating=" + feedbackRating + "]";
	}

}