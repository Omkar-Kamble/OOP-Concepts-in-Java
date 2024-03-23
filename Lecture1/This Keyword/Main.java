public class Main{

    // instance variable
    int var;

    // we are passing var (value : 8) by using constructor to above int var variable 
    // parameter variable
    Main(int var){
        this.var = var;
        System.out.println("this reference : " + this);
    }

    public static void main(String[] args){
        Main obj = new Main(8);
        System.out.println("object reference : " + obj);
    }
}