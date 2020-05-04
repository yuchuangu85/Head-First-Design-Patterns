package headfirst.designpatterns.builder;

/**
 * Created by yuchuan
 * DATE 2020/5/3
 * TIME 21:36
 */
class Planner {

    int date;
    int hotelDate;
    String hotelName;
    String reservation;
    String event;
    String ticket;

    public Planner(int date, int hotelDate, String hotelName, String reservation, String event, String ticket) {
        this.date = date;
        this.hotelDate = hotelDate;
        this.hotelName = hotelName;
        this.reservation = reservation;
        this.event = event;
        this.ticket = ticket;
    }

    static class VacationBuilder extends AbstractBuilder {

        int date;
        int hotelDate;
        String hotelName;
        String reservation;
        String event;
        String ticket;

        @Override
        AbstractBuilder buildDay(int date) {
            this.date = date;
            return this;
        }

        @Override
        AbstractBuilder addHotel(int hotelDate, String name) {
            this.hotelDate = hotelDate;
            this.hotelName = name;
            return this;
        }

        @Override
        AbstractBuilder addReservation(String reservation) {
            this.reservation = reservation;
            return this;
        }

        @Override
        AbstractBuilder addSpecialEvent(String event) {
            this.event = event;
            return this;
        }

        @Override
        AbstractBuilder addTickets(String ticket) {
            this.ticket = ticket;
            return this;
        }

        @Override
        Planner getVacationPlanner() {
            // 根据需求抛出异常或者添加默认值
            if (date <= 0) {
                throw new IllegalArgumentException("Date cannot be smaller than 0");
            }
            // 如果有一些设置用户没有设置的话，这里可以设置一些默认设置
            if (hotelName == null || "".equals(hotelName)){
                hotelName = "Grand Hotel";
            }
            return new Planner(date, hotelDate, hotelName, reservation, event, ticket);
        }

    }

}
