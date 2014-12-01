package org.soulwing.bds.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class DemoResource {

  @GET
  public Response getDemo() {
    return Response.ok("Hello, world").build();
  }
  
}
