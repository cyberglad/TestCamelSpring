package com.cross;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class FileCopier {
    public static void main(String[] args)
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
        System.out.println("Application context started");
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        ctx.stop();
        ctx.close();
    }
}
