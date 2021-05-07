
import java.util.Scanner;

public class main 
{
    
    static void menu()
    {
        System.out.println("1. Pakistan");
        System.out.println("2. India");
        System.out.println("3. China");
        System.out.println("4. Saudi Arabia");
        System.out.println("5. Trukey");
    }
    
    public static void main(String args[])
    {
        
        Scanner get=new Scanner(System.in);
        
        float amount;
        int from;
        int to;
        
        menu();
        
        System.out.print("Enter amount : " );
        amount=get.nextFloat();
        
        System.out.print("Enter choice to convert from : " );
        from=get.nextInt();
        
        System.out.print("Enter choice to convert  to : " );
        to=get.nextInt();
        
        calculator cal=new calculator(amount,from,to);
        
        System.out.print(cal.process());
       
        
    }
}
