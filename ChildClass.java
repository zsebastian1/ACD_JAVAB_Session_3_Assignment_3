package AssignmentSession3;

public class ChildClass extends ParentClass {

	int height = 5;
	int weight;
	String eyes;
	String hairColor;
	
	public ChildClass() {
		super.displayTraits();
	}
	
	public ChildClass(int height) {
		this.height = height;
	}
	
	public ChildClass(int height, int weight, String eyes, String hairColor) {
		this.height = height;
		this.weight = weight;
		this.eyes = eyes;
		this.hairColor = hairColor;
	}
	
	public void displayTraits() {
		System.out.println("The child's height is: " + height);
		System.out.println("The child's weight is: " + weight);

		System.out.println("The child's eye color is: " + eyes);
		System.out.println("The child's hair color is: " + hairColor);


	}

	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass(5, 110, "Brown", "Black");
		ChildClass cc1 = new ChildClass();
		
		cc.displayTraits();
	}
	
}
