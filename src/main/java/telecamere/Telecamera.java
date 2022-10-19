package telecamere;

public class Telecamera{
    
    private boolean switchedOn;

    public Telecamera () { 
        this.switchedOn = false;
    }
    public void SwitchOn () { 
        this.switchedOn = true;
    }
    public void SwitchOff () { 
        this.switchedOn = false;
    }
    public boolean IsSwitchedOn() { 
        return this.switchedOn;
    }
}