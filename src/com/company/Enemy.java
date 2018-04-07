package com.company;

class Enemy extends Character
{
    private final String[] nazwy = {"Antek","Marian","Sebastian","Jacek","Ania","Kasia","Maja"};
    String names =nazwy[(randomWithRange(0,6))];


    public Enemy()
    {
        super();
        name=names;
    }

    private int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
