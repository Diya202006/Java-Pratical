 package LibraryManagement;
 
 public class Member {
    int memberId;
    String name;

    public Member(int id, String n) {
        memberId = id;
        name = n;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + name);
    }
}