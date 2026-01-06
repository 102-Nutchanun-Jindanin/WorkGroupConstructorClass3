public class TestMembership {
    public static void main(String[] args) {
        System.out.println("Before create: " + Membership.Memcount);
        Membership m1 = new Membership();
        Membership m2 = new Membership("M001");
        Membership m3 = new Membership("M002", "Alice");
        Membership m4 = new Membership("M003", "Bob", "Diamond");
        m1.printMembership();
        m2.printMembership();
        m3.printMembership(" From m3");
        m4.printMembership(" From m4");
        System.out.println("After create : " + Membership.Memcount);
    }
}