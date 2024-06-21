public class AccessM {


    public static void main(String[] args) {
        Account a= new Account();
        a.name="Neha";
        System.out.println(a.name);
        

        
        
    }

    
}
class Account{

    public String name;
    protected String email;
    private String password;
   

    void setInfo(String nm, String em, String pwd){
        name= nm;
        email= em;
        password=pwd;
    }


}
