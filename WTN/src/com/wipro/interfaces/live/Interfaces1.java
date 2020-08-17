package com.wipro.interfaces.live;
import com.wipro.interfaces.music.Playable;
import com.wipro.interfaces.music.string.Veena;
import com.wipro.interfaces.music.wind.Saxophone;

public class Interfaces1{
	public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable p1, p2; 
        p1 = new Veena();
        p2 = new Saxophone();
        v.play(); 
        s.play(); 
        p1.play(); 
        p2.play();
}
}