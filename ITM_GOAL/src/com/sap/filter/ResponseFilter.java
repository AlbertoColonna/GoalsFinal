/**
 * Filter
 */
package com.sap.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Response Filter
 * @author C5078697
 */
public class ResponseFilter implements ContainerResponseFilter {
  private static final Logger LOG = LoggerFactory.getLogger(ResponseFilter.class);
	@Override
  public void filter(ContainerRequestContext request, ContainerResponseContext response) throws IOException {
    LOG.debug("Filtering response for {}", request.getUriInfo().getPath());

    response.getHeaders().add("Access-Control-Allow-Origin", "*");
    response.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT"); 
		response.getHeaders().add("Access-Control-Allow-Headers", "value, accept, key, Authorization, content-type, X-Requested-With, X-Codingpedia");
  }
}
