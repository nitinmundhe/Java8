package com.java8.day3.javacparameternames;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class JavaParameterNames {
    public static void main(String[] args) {
        Method[] methods = JavaParameterNames.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + " ");
            }
        }
        System.out.println(");");
    }

    public void main(String name, int age) {

    }

}
