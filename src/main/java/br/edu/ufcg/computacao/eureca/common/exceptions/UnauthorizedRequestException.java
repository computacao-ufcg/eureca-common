package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class UnauthorizedRequestException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public UnauthorizedRequestException() {
        super(Messages.AUTHORIZATION_ERROR);
    }

    public UnauthorizedRequestException(String message) {
        super(message);
    }
}
