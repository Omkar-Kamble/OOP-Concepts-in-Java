public class ParamConstructor{
    private String name;

    ParamConstructor(String lang){
        name = lang;
        System.out.println(name + " is a programming language");
    }

    public static void main(String args[]){
        ParamConstructor p = new ParamConstructor("C++");
    }

}