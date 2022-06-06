public class Commission  extends Employee
{
    private double comFee;
    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        comFee=0;
    }
    public void addCom(int val){
        comFee+=val;
    }
    public double pay(){
        double fee=comFee;
        comFee=0;
        return fee;   
    }
    public String toString(){
        String result=super.toString();
        result+="\nCommission Fee: "+comFee;
        return result;
    }
}