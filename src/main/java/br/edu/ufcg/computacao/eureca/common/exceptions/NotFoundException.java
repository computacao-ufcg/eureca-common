package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class NotFoundException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super(Messages.NOT_FOUND);
    }

    public NotFoundException(String message) {
        super(message);
    }
}
