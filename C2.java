//----------- constructor channing within the class

public class C_Channing {               
    int Rollno;                          //----------- instance integer type variable
    String Name;                         //----------- instance string type variable
    C_Channing()                         //----------- non-parameterise constructor
    {
        Rollno=10;                         //----------assigning value to the integer variable
        Name="Aman";                        //----------assigning value to the string variable
    }
    C_Channing(int Rollno,String Name)          //---------parameterise constructor
    {
        this.Rollno=Rollno;
        this.Name=Name;
    }
    public void display()                          //------------method to display the value
    {
        System.out.println(Rollno);                //------------ printing rollno
        System.out.println(Name);                  //------------ printing name
    }
}                                                   //------------ end of defination class
//-----------execution class
class Test                                    
{
    public static void main(String[] args) {               //main method
        C_Channing obj1=new C_Channing();                   // creating object with non-parametrise constructor
        C_Channing obj2=new C_Channing(12,"Ram");   // creating object with parametrise constructor
        obj1.display();                                  //calling display method with non-parametrise constructor
        obj2.display();                                  //calling display method with parametrise constructor
    }
}                                                      // End of execution class
