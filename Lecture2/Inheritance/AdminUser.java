public class AdminUser extends User{
    AdminUser(String username, String email){
        super(username, email);
    }

    public void manageProducts(){
        System.out.println("Admin is managing products");
    }

    @Override
    public void showDashborad(){
        super.showDashborad();
        System.out.println("Admin user personalised dashboard");
    }

    public static void main(String[] args){
        AdminUser au = new AdminUser("OmkarK", "omkar29@gmail.com");
        au.login();
        au.showDashborad();
    }    
}