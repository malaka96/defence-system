/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system_project;

/**
 *
 * @author USER
 */
public class Controller {

    private Observer[] observers = new Observer[10];
    private int nextIndex = 0;

    public void addObserver(Observer observer) {
        observers[nextIndex] = observer;
        nextIndex++;
    }

    public void setSliderValue(int value) {
//        for(Observer ob : observers){
//            ob.onSliderValueChange(value);
//        }
        observers[0].onSliderValueChange(value);
        observers[1].onSliderValueChange(value);
        observers[2].onSliderValueChange(value);
    }

    public void setMessage(String text) {
//        for(Observer ob : observers){
//            ob.sendMessage(text);
//        }
        observers[0].sendMessage(text);
        observers[1].sendMessage(text);
        observers[2].sendMessage(text);
        observers[3].sendMessage(text);

    }

    public void setPrivateMessageToHelicopter(String text) {
        observers[0].sendMessage(text);
    }

    public void setPrivateMessageToTank(String text) {
        observers[1].sendMessage(text);
    }

    public void setPrivateMessageToSubmarine(String text) {
        observers[2].sendMessage(text);
    }

    public void setPrivateMessageToMain(String text) {
        observers[3].sendMessage(text);
    }
    
    public void setAreaStatus(boolean value){
        observers[0].areaStatus(value);
        observers[1].areaStatus(value);
        observers[2].areaStatus(value);
    }
    
    public void setHAmmor(int value){
        observers[3].updateHAmmor(value);
    }
    
    public void setSAmmor(int value){
        observers[3].updateSAmmor(value);
    }
    
    public void setTAmmor(int value){
        observers[3].updateTAmmor(value);
    }
    
    public void setHPos(boolean value){
        observers[3].updateHPos(value);
    }
    public void setTPos(boolean value){
        observers[3].updateTPos(value);
    }
    public void setSPos(boolean value){
        observers[3].updateSPos(value);
    }
}
