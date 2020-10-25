package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class InvalidParameterException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public InvalidParameterException() {
        super(Messages.UNEXPECTED);
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}
