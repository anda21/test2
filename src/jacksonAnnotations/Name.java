package jacksonAnnotations;

public class Name {
	private String first;
	private String middle;
	private String name;
	
	public Name(String fist,String middle, String name) {
		this.first = first;
		this.middle = middle;
		this.name= name;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
