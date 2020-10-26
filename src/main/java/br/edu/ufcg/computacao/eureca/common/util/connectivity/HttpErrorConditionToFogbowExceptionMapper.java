package br.edu.ufcg.computacao.eureca.common.util.connectivity;

import br.edu.ufcg.computacao.eureca.common.exceptions.*;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpResponseException;

public class HttpErrorConditionToFogbowExceptionMapper {

    public static EurecaException map(HttpResponseException e) {
        switch (e.getStatusCode()) {
            case HttpStatus.SC_FORBIDDEN:
                return new UnauthorizedRequestException(e.getMessage());
            case HttpStatus.SC_UNAUTHORIZED:
                return new UnauthenticatedUserException(e.getMessage());
            case HttpStatus.SC_BAD_REQUEST:
                return new InvalidParameterException(e.getMessage());
            case HttpStatus.SC_CONFLICT:
                return new ConfigurationErrorException(e.getMessage());
            case HttpStatus.SC_SERVICE_UNAVAILABLE:
                return new UnavailableProviderException(e.getMessage());
            default:
                return new InternalServerErrorException(e.getMessage());
        }
    }

    public static EurecaException map(int httpCode, String message) {
        switch(httpCode) {
            case HttpStatus.SC_FORBIDDEN:
                return new UnauthorizedRequestException(message);
            case HttpStatus.SC_UNAUTHORIZED:
                return new UnauthenticatedUserException(message);
            case HttpStatus.SC_BAD_REQUEST:
                return new InvalidParameterException(message);
            case HttpStatus.SC_CONFLICT:
                return new ConfigurationErrorException(message);
            case HttpStatus.SC_GATEWAY_TIMEOUT:
                return new UnavailableProviderException(message);
            default:
                return new InternalServerErrorException(message);
        }
    }
}
