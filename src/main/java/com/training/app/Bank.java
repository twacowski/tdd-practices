package com.training.app;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if(from.equals(to)) {
            return 1;
        }
        int rate = (int) rates.get(new Pair(from, to));
        return rate;
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

}


