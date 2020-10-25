package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class UnauthenticatedUserException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public UnauthenticatedUserException() {
        super(Messages.AUTHENTICATION_ERROR);
    }

    public UnauthenticatedUserException(String message) {
        super(message);
    }
}
