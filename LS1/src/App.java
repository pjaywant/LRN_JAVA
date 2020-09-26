
class person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + " and " + "I am " + age + " years old");
	}

	void sayHello() {
		System.out.println("Hello there");
	}

}

public class App {

	public static void main(String[] args) {

		person person1 = new person();
		person1.name = "Jaywant Panchal";
		person1.age = 48;
		person1.speak();
		person1.sayHello();

		person person2 = new person();
		person2.name = "Shweta Panchal";
		person2.age = 37;
		person2.speak();
		person2.sayHello();

	}

}
