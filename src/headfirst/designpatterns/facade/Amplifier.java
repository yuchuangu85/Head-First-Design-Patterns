package headfirst.designpatterns.facade;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on(){

    }

    public void off(){

    }

    public void setCd(){

    }

    public void setDvd(DvdPlayer dvd){
        this.dvdPlayer = dvd;
    }

    public void setTuner(){

    }

    public void setVolume(int volume){

    }

}
