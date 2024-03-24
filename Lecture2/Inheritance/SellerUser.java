public class SellerUser extends User{
    public SellerUser(String username, String email){
        super(username, email);
    }
    
    public void addProducts(){
        System.out.println("Seller is adding a new products");  
    }

    @Override
    public void showDashborad(){
        System.out.println("Seller user personalised dashboard");
    }
}