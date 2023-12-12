package edu.wctc;

import edu.wctc.Loot.Loot;
import edu.wctc.Loot.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Loot> inventory;
    private int score;
    private Weapon weapon;

    public Player()
    {
        inventory = new ArrayList<>();
        weapon = null;
    }

    public void addToInventory(Loot loot)
    {
        if(loot instanceof Weapon)
        {
            Weapon weapon = (Weapon) loot;
            if(equipNewWeaponPrompt(weapon)){
                this.weapon = weapon;
            }
        }
        inventory.add(loot);
        score += loot.getLootScoreBonus();
    }

    public void displayInventory()
    {
        if(inventory.size() == 0)
            System.out.println("\tYou have nothing in your inventory");
        for(int i = 0; i < inventory.size(); i++)
        {
            System.out.printf("\t%d. %s\n", i + 1, inventory.get(i).getDescription());
        }
    }

    public boolean hasWeapon(){
        return weapon != null;
    }

    public int getScore() {
        return score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private boolean equipNewWeaponPrompt(Weapon weapon)
    {
        System.out.printf("%s can be wielded.", weapon.getDescription());
        if(this.weapon == null || promptYesNoMenu(String.format( "Equip the %s instead of the %s?",weapon.getDescription(), this.weapon.getDescription()))){
            setWeapon(weapon);
            System.out.printf("You wield the %s\n", weapon.getDescription());
        }
    }

    private boolean promptYesNoMenu(String prompt)
    {
        System.out.println(prompt + "\n(Y)es/(N)o");
        String input = keyboard.nextLine();

        return input.toLowerCase().charAt(0) == 'y';
    }
}
