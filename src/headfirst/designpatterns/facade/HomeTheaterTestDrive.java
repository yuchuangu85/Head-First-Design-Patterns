package headfirst.designpatterns.facade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(),
                new DvdPlayer(), new CdPlayer(), new Screen());

        // 只需要调用外观的方法就可以执行一切需要的方法
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }

}
