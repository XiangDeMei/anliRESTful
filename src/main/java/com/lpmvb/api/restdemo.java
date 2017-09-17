package com.lpmvb.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class restdemo {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String say() {
        return "Hello World!" ;
    }
}
