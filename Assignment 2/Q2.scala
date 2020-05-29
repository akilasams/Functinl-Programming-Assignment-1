object Theatre extends App{
    def attendees(ticketPrice:Int):Int=120+((15-ticketPrice)/5)*20;
    def revenue(ticketPrice:Int):Int=attendees(ticketPrice)*ticketPrice;
    def cost(ticketPrice:Int):Int=500+(3*attendees(ticketPrice));
    def profit(ticketPrice:Int):Int=revenue(ticketPrice)-cost(ticketPrice);

    print(profit(5),profit(10),profit(15),profit(20));
}
