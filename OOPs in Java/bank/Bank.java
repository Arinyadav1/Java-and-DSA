package bank;

public class Bank {
    
   
    private String name;
    private Long accountNumber;
    private String email;
    private Long phoneNumber;
    private double balance;
    
    public void setCustomerDetails(String name, Long accountNumber, String email, Long phoneNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;    
    }

    

    public String getName() {
       return "Name: " + name +"\n" + "Account Number: " + accountNumber +"\n" +"Email: " + email +"\n" + "Phone Number: " + phoneNumber +"\n" + "Balance: " + balance;
    }

}
