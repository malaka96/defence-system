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
    public void onSliderValueChange(int value){}
    abstract public void sendMessage(String text);
    
}
