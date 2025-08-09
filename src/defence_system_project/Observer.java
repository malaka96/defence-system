/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system_project;

/**
 *
 * @author USER
 */
abstract class Observer extends javax.swing.JFrame {
    abstract public void sendMessage(String text);
    public void onSliderValueChange(int value){}
    public void areaStatus(boolean value){}
    
    public void updateHAmmor(int value){}
    public void updateSAmmor(int value){}
    public void updateTAmmor(int value){}
    
    public void updateHPos(boolean value){}
    public void updateSPos(boolean value){}
    public void updateTPos(boolean value){}
    
}
