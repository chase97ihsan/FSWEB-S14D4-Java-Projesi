package com.workintech.abstraction.main;

import com.workintech.abstraction.monster.Bleedable;
import com.workintech.abstraction.monster.Monster;
import com.workintech.abstraction.monster.Troll;

public class MainMosters {


    public static void main(String[] args) {

        Monster troll=new Troll("CHARLIE",300,70);
        System.out.println(troll.attack());
        Monster troll2=new Troll("JACK",500,80);
        System.out.println(troll2.attack());

    }
}
