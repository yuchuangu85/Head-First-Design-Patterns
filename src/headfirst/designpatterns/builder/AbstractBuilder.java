package headfirst.designpatterns.builder;

/**
 * Created by yuchuan
 * DATE 2020/5/3
 * TIME 21:30
 */
abstract class AbstractBuilder {

    abstract AbstractBuilder buildDay(int date);

    abstract AbstractBuilder addHotel(int hotelDate, String name);

    abstract AbstractBuilder addReservation(String reservation);

    abstract AbstractBuilder addSpecialEvent(String event);

    abstract AbstractBuilder addTickets(String ticket);

    abstract Planner getVacationPlanner();

}
