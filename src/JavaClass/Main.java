/**
 * @author Rustom Trayvilla
 * @since June 06, 2025
 * @version 1.0
 */
package JavaClass;

/*
 * Main class for class and their object 
 * to be executed
 */
public class Main {

	public static void main(String[] args) {
		
		FirstClass fcObject = new FirstClass("5. Constructor is set");
		System.out.println(fcObject.a);
		
		//Modify the attribute/field
		fcObject.a = "2. Attribute is modified.";
		System.out.println(fcObject.a);
		
		//Use class name to call static
		FirstClass.staticAccessMethod();
		
		//public void method
		fcObject.publicMethod();
		
		//Print out constructor
		System.out.println(fcObject.b);
		
		/*
		 * Encapsulation Example		
		 */
		
		Encapsulation encapSample = new Encapsulation();
		encapSample.setStudentName("Saitama");
		
		System.out.println("6. Student Name: "+encapSample.getStudentName());
		
		/*
		 * InnerClass Example
		 */
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println("7. "+myInner.innerClass + myOuter.OuterClass);
		
		
		
	}

}
