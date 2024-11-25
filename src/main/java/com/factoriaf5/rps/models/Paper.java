package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Move;

public class Paper extends Move {
    @Override
    public String getName() {
        return "Papel";
    }

    @Override
    public boolean win(Move other) {
        return other instanceof Rock || other instanceof Spock;
    }
}