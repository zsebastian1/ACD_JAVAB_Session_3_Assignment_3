package AssignmentSession3;

public class ParentClass {

	int height;
	int weight;
	String eyes;
	String hairColor;
	
	public ParentClass() {
		this(6);
	}
	
	public ParentClass(int height, int weight, String eyes, String hairColor) {
		this.height = height;
		this.weight = weight;
		this.eyes = eyes;
		this.hairColor = hairColor;
	}
	public ParentClass(int height, int weight, String eyes) {
		this(6, 201, "Blue", "Blonde");
	}
	public ParentClass(int height, int weight) {
		this(6, 201, "Blue");
	}
	public ParentClass(int height) {
		this(6, 201);
	}
	public void displayTraits() {
		System.out.println("The parent's height is: " + height);
		System.out.println("The parent's weight is: " + weight);
		System.out.println("The parent's eye color is: " + eyes);
		System.out.println("The parent's hair color is: " + hairColor);
	}
	
}
