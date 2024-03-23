public class Main{
    private String name;

    //no-args constructor
    Main(){
        System.out.println("Constructor is called !!!");
        name = "Omkar";
    }

    public static void main(String args[]){
        Main obj = new Main();
        System.out.println(obj.name);
    }
}