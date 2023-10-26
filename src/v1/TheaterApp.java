package v1;

public class TheaterApp {

    public static final long AMOUNT = 5000L;

    public static void main(String[] args) {
        //초대장 없는 사람, 돈 10000원
        Bag bag1 = new Bag(10000L);
        Audience audience1 = new Audience(bag1);
        System.out.println("초대권이 있나? " + audience1.getBag().hasInvitation());
        System.out.println("티켓이 있나? " + audience1.getBag().hasTicket());
        System.out.println("현재 가진 돈: " + audience1.getBag().getAmount());

        //ticketOffice 에서 돈을 이용해 티켓을 사고, 극장에 들어가자.
        TicketOffice ticketOffice = new TicketOffice(AMOUNT, new Ticket(5000L));
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Theater theater = new Theater(ticketSeller);
        theater.enter(audience1);

        System.out.println("티켓 구매 & 극장 입장!");
        System.out.println("초대권이 있나? " + audience1.getBag().hasInvitation());
        System.out.println("티켓이 있나? " + audience1.getBag().hasTicket());
        System.out.println("현재 가진 돈: " + audience1.getBag().getAmount());
    }
}
