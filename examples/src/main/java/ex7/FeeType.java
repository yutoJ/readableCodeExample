package ex7;

public enum FeeType {

    adult( new AdultFee() ),
    child( new ChildFee() ),
    senior( new SeniorFee());

    private Fee fee;

    FeeType(Fee fee) {
        this.fee = fee;
    }

    Yen yen(){return fee.yen();}
    String label(){return this.label();}

    public Yen feeFor(String feeTypeName){
        FeeType feeType = FeeType.valueOf(feeTypeName);

        return feeType.yen();
    }
}
