/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstWeek;

/**
 *
 * @author lomze
 */
public class today091923 {
    public int sumDouble(int a, int b){
        int i = 0;
        if (a == b){
            i = ((a+b)*2);
        } else {
            i = (a+b);
        }
        return i;
    }
    public boolean sleepIn(boolean weekday, boolean vacation){
        return (!weekday || vacation);
    }
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile&&bSmile)||(!aSmile&&!bSmile));
    }
    
    public boolean sleepIn2(boolean w, boolean v) {
        return (w&&v);
    }

    public boolean love6(int a, int b) {
        return (a==6||b==6||a+b==6||a-b==6||b-a==6);
    }
}
