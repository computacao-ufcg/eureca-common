package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class InternalServerErrorException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public InternalServerErrorException() {
        super(Messages.UNEXPECTED);
    }

    public InternalServerErrorException(String message) {
        super(message);
    }
}
