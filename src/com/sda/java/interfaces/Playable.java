package com.sda.java.interfaces;

import java.io.Serializable;

// multiple inheritance is ONLY allowed once both sides are interfaces (parent and child)
public interface Playable extends Loveable, Cloneable, Serializable {
     void play();
}
