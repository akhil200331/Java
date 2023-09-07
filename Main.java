//21BCE9784 Vaddi Akhil Lab-7 Q-2
import java.util.Scanner;
class Students
{
    String name;
    int roll_no;
    String address;
    float cgpa;
}
public class Main
{
    public static void main(String[] args)
    {
        int i, j, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of students:");
        n = input.nextInt();
        Students[] arr = new Students[n];
        for (i = 0; i < n; i++)
            arr[i] = new Students();
        for (i = 0; i < n; i++)
        {
            System.out.println("Enter the details (Name, Roll num, Address,CGPA) of student " + (i + 1));
            arr[i].name = input.next();
            arr[i].roll_no = input.nextInt();
            arr[i].address = input.next();
            arr[i].cgpa = input.nextFloat();
        }
        for (i = 0; i < n - 1; i++)
        {
            int index = i;
            for (j = i + 1; j < n; j++)
                if (arr[j].cgpa < arr[index].cgpa)
                    index = j;
            Students smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Students list sorted in non-decreasing order of CGPA");

        for (i = 0; i < n; i++)
        {
            System.out.println("Name : " + arr[i].name + " " +
                    "Roll Number : " + arr[i].roll_no + " " +
                    "Address : " + arr[i].address + " " +
                    "CGPA : " + arr[i].cgpa);
        }
    }
}