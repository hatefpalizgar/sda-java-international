package com.sda.java.interfaces;

public class Girl extends Human implements Loveable, Playable{
    private String name;

    public Girl(String skinColor, String name) {
        super(skinColor);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void love() {
        System.out.println("showing love to a girl");
    }

    public void play() {
        System.out.println("A girl is playing...");
    }
}
