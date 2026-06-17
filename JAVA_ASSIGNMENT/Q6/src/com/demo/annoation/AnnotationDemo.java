package com.demo.annoation;
import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls = MyClass.class;

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        System.out.println(
                "Annotated Methods:");

        for(Method m : methods) {

            if(m.isAnnotationPresent(
                    CustomAnnotation.class)) {

                System.out.println(
                        m.getName());

                m.invoke(obj);
            }
        }

        System.out.println(
                "\nNot Annotated Methods:");

        for(Method m : methods) {

            if(!m.isAnnotationPresent(
                    CustomAnnotation.class)) {

                System.out.println(
                        m.getName());
            }
        }
    }
}
