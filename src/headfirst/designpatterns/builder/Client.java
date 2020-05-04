package headfirst.designpatterns.builder;

/**
 * Created by yuchuan
 * DATE 2020/5/3
 * TIME 21:28
 */
class Client {

    public static void main(String[] args) {
        Planner.VacationBuilder builder = new Planner.VacationBuilder();
        Planner planner = builder.buildDay(20200503)
                .addHotel(20200505, "Gradn Facadian")
                .addReservation("resevation")
                .addSpecialEvent("Game")
                .addTickets("Patterns on Ice")
                .getVacationPlanner();
    }

}
