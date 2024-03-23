public class DataClient{
    public static void main(String[] args){
        Data d = new Data();

        // we cannot access name by using below thing
        // d.name = "Omkar";
        // System.out.println(d.name);

        // we can access private name by using getters & setters
        d.setName("Omkar");
        System.out.println(d.getName());
    }
}