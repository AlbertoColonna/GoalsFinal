/**
 * Filter
 */
package com.sap.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

/**
 * Request Filter, registered in PDBApplication
 * @author C5078697
 */
public class RequestFilter implements  ContainerRequestFilter {
	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		request.getHeaders().add("Access-Control-Allow-Origin", "*");
	}
}