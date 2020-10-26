package br.edu.ufcg.computacao.eureca.common.util.connectivity;

import br.edu.ufcg.computacao.eureca.common.exceptions.EurecaException;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpResponseException;
import org.junit.Test;

public class HttpErrorConditionToFogbowExceptionMapperTest {

	private static final String MESSAGE = "message";
	
    // test case: When calling the get method with a forbidden(403) 
	// HttpResponseException, it must verify if It returns an UnauthorizedRequestException.	
	@Test
	public void testGetWithFobbidenHttpResponseException() throws EurecaException {
		// set up
		HttpResponseException e = new HttpResponseException(HttpStatus.SC_FORBIDDEN, MESSAGE);
		
		// exercise
		HttpErrorConditionToFogbowExceptionMapper.map(e);
	}

	// test case: When calling the get method with an unauthorized(401)
	// HttpResponseException, it must verify if It returns an UnauthenticatedUserException.
	@Test
	public void testGetWithUnauthorizedHttpResponseException() {
		// set up
		HttpResponseException e = new HttpResponseException(HttpStatus.SC_UNAUTHORIZED, MESSAGE);

		// exercise
		HttpErrorConditionToFogbowExceptionMapper.map(e);
	}

	// test case: When calling the get method with a not found(404)
	// HttpResponseException, it must verify if It returns an InstanceNotFoundException.
	@Test
	public void testGetWithNotFoundHttpResponseException() {
		// set up
		HttpResponseException e = new HttpResponseException(HttpStatus.SC_NOT_FOUND, MESSAGE);

		// exercise
		HttpErrorConditionToFogbowExceptionMapper.map(e);
	}

	// test case: When calling the get method with any unmapped
	// HttpResponseException, it must verify if It returns an FogbowException.
	@Test
	public void testGetWithUnmappedHttpResponseException() {
		// set up
		int anyOtherStatusCode = 0;
		HttpResponseException e = new HttpResponseException(anyOtherStatusCode, MESSAGE);

		// exercise
		HttpErrorConditionToFogbowExceptionMapper.map(e);
	}
}
