package com.training.app;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
