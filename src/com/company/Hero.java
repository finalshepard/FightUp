package com.company;

class Hero extends Character
{
    int xp;
    int gold;
    String name;

    public Hero(String nazwa)
    {
        super();
        xp=0;
        gold=0;
        name=nazwa;
    }

    void lvlup()
    {
        //skillup();
    }

    void skillup()
    {

    }
    void otrzymajxp(int a)
    {
        xp=xp+a;
    }
}
