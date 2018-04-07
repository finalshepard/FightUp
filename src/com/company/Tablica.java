package com.company;

import java.util.Scanner;

class Tablica
{
    public Tablica()
    {

    }


    void glownaplansza()
    {
        System.out.printf("Wybierz opcję: \n1.Dungeon\n2.Adventure\n3.Sklep\n4.Ekwipunek\n5.Nagroda dzienna\n6.Umiejetnosci\n7.CZEK EFRYFINK");
        Scanner wejscie = new Scanner(System.in);
        switch(wejscie.nextInt())
        {
            case 1:
            {
                walka();
                //Dungeon();
                break;
            }
        }
    }

    void Dungeon()
    {

    }

    void walka() {
        Hero nowy = new Hero("Jacus");
        int count=0;
        int mojehp = nowy.DajZycie();
        int mojedmg = nowy.DajDmg();
        System.out.println("WALKA! Oto twoja " + count + " walka w tym dungeonie! Walcz "+nowy.DajImie());  //DODAC PREMIE DO TURY OD ZASKOCZENIA
        do {
            Enemy wrog = new Enemy();
            String imie = wrog.DajImie();
            int wrogzycie = wrog.DajZycie();
            int dmg = wrog.DajDmg();
            System.out.println("Spotykasz na swojej drodze " + imie);
            boolean aa = true;
            do {
                if (aa==true) {
                    System.out.printf("Wrog Cie zaatakowal! %S atakuje jako pierwszy\n", imie);
                }
                System.out.printf("%s atakuje\n",imie);
                mojehp=mojehp-dmg;
                if(mojehp>0)
                {
                    System.out.printf("Atakujesz wroga!\n");
                    wrogzycie=wrogzycie-mojedmg;
                }

            } while ((mojehp > 0)&&(wrogzycie>0));
            System.out.println("WYGRALES POJEDYNEK");
            //getloot
            //getexperience
        } while (mojehp > 0);
        System.out.println("Umierasz se... na chwilę");
    }
}

