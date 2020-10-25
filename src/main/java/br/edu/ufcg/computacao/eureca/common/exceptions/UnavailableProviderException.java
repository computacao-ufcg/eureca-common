package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class UnavailableProviderException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public UnavailableProviderException() {
        super(Messages.UNAVAILABLE_PROVIDER);
    }

    public UnavailableProviderException(String message) {
        super(message);
    }
}
