class User{
   /*
    this is Private Access Modifier use
     <--within in class-->
     */
    String usename;
    private String password;
    //getter and setter
    public String getPass(){
       return this.password;
    }

    public void setPass(String pass){
        this.password = pass;
    }


}

public class Private_access_modifier {
    public static void main(String[] args) {
        User obj = new User();
        obj.setPass("Arin$3yadav12#");
        String password = obj.getPass();
        System.out.println(password);
    }
}
