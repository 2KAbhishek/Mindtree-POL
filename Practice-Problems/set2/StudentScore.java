package set2;

public class StudentScore {
	private int id;
	private String name, branch;
	private float score;

	public StudentScore(int id, String name, String branch, float score) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.score = score;
	}

	public StudentScore() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentScore [id=" + id + ", name=" + name + ", branch=" + branch + ", score=" + score + "]";
	}

}
