package v1;

/**
 * 공연을 관람하기 위해서는 티켓 필요
 */
public class Ticket {
    private Long fee; // 티켓 가격

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }
}
