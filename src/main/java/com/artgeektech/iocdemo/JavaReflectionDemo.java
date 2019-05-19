package com.artgeektech.iocdemo;

import java.awt.*;
import java.lang.annotation.Annotation;

public class JavaReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException{
        Class<?> engineClass = Class.forName("come.artgeektech.iocdemo.testla.engine.Engine");  // find the class
        Annotation[] engineClassAnnotations = engineClass.getAnnotations(); // get all annotations out of the class

        for(Annotation annotation: engineClassAnnotations) {
            if(annotation instanceof Component){  // if this annotation is Component
                System.out.println("Use reflection to create a Engine instance...\n");
                Object engineBean = engineClass.newInstance(); // create a new instance of BEAN
                System.out.println(engineBean);
            }
        }
    }


}
