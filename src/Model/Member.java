package Model;

public class Member {
//    public static void main(String[] args) {
//        MembershipCard m= new MembershipCard();
//        System.out.println( m.getcardNumber());
//    }

    private String name;
    private String pass;
    private String contactNo;
    private int cardNo;
    private int expYear;
    private String memberType;

    Member(String name,String pass,String contactNo,int cardNo,int expYear,String memberType){
        this.name=name;
        this.pass=pass;
        this.contactNo=contactNo;
        this.cardNo=cardNo;
        this.expYear=expYear;
        this.memberType=memberType;
    }
}
