package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.model.MyClass;

public class ReflectionTest {

	public static void main(String[] args) {
		MyClass obj=new MyClass(10,"arjun");
		Class cls=obj.getClass();
		System.out.println("Name of the class "+cls.getName());
		
		Method[] mlist=cls.getMethods();
		for(Method m:mlist) {
			System.out.println("Modifier :"+m.getModifiers());
			System.out.println("name : "+m.getName());
			System.out.println("count of parameters "+m.getParameterCount());
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}
		
		Constructor[] carr=cls.getConstructors();
		for(Constructor c:carr) {
			System.out.println(" Constructor Name "+c.getName());
			System.out.println(" parameter count Constructor  "+c.getParameterCount());
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}


		try {
			    Method m2ref=cls.getDeclaredMethod("method1", int.class);
				m2ref.invoke(obj, 34);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
				Field[] farr=cls.getDeclaredFields();
				for(Field f:farr) {
					System.out.println("Field name :"+f.getName());
					System.out.println("Field type :"+f.getType().getName());
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			
					f.setAccessible(true);
					
					
				}
				
				try {
					System.out.println("Before modification :" +obj);
					farr[0].set(obj, 123);
					System.out.println("After modification :"+obj);
					farr[1].set(obj, "vwxyz");
					System.out.println("After modifying name :"+obj);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}