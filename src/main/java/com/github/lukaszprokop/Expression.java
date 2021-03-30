package com.github.lukaszprokop;

interface Expression {
    Money reduce(Bank bank, String to);
}
