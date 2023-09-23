package gaurang_test;

public class User {

	private int id;
	private String name;
	private String category;
	private String item;
	private int points;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItem() {
		return item;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public User(int id, String name, String category, String item, int points) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.item = item;
		this.points = points;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", category=" + category + ", item=" + item + ", points=" + points
				+ "]";
	}
	
	
	
}
