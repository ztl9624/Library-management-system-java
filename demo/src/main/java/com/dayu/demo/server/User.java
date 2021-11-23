package com.dayu.demo.server;

import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;
import java.util.Map;

@Path("/User")
@Service
public interface User {


    @Path("/test")
    @POST
    public Map<String,String> test(Map<String,String> map);
}
