abstract class bank
{
    public String Name,headofficeAddress, chairmanName;
    public int branchCount;
    public float fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;
    //constructor
//    public bank(String name,String headofficeAddress, String chairmanName,int branchCount, float fdInterestRate,float personalLoanInterestRate, float homeLoanInterestRate)
//    {
//        this.Name = name;
//        this.headofficeAddress= headofficeAddress;
//        this.chairmanName= chairmanName;
//        this.branchCount= branchCount;
//        this.fdInterestRate=fdInterestRate;
//        this.personalLoanInterestRate= personalLoanInterestRate;
//        this.homeLoanInterestRate=homeLoanInterestRate;
//    }
    //getter


    public String getName() {
        return Name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public float getFdInterestRate() {
        return fdInterestRate;
    }

    public float getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public float getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public abstract void setName(String name);

    public abstract void setHeadofficeAddress(String headofficeAddress);

    public abstract void setChairmanName(String chairmanName);

    public abstract  void setBranchCount(int branchCount);

    public abstract void setFdInterestRate(float fdInterestRate);

    public abstract  void setPersonalLoanInterestRate(float personalLoanInterestRate);

    public abstract void setHomeLoanInterestRate(float homeLoanInterestRate);
}

