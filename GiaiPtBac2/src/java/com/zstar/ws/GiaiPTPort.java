/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zstar.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author ASUS
 */
@Path("giaiptport")
public class GiaiPTPort {
    private com.zstar.ws_client.GiaiPT port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GiaiPTPort
     */
    public GiaiPTPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method GiaiPTB2
     * @param a resource URI parameter
     * @param b resource URI parameter
     * @param c resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("giaiptb2/")
    public String getGiaiPTB2(@QueryParam("a")
            @DefaultValue("0.0") double a, @QueryParam("b")
            @DefaultValue("0.0") double b, @QueryParam("c")
            @DefaultValue("0.0") double c) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.giaiPTB2(a, b, c);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private com.zstar.ws_client.GiaiPT getPort() {
        try {
            // Call Web Service Operation
            com.zstar.ws_client.GiaiPT_Service service = new com.zstar.ws_client.GiaiPT_Service();
            com.zstar.ws_client.GiaiPT p = service.getGiaiPTPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
