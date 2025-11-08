package ru.netology.service;

public class CashbackHackerP2 {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}