/*
 * SCOPE describes where a variable exists
 * In general: You can use a variable inside the { } where it
 * is defined. 
 */

public class Scope {
	private String name;

	public Scope(String n) {
		// What is in scope here? name, n
		int rand = (int) (Math.random() * 10);
		name = n;
		// What is in scope here? name, n, rand
	}

	public void display() {
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name);
			// What is in scope here? name, i
		}
		// What is in scope here? name
	}
}

// 'name' has class-level scope. It can be used anywhere in the class
// 'rand' and 'n' have local scope. They can be used in the method where they were created
// 'i' has local scope, but is local to the loop where it was created