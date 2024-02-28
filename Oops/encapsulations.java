

//it binds data with functions , in this we cannot access data directly , used for data abstraction
public class encapsulations {
    private String name;
    private int age;
    private int id;

    public String getName(){
      return name;
    }
    
    public int getAge(){
        return age;
    }
    public int getID(){
        return id;
    }
    
    public void setName( String newName){
        name =  newName;
    }

    public void setAge(int newAge){
        age =  newAge;
    }

    public void setID(int newID){
        id =  newID;
    }

    public static void main(String[] args) {
        encapsulations en = new encapsulations();
        en.setName("imam husain");
        en.setAge(22);
        en.setID(40120125);
        System.out.println("Details of student is Name: "  + en.getName() + " Age: " + en.getAge()+" " + " ID : "+en.getID());
    }
     
    

}