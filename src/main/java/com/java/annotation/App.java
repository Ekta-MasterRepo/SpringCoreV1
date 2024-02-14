package com.java.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//.xml location src/main/java  then ClassPathResource("applicationContext.xml")
        System.out.println( "Hello World!" );
        Resource rs = new ClassPathResource("/com/java/annotation/applicationContext.xml");      
        
        //BeanFactory IOC
        BeanFactory bf =new XmlBeanFactory(rs);
        Student st1 =(Student)bf.getBean("student");
        System.out.println(st1);
        
        //ApplicationContext IOC
        ApplicationContext ap= new ClassPathXmlApplicationContext("/com/java/annotation/applicationContext.xml");
        Student st =(Student)ap.getBean("student");
        System.out.println(st);
        
    }
}
