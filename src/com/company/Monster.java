package com.company;

public class Monster {
    private String name;
    private String category;
    private int hp;
    private int atack;
    private int lvl;

    public Monster(Builder builder) {

    }

    public static class Builder{
        private String name;
        private String category;
        private int hp;
        private int atack;
        private int lvl;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder hp (int hp) {
            this.hp = hp;
            return this;
        }

        public Builder atack (int atack) {
            this.atack = atack;
            return this;
        }

        public Builder lvl (int lvl) {
            this.lvl = lvl;
            return this;
        }

        public Monster build(){
            return new Monster(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
