package com.cxf.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.cxf.po.Customer;

@Path(value = "/customer")
//@Produces("application/xml")
//@Produces("application/json")
//@Produces("*/*")

public interface CustomerService {
    /**
     * 返回json串.
     * @param id
     * @return
     */
    @GET
    @Path(value = "/{id}/info")
    @Produces("application/json")
    Customer findCustomerById(@PathParam("id")String id);
    /**
     * 返回xml.
     * @param id
     * @return
     */
    @GET
    @Path(value = "/search")
    @Produces("application/xml")
    Customer findCustomerByName(@QueryParam("name")String name);
}

