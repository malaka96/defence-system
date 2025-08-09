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
}
