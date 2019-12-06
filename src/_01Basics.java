public class _01Basics {

	// 01.01. Hello world
	
	public static void main (String[] args) {
		System.out.println("Hello World");
	}
}
	
	// System.out.println(); - Eclipse shortcut sysout+space
	// System.out.println(); - Intellij shortcut soutu+Enter
	
	// Running program:
	// 1. from IDE
	// 2. or saving class in selected directory, for e.g.: C:\, then open cmd and run this command: "javac _01Basics.java", then run "java _01Basics"

	




	/* 01.02. Methods
	 Method - Java Method is a collection of statements to process some specific task and return the response to the caller. 
	Methods allow us to write reusable code and dividing our program into several small units of work. 
	Java Method promotes clean and more readable code
	(PL: Metoda - Jest zestawem wyra¿eñ przetwarzaj¹cych pewne zadania i zwracaj¹cych odpowiedwzywaj¹cemu.
	Metody umo¿liwiaj¹ pisanie kodu mo¿liwego do ponownego u¿ycia i dzieli program na mniejsze jednostki.)

	1. Overloaded Methods: If a class have multiple methods with the same name, they are called as overloaded methods. 
	(PL: Metody Prze³adowane - Je¿eli klasa ma wiele metod o tej samej nazwie, nazywane s¹ one metodami prze³adowanymi.)
	
		public void print(String s) {
			System.out.println(s);
		}
	
		public void print(String s, int times) {
			for (int i=0; i< times; i++) {
				System.out.println(s);
			}
		}
	
	
	2. Method Throwing Exception: If method returns an unexpected result, either Calculation error or any kind of unusual behaviour this metod throws an exception.
	Exception can be predicted and described in a method. Instead of throwing an exception such method would resolute a predefined code.
	(PL: Je¿eli metoda zwraca niespodziewany rezultat, czy jest to b³¹d obliczeñ, czy jakiœ niespotykane zachowanie wóczas ta metoda zwraca wyj¹tek.
	Wyj¹tek mo¿e byæ opisany w metodzie. Wówczasa zamiast zwracaæ wyj¹tek, metoda bêdzie wywo³ywaæ wczeœniej opisany kod.)
	
		public int divide(int x, int y) throws IllegalArgumentException {
			if(y==0) throw new IllegalArgumentException("Can't divide by 0");
			return x/y;
		}
	
	
	3. Recursive Method: When a method calls itself, it's called as a recursive method. We should be very careful in defining recursive method because it can go 
	into infinite loop if there is no terminal condition. Let's look at a method that returns factorial of a number using recursion.
	(PL: Metoda Rekursywna - Gdy metoda wzywa sam¹ siebie nazywamy to metod¹ rekursywn¹. Wzywanie metody rekursywnej mo¿e skutkowaæ nieskoñczon¹ pêtl¹ jeœli nie ma po 
	drodze warunku koñcz¹cego wykonywanie tej metody. Poni¿ej metoda licz¹ca silniê danej liczby.)
	
		public static long factorial(long n) {
			if (n == 1)
				return 1;
			else
				return (n * factorial(n - 1));
		}
	
	
	4. Method Calling Another Method: We can call another method from a method, let's redefine the above overloaded methods by reusing the print(String s) method. 
	(PL: Metoda wzywa inn¹ metodê: Wewn¹trz metody wywo³aliœmy inna metod¹, poni¿ej przyk³ad)
	
		public void print(String s) {
			System.out.println(s);
		}
		
		public void print(String s, int times) {
			for (int i=0; i< times; i++) {
			print(s);
			}	
		}
	
	
	5. Java Interface Static Method: Java interfaces can have static method from Java 8 onwards. Here is a small example of the interface static method. 
	(PL: Metoda Statyczna Interfejsu: interfejsy mog¹ mieæ statyczne metody od Javy 8 w górê.)
	
		public interface MyData {

			static boolean isNull(String str) {
				System.out.println("Interface Null Check");
				return str == null ? true : "".equals(str) ? true : false;
  			}
		}
	
	
	6. Java Interface Default Method: From Java 8 onwards, interfaces can have default method implementations. 
	(PL: Metoda Domyœlna Interfejsu: interfejsy moga mieæ domyœln¹ implementacjê metody)
	
		public interface MyData {

			default void print(String str) {
				if (!isNull(str))
					System.out.println("MyData Print::" + str);
			}
		}
	
	
	7. Java Getter Setter Methods: Java Getter Setter Methods are conventional methods to access and update an object properties. 
	These methods create abstraction and we can restrict access to different properties. Most of the IDEs support easy creation of getter-setter methods of a property. 
	(PL: Gettery i Settery: gettery i settery to wygodny sposób na dostêp i akyualizacjê w³aœciwoœci obiektów.
	Te metody tworz¹ abstrakcjê i mog¹ ograniczaæ dostêp do róznych w³aœciwoœci.)
	
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
	
	8. Java Abstract Methods: Java abstract class and interface can declare methods without its body. 
	The class extending or implementing them have the responsibility to provide method definition. 
	These methods are declared using abstract keyword in abstract class. Java interface methods are explicity abstract. 
	(PL: Metoda Abstrakcyjna: Klasa abstrakcyjna i interfejs mo¿e deklarowaæ metodê bez implementacji (bez cia³a metody)
	Klasa rozszerzaj¹ca i implementuj¹ca takie metody ma obowi¹zek stworzyæ definicje takich metod. )
	
		public abstract class Person {
			public abstract void work();
		}

		public interface Shape {
			//interface methods are implicitly abstract and public
			void draw();
			double getArea();
		}
	
	




	01.03. Constructor
	- constructor in java is used to create the instance of the class
	- are similar in appearance to methods, except two things:
		- constructor name is the same as the class
		- it has no return type
	- constructor types
		- default constructor
		- no-args constructor
		- parameterized constructor
	(PL: Konstruktor jest u¿ywany do tworzenia instancji klasy. Jest podobny z wygl¹du do metody, z wyj¹tkiem dwóch rzeczy:
	nazwa konstruktora jest taka sama jak nazwa klasy, nie zwraca on niczego. Typy konstruktorów: domyslny, bezargumentowy, parametryzowany.)

	Whenever we use new keyword to create an instance of a class, the constructor is invoked and the object of the class is returned.
	Since constructor can only return the object to class, it’s implicitly done by java runtime and we are not supposed to add a return type to it.
	If we add a return type to a constructor, then it will become a method of the class. This is the way java runtime distinguish between a normal
	method and a constructor. Let’s assume we have following code in Employee class.

		public Employee() {
			System.out.println("Employee Constructor");
		}
		public Employee Employee() {
			System.out.println("Employee Method");
			return new Employee();
		}
	
	1. Default Constructor
	There is no explicit constructor in this example. Constructor is default and we can instantiate the class with its name.
		public class Data {
			public static void main(String[] args) {
				Data d = new Data();
			}
		}
	Default constructor features:
	- its only role is to initialize the object and return it to the calling code,
	- is always without argument and provided by java compiler only when there is no existing constructor defined,
	- Most of the time we are fine with default constructor itself as other properties can be accessed and initialized through getter setter methods.

	2. No-Args Constructor
	Constructor without any argument is called a no-args constructor. It’s like overriding the default constructor and used to do
	some pre-initialization stuff such as checking resources, network connections, logging, etc.

		public class Data {
        	//no-args constructor
			public Data() {
				System.out.println("No-Args Constructor");
			}
			public static void main(String[] args) {
				Data d = new Data();
			}
		}

	3. Parameterized Constructor
	Constructor with arguments is called parameterized constructor.

		public class Data {
			private String name;
			public Data(String n) {
				System.out.println("Parameterized Constructor");
				this.name = n;
			}
			public String getName() {
				return name;
			}
			public static void main(String[] args) {
				Data d = new Data("Java");
				System.out.println(d.getName());
			}
		}

	4. Constructor Overloading
	When we have more than one constructors, then it’s constructor overloading in java.

		public class Data {
			private String name;
			private int id;

			//no-args constructor
			public Data() {
				this.name = "Default Name";
			}

			//one parameter constructor
			public Data(String n) {
				this.name = n;
			}

			//two parameter constructor
			public Data(String n, int i) {
				this.name = n;
				this.id = i;
			}

			public String getName() {
				return name;
			}

			public int getId() {
				return id;
			}

			@Override
			public String toString() {
				return "ID="+id+", Name="+name;
			}
			public static void main(String[] args) {
				Data d = new Data();
				System.out.println(d);

				d = new Data("Java");
				System.out.println(d);

				d = new Data("Pankaj", 25);
				System.out.println(d);
			}
		}

		5. Private Constructor
		Well, a constructor is made private in case we want to implement singleton design pattern.
		Since java automatically provides default constructor, we have to explicitly create a constructor and keep it private.

			private Data() {
				//empty constructor for singleton pattern implementation
				//can have code to be used inside the getInstance() method of class
			}

		6. Super Constructor
		Sometimes a class is inherited from a superclass, in that case, if we have to call superclass constructor then we can do it using super keyword.

			public class Person {
				private int age;
				public Person() {
					System.out.println("Person Created");
				}

				public Person(int i) {
					this.age = i;
					System.out.println("Person Created with Age = " + i);
				}
			}


			public class Student extends Person {
				private String name;
				public Student() {
					System.out.println("Student Created");
				}

				public Student(int i, String n) {
					super(i); // super class constructor called
					this.name = n;
					System.out.println("Student Created with name = " + n);
				}
			}


	01.04. Access Modifiers
	public - If a class member is “public” then it can be accessed from anywhere.
	private - If a class member is “private” then it will be accessible only inside the same class.
	protected - If class member is “protected” then it will be accessible only to the classes in the same package and to the subclasses.
	default - If a class member doesn’t have any access modifier specified, then it’s treated with default access.




	01.05. Loops

	1. "for loop":
	for (variable initialization; termination condition; increment/decrement operation) {
    	// statements to be executed
	}


		public class JavaForLoop {
			public static void main(String[] args) {
				//print integers 5 to 10
				for (int i=5; i<=10; i++) {
					System.out.println("Java for loop example - " + i);
				}
			}
		}

	2. "for each loop"
	We can use for each loop to iterate over array or collection elements. Java for each loop is the recommended way wherever it’s possible to use it.

		public class JavaForEachLoopExample {
			public static void main(String[] args) {
				int[] intArray = { 1, 2, 3, 4, 5 };
				for (int i : intArray)
					System.out.println("Java for each loop with array - " + i);

				List<String> fruits = new ArrayList<>();
				fruits.add("Apple");
				fruits.add("Banana");
				fruits.add("Orange");

				for (String f : fruits)
					System.out.println("Java for each loop with collection - " + f);
				}
		}




	3. "for loop with label"
	We can add a label to for loop, it’s useful with break and continue statements to get out of outer loop.

			int[][] intArr = { { 1, -2, 3 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };
			process: for (int i = 0; i < intArr.length; i++) {
				boolean allPositive = true;
				for (int j = 0; j < intArr[i].length; j++) {
					if (intArr[i][j] < 0) {
						allPositive = false;
						continue process;
					}
				}
				if (allPositive) {
					// process the array
					System.out.println("Processing " + Arrays.toString(intArr[i]));
				}
				allPositive = true;
			}




	4. "while loop"
		while (expression) {
    		// statements
		}

		public class JavaWhileLoop {
			public static void main(String[] args) {
				int i = 5;
				while (i <= 10) {
					System.out.println(i);
					i++;
				}
			}
		}




	5. "do while loop"
	Java do while loop is used to execute a block of statements continuously until the given condition is true.
	do while loop in Java is similar to while loop except that the condition is checked after the statements are executed,
	so do while loop guarantees the loop execution at least once.

	do {
     // statements
	} while (expression);


		public class JavaDoWhileLoop {
			public static void main(String[] args) {
				int i = 5;
				do {
					System.out.println(i);
					i++;
				} while (i <= 10);
			}
		}






	01.06. "static" Keyword
	Java static keyword is used to create a Class level variable in java.
	static variables and methods are part of the class, not the instances of the class.
	It can be used in 5 cases:

	1. static variables
		static int count;

		We can use static keyword with a class level variable. A static variable is a class variable and doesn’t belong to Object/instance of the class.
		Since static variables are shared across all the instances of Object, they are not thread safe.
		Usually, static variables are used with the final keyword for common resources or constants that can be used by all the objects.
		If the static variable is not private, we can access it with ClassName.variableName

		ClassName.variableName



	2. static methods
		static void foo() {}

		Same as static variable, static method belong to class and not to class instances.
		A static method can access only static variables of class and invoke only static methods of the class.
		Usually, static methods are utility methods that we want to expose to be used by other classes without the need of creating an instance.
		For example Collections class.
		Java Wrapper classes and utility classes contains a lot of static methods.
		The main() method that is the entry point of a java program itself is a static method.

		    public static void setCount(int count) {
        		if(count > 0)
        		StaticExample.count = count;
    		}

    		//static util method
    		public static int addInts(int i, int...js){
        		int sum=i;
       			 for(int x : js) sum+=x;
        		return sum;
    		}



	3. static block
		static {}

	Java static block is the group of statements that gets executed when the class is loaded into memory by Java ClassLoader.
	Static block is used to initialize the static variables of the class. Mostly it’s used to create static resources when the class is loaded.
	We can’t access non-static variables in the static block. We can have multiple static blocks in a class, although it doesn’t make much sense.
	Static block code is executed only once when the class is loaded into memory.

	    static{
        	//can be used to initialize resources when class is loaded
        	System.out.println("StaticExample static block");
        	//can access only static variables and methods
        	str="Test";
        	setCount(2);
    	}


	4. static inner class
		class Test {
			static class InnerStatic {}
		}

	5. interface static methods





	01.07. "break" Keyword
	There are two forms of break statement – unlabeled and labeled. Mostly break statement is used to terminate a loop based on some condition,
	for example break the processing if exit command is reached.


	1. Unlabeled break statement is used to terminate the loop containing it and can be used with switch, for, while and do-while loops.

	public class JavaBreak {

	public static void main(String[] args) {
		String[] arr = { "A", "E", "I", "O", "U" };

		// find O in the array using for loop
		for (int len = 0; len < arr.length; len++) {
			if (arr[len].equals("O")) {
				System.out.println("Array contains 'O' at index: " + len);
				// break the loop as we found what we are looking for
				break;
			}
		}

		// use of break in while loop
		int len = 0;
		while (len < arr.length) {
			if (arr[len].equals("E")) {
				System.out.println("Array contains 'E' at index: " + len);
				// break the while loop as we found what we are looking for
				break;
			}
			len++;
		}

		len = 0;
		// use of break in do-while loop
		do {
			if (arr[len].equals("U")) {
				System.out.println("Array contains 'U' at index: " + len);
				// break the while loop as we found what we are looking for
				break;
			}
			len++;
		} while (len < arr.length);
	}

}


	2. Labeled break statement is used to terminate the outer loop, the loop should be labeled for it to work.

	public class JavaBreakLabel {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
		boolean found = false;
		int row = 0;
		int col = 0;
		// find index of first int greater than 10
		searchint:

		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > 10) {
					found = true;
					// using break label to terminate outer statements
					break searchint;
				}
			}
		}
		if (found)
			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
	}

}



	01.08. "continue" Keyword
	When continue statement is used in a nested loop, it only skips the current execution of the inner loop.
	Java continue statement can be used with label to skip the current iteration of the outer loop too.
	Let’s have a look at some continue java statement examples.

	public class JavaContinueForLoop {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		// we want to process only even entries
		for (int i : intArray) {
			if (i % 2 != 0)
				continue;
			System.out.println("Processing entry " + i);
		}
	}

}



	*/