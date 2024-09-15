import java.util.*;
public class GenGrade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Subjects");
        int n=sc.nextInt();
        double sum=0;
        System.out.println("Enter the Marks of Subjects(Out of 100)");
        for(int i=0;i<n;i++)
        {
            double m=sc.nextInt();
            sum=sum+m;
        }
        double s=sum;
        double avgper=sum/n;

        String res="";
        if(avgper>=91)
        {
            res="O";
        }
        else if(avgper>=81 && avgper<91)
        {
            res="A+";
        }
        else if(avgper>=71 && avgper<81)
        {
            res="A";
        }
        else if(avgper>=61 && avgper<71)
        {
            res="B+";
        }
        else if(avgper>=51 && avgper<61)
        {
            res="B";
        }
        else if(avgper>=41 && avgper<51)
        {
            res="C";
        }
        else if(avgper<41)
        {
            res="F";
        }
        System.out.println("Total Marks: "+s+", "+"Average Percentage: "+avgper+"%, "+"Corresponding Grade: "+res+".");
        
     }
}