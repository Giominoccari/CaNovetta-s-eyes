package controller;

import canovett.Telecamera;

public class Controller{
    private Telecamera[] telecamere;

    public Controller(int size){
        telecamere = new Telecamera[size];
        for(final Telecamera telecam : telecamere){
            telecam = new Telecamera();
        }
    }
    public void SwitchOn(int index){
        telecamere[index].SwitchOn();
    }
}