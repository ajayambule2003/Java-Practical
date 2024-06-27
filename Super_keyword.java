// super keyword in java program
class Vehicle {
	int maxSpeed = 120;
}

class Car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		System.out.println("Maximum Speed: "
				+ super.maxSpeed);
	}
}

class Test {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}

// Oracle.oracle-java //Initial one
// georgewfraser.vscode-javac //another one