package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkSetHealth(healthPercentage);
        this.weapon = weapon;
    }
    public void checkSetHealth(int healthPercentage){
        if(healthPercentage>100) {this.healthPercentage = 100;}
        if(healthPercentage<0) {this.healthPercentage = 0;}
    }

    public int healthRemaining (){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
        int healthRemain = this.healthPercentage - damage;
        if(healthRemain<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        this.healthPercentage = healthRemain;
        checkSetHealth(this.healthPercentage);
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        checkSetHealth(this.healthPercentage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
