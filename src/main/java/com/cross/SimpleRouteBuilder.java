package com.cross;

import org.apache.camel.builder.RouteBuilder;


public class SimpleRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://D:/Talend/In/")
                .process(new MyProcessor())
                .to("file://D:/Talend/Out/");
    }

}

