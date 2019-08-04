package headfirst.designpatterns.facade;

public class HomeTheaterFacade {

    // 组合
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Screen screen;

    // 外观会将子系统中的每一个组件的应用都传入它的构造器中，然后外观把他们赋值给相应的实例
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Screen screen) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.screen = screen;
    }

    // 没响任务都委托子系统中相应的组件处理
    public void watchMovie(String movie){
        screen.down();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        screen.up();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }

}
