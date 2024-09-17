public class person {
    String name;
    int age;


    person(String name,int age){
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.print("Name: "+this.name+" Age: "+this.age+ "--->");
    }

}
