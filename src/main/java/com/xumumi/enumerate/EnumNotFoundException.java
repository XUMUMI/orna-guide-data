package com.xumumi.enumerate;

class EnumNotFoundException extends IllegalArgumentException {
    EnumNotFoundException(final String s) {
        super(String.format("%s not found", s));
    }
}
