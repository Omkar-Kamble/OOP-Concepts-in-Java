public class ConstructorOverloading{
    private String lang;

    ConstructorOverloading(){
        lang = "JAVA";
    }
    ConstructorOverloading(String language){
        lang = language;
    }
    public static void main(String args[]){
        ConstructorOverloading c = new ConstructorOverloading();
        System.out.println("The language is "+ c.lang);     
    }
}