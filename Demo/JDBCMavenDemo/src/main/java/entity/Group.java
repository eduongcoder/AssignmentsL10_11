package entity;

public class Group {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Group(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}
	
}
