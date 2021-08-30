package com.sb.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sb.basic.beans.Bike;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class BasicBootApplication 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(BasicBootApplication.class, args);
        
    	Bike bike = context.getBean(Bike.class);
    	
    	System.out.println( "Bike : " + bike );
    }
}
