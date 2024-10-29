package Model;

public class Member {

    private MembershipCard msc = new MembershipCard();
    private String name;
    private String contactNo;
    private int cardNo;
    private int expYear;
    private String memberType;

    public Member(String name, String contactNo, String memberType) {
        this.name = name;
        this.contactNo = contactNo;
        cardNo = msc.getcardNumber();
        expYear = msc.getExpYear();
        this.memberType = memberType;
//        System.out.println(name+" "+contactNo+" "+cardNo+" "+expYear+" "+memberType+" ");
    }

    public String getMName() {
        return name;
    }
    
     public String getMConNo() {
        return contactNo;
    }
     
     public int getMCardNo() {
        return cardNo;
    }
     
      public int getMExpYear() {
        return expYear;
    }
     
      public String getMType() {
        return memberType;
    }
}
