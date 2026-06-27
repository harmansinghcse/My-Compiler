package com.craftinginterpreters.lox;

import java.util.HashMap;
import java.util.Map;

class Environment {
    private final Map<String, Object> values = new HashMap<>();

    Object get(Token name) {
        if(values.conainskey(name.lexeme)) {
            return values.get(name.lexeme);
        }

        throw new RunTimeError(name, 
            "Undefined Variable '" + name.lexeme + "'.");
    }


    void define(String name, Object value) {
        values.put(name, value);
    }

}
