package controller;

import telecamere.Telecamera;

public class Controller{
    private Telecamera[] telecamere;

    public Controller(int size){
        telecamere = new Telecamera[size];
        for(int i = 0; i < size; i++){
            telecamere[i] = new Telecamera();
        }
    }
    public void Choose(int index){
        this.telecamere[index].SwitchOn();
    }
    public void ToString(){
         for(final Telecamera telecam : telecamere){
            System.out.print("| "+ telecam.IsSwitchedOn());
        }
    }
}