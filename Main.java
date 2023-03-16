public class Main
{
    public static void main(String[] args)
    {

        SBI s = new SBI();
        ICICI ic = new ICICI();
        BOI b = new BOI();

        ic.setName("riya");
        ic.setChairmanName("varun");
        ic.setBranchCount(2);
        ic.setFdInterestRate(3.4F);
        ic.setPersonalLoanInterestRate(2.0F);
        ic.setHomeLoanInterestRate(4.45F);
        System.out.println(ic.getName());
        System.out.println(ic.getChairmanName());
        System.out.println(ic.getBranchCount());
        System.out.println(ic.getFdInterestRate());
        System.out.println(ic.getPersonalLoanInterestRate());
        System.out.println(ic.getHomeLoanInterestRate());


        //for sbi bank
        s.setName("shobit");
        s.setChairmanName("supriya");
        s.setBranchCount(5);
        s.setFdInterestRate(9.4F);
        s.setPersonalLoanInterestRate(7.0F);
        s.setHomeLoanInterestRate(4.58F);
        System.out.println(s.getName());
        System.out.println(s.getChairmanName());
        System.out.println(s.getBranchCount());
        System.out.println(s.getFdInterestRate());
        System.out.println(s.getPersonalLoanInterestRate());
        System.out.println(s.getHomeLoanInterestRate());

        //BOI BANK
        b.setName("kunal");
        b.setChairmanName("gaurav");
        b.setBranchCount(5);
        b.setFdInterestRate(6.7F);
        b.setPersonalLoanInterestRate(4.5F);
        b.setHomeLoanInterestRate(6.89F);
        b.setHomeLoanInterestRate(5.6F);
        System.out.println(b.getName());
        System.out.println(b.getChairmanName());
        System.out.println(b.getBranchCount());
        System.out.println(b.getFdInterestRate());
        System.out.println(b.getHomeLoanInterestRate());
        System.out.println(b.getPersonalLoanInterestRate());

































    }
}