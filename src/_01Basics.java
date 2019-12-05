public class _01Basics {
	
	// 01.01. Hello world
	
	public static void main (String[] args) {
		System.out.println("Hello World");
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
	(PL: Metoda - Jest zestawem wyra�e� przetwarzaj�cych pewne zadania i zwracaj�cych odpowiedwzywaj�cemu.
	Metody umo�liwiaj� pisanie kodu mo�liwego do ponownego u�ycia i dzieli program na mniejsze jednostki.)

	1. Overloaded Methods: If a class have multiple methods with the same name, they are called as overloaded methods. 
	(PL: Metody Prze�adowane - Je�eli klasa ma wiele metod o tej samej nazwie, nazywane s� one metodami prze�adowanymi.)
	
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
	(PL: Je�eli metoda zwraca niespodziewany rezultat, czy jest to b��d oblicze�, czy jaki� niespotykane zachowanie w�czas ta metoda zwraca wyj�tek.
	Wyj�tek mo�e by� opisany w metodzie. W�wczasa zamiast zwraca� wyj�tek, metoda b�dzie wywo�ywa� wcze�niej opisany kod.)
	
		public int divide(int x, int y) throws IllegalArgumentException {
			if(y==0) throw new IllegalArgumentException("Can't divide by 0");
			return x/y;
		}
	
	
	3. Recursive Method: When a method calls itself, it's called as a recursive method. We should be very careful in defining recursive method because it can go 
	into infinite loop if there is no terminal condition. Let's look at a method that returns factorial of a number using recursion.
	(PL: Metoda Rekursywna - Gdy metoda wzywa sam� siebie nazywamy to metod� rekursywn�. Wzywanie metody rekursywnej mo�e skutkowa� niesko�czon� p�tl� je�li nie ma po 
	drodze warunku ko�cz�cego wykonywanie tej metody. Poni�ej metoda licz�ca silni� danej liczby.)
	
		public static long factorial(long n) {
			if (n == 1)
				return 1;
			else
				return (n * factorial(n - 1));
		}
	
	
	4. Method Calling Another Method: We can call another method from a method, let's redefine the above overloaded methods by reusing the print(String s) method. 
	(PL: Metoda wzywa inn� metod�: Wewn�trz metody wywo�ali�my inna metod�, poni�ej przyk�ad)
	
		public void print(String s) {
			System.out.println(s);
		}
		
		public void print(String s, int times) {
			for (int i=0; i< times; i++) {
			print(s);
			}	
		}
	
	
	5. Java Interface Static Method: Java interfaces can have static method from Java 8 onwards. Here is a small example of the interface static method. 
	(PL: Metoda Statyczna Interfejsu: interfejsy mog� mie� statyczne metody od Javy 8 w g�r�.)
	
		public interface MyData {

			static boolean isNull(String str) {
				System.out.println("Interface Null Check");
				return str == null ? true : "".equals(str) ? true : false;
  			}
		}
	
	
	6. Java Interface Default Method: From Java 8 onwards, interfaces can have default method implementations. 
	(PL: Metoda Domy�lna Interfejsu: interfejsy moga mie� domy�ln� implementacj� metody)
	
		public interface MyData {

			default void print(String str) {
				if (!isNull(str))
					System.out.println("MyData Print::" + str);
			}
		}
	
	
	7. Java Getter Setter Methods: Java Getter Setter Methods are conventional methods to access and update an object properties. 
	These methods create abstraction and we can restrict access to different properties. Most of the IDEs support easy creation of getter-setter methods of a property. 
	(PL: Gettery i Settery: gettery i settery to wygodny spos�b na dost�p i akyualizacj� w�a�ciwo�ci obiekt�w.
	Te metody tworz� abstrakcj� i mog� ogranicza� dost�p do r�znych w�a�ciwo�ci.)
	
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
	(PL: Metoda Abstrakcyjna: Klasa abstrakcyjna i interfejs mo�e deklarowa� metod� bez implementacji (bez cia�a metody)
	Klasa rozszerzaj�ca i implementuj�ca takie metody ma obowi�zek stworzy� definicje takich metod. )
	
		public abstract class Person {
			public abstract void work();
		}

		public interface Shape {
			//interface methods are implicitly abstract and public
			void draw();
			double getArea();
		}
	
	
	
	
	
	
	*/
	
	

}