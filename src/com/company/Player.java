package com.company;

public class Player {
    private String nickname;
    private int lvl;
    private int hp;
    private int atack;

    private Player(Builder builder) {
        this.nickname = builder.nickname;
        this.lvl = builder.lvl;
        this.hp = builder.hp;
        this.atack = builder.atack;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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

    public static class Builder {
        private String nickname;
        private int lvl;
        private int hp;
        private int atack;

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder lvl(int lvl) {
            this.lvl = lvl;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder atack(int atack) {
            this.atack = atack;
            return this;
        }

        public Player build() {
            return new Player(this);
        }


    }
}
