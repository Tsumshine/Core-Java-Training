/* Java program to demonstrate Static Variable.
 * Author: Thabo Pitso
 * Date: 2022/03/11
 */

package co.edureka.variables;

public class StaticVarExample {
	
	public static String myClassVar = "class or static variable";

	public static void main(String[] args) {
		
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();
		
		//All three will display "class or static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		//changing the value of static variable using obj2
		obj2.myClassVar = "Text Changed";
		
		//All three will display "Changed Text"
		
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		

	}

}
