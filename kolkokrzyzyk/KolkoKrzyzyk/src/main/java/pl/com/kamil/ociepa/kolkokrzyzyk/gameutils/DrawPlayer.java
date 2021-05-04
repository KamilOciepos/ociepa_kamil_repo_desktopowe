/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.kamil.ociepa.kolkokrzyzyk.gameutils;

import java.util.Random;

/**
 *
 * @author a20ko
 */
public class DrawPlayer {
    public static boolean randomPlayer(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
    public static boolean randomSign(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
}
