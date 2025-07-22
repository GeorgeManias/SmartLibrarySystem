package UserItems;

public class Member extends User {
    private String membershipId;

    public Member(String name, String email, String membershipId) {
        super(name, email);
        this.membershipId=membershipId;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }
}
