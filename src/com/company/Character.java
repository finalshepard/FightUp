package com.company;

abstract class Character
{
    private int health;
    private int lvl;
    String name;
    private int dmg;
    private int armor;

    public Character()
    {
        health=100;
        lvl=0;
        dmg=10;
        armor=0;
    }
    public Character(String imie)
    {
        health=100;
        lvl=0;
        name=imie;
        dmg=10;
        armor=0;
    }

    public int DajZycie()
    {
        return health;
    }
    public int DajDmg()
    {
        return dmg;
    }
    public int PrzeliczArmor()
    {
        return armor*health;
    }
    String DajImie()
    {
        return name;
    }

}
