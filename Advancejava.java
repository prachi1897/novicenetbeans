 
package advancejava;
class New{
    int x,y,z;
    
    void add(){
        z=x+y;
    }
    
    New()
    {
        x=10;
        y=20;
    }
    
    void display()
    {
        System.out.println(z);
    }
}
class New1 extends New{
    New1(){
        super();
    }

    @Override
    void add() {
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
}

class PlusNos{
    int a,b,c;
    PlusNos(int a,int b)
    {
        this.a=a;
        this.b=b;       
    }
        void add()
        {
            c=a+b;
         }
    void display()
    {
        System.out.println(c);
    }
}
 class user{
    public void fun(){
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
        }
        System.out.println();
        }
    }
}
public class Advancejava {

    public static void main(String[] args) {
     
      
      New1 obj= new New1();
      obj.add();
      obj.display();
      
    }
    
}

