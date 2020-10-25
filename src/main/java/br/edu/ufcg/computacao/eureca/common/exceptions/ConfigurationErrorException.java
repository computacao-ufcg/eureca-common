package br.edu.ufcg.computacao.eureca.common.exceptions;

import br.edu.ufcg.computacao.eureca.common.constants.Messages;

public class ConfigurationErrorException extends EurecaException {
    private static final long serialVersionUID = 1L;

    public ConfigurationErrorException() {
        super(Messages.CONFIGURATION_ERROR);
    }

    public ConfigurationErrorException(String message) {
        super(message);
    }
}

