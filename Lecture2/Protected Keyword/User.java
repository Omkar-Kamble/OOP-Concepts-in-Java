public class User{
    protected String username;
    protected String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }
    public void login(){
        System.out.println(username + " logged in");
    }
    public void showDashborad(){
        System.out.println(username + "'s dashboard");
    }
}