package DeepConcepts.Interface;
/*
need for interface is that it helps in designing web applications
and to make it lossely coupled means independent to each other.

Note:- we can change it from class to abstract and then it will help to implelemt interface
 */
//Below are the three sets of codes which show how can we change one form to another

class Computer{  
    public void code(){  

    }
}
class Laptop extends Computer{ 
    public void code(){
        System.out.println("code , compile, run");
    }
}
class Desktop extends Computer{  
    public void code(){
        System.out.println("code, compile , run , faster");
    }
}
class Developer{
    public void devApp(Computer com){
        com.code();
    }
}

//2.transformation from class to abstract class
abstract class Computer2{  
    public abstract void code();
}
class Laptop2 extends Computer{ 
    public void code(){
        System.out.println("code , compile, run");
    }
}
class Desktop2 extends Computer{  
    public void code(){
        System.out.println("code, compile , run , faster");
    }
}
class Developer2{
    public void devApp(Computer com){
        com.code();
    }
}

//3.transformation from abstract class to interface
interface Computer3{  
    void code();
}
class Laptop3 implements Computer3{ 
    public void code(){
        System.out.println("code , compile, run");
    }
}
class Desktop3 implements Computer3{  
    public void code(){
        System.out.println("code, compile , run , faster");
    }
}
class Developer3{
    public void devApp(Computer com){
        com.code();
    }
}
public class needforinterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer hussain = new Developer();
        hussain.devApp(lap);
    }
}
