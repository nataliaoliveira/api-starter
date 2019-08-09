package com.nataliaoliveira.starter.exception;

import com.nataliaoliveira.starter.formatter.MessageFormatter;

/**
 * Created by: Natália Oliveira
 * Date: 09/08/2019 18:05
 */
public abstract class FormattedRuntimeException extends RuntimeException {

    public FormattedRuntimeException(String message) {
        super(message);
    }

    public FormattedRuntimeException(String message, Object... parameters) {
        super(MessageFormatter.format(message, parameters));
    }

}
