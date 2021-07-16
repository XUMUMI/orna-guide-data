package com.xumumi.enumerate;

import java.io.Serial;

class EnumNotFoundException extends IllegalArgumentException {
    @Serial
    private static final long serialVersionUID = 6096650097287901531L;

    EnumNotFoundException(final String s) {
        super(String.format("%s not found", s));
    }
}
