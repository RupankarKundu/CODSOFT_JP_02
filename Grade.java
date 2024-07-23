import java.util.Scanner;
public class Grade
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR MATHS MARKS OUT OF 100 : ");
        int num1=sc.nextInt();
        System.out.println("ENTER YOUR SCIENCE MARKS OUT OF 100 : ");
        int num2=sc.nextInt();
        System.out.println("ENTER YOUR ENGLISH MARKS OUT OF 100 : ");
        int num3=sc.nextInt();
        System.out.println("ENTER YOUR COMPUTER MARKS OUT OF 100 : ");
        int num4=sc.nextInt();
        System.out.println("ENTER YOUR HISTORY MARKS OUT OF 100 : ");
        int num5=sc.nextInt();
        System.out.println("ENTER YOUR GEOGRAPHY MARKS OUT OF 100 : ");
        int num6=sc.nextInt();
        int total=num1+num2+num3+num4+num5+num6;
        System.out.println("YOUR TOTAL MARKS OUT OF 600 IS : "+total);
        float avg_perc=total/6;
        System.out.println("THE TOTAL PERCENTAGE IS : "+avg_perc);
        if(avg_perc>90)
        {
            System.out.println("YOUR GRADE IS A+");
        }
        if(avg_perc>80 && avg_perc<90)
        {
            System.out.println("YOUR GRADE IS A");
        }
        if(avg_perc>70 && avg_perc<80)
        {
            System.out.println("YOUR GRADE IS B");
        }
        if(avg_perc>60 && avg_perc<70)
        {
            System.out.println("YOUR GRADE IS C+");
        }
        if(avg_perc>50 && avg_perc<60)
        {
            System.out.println("YOUR GRADE IS C");
        }
        if(avg_perc>40 && avg_perc<50)
        {
            System.out.println("YOUR GRADE IS D");
        }
        if(avg_perc<40)
        {
            System.out.println("SORRY!! YOU HAVE FAILED THE EXAM.");
        }
    }
}