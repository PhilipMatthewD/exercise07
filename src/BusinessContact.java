public class BusinessContact extends ContactInfo{
    private double phoneNum;

    public BusinessContact(String name, String email, double phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void display() {
        System.out.println(getName() + "s email is " + getEmail() + " and their Phone Number is " + phoneNum + ".");
    }
}
