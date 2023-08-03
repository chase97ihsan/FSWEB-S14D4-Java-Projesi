package com.workintech.abstraction.monster;

public class Troll extends Monster  {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return super.getDamage()*0.25;
    }

    @Override
    public double poison() {
        return 0;
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+poison();
    }
}
