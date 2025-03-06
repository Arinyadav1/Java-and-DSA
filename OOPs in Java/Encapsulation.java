import bank.*;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Bank Customer Details");
        Bank bank = new Bank(); 
        bank.setCustomerDetails("Ankit Yadav", 1234567890L, "ankit123@gmail.com", 1234567890L, 1000000.0);
        System.out.println(bank.getName());      
    }
}
