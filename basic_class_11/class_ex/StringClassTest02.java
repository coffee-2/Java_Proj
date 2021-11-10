package basic_class_11.class_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest02 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strcl = Class.forName("basic_class_11.class_ex.Person");
		
		Constructor[] cons = strcl.getConstructors();
		for(Constructor c : cons) {System.out.println(c);}
		System.out.println("==========================================");
		
		Field[] fields = strcl.getFields();
		for(Field f : fields) {System.out.println(f);}
		System.out.println("==========================================");
		
		Method[] met = strcl.getMethods();
		for(Method m : met) {System.out.println(m);}
		
		
	}///main
}//////class
