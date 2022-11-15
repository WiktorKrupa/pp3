import java.util.Random;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, int numberOfGrades)
    {
        this.studentName = name;
        for (int i=0 ; i<numberOfGrades; i++)
        {
            Random rd = new Random();
            int number = rd.nextInt(6);
            number+=4;
            double grade = 0.5;
            grade*=number;
            grades[i]=grade;

            


        }
    }

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public double lowestGrade()
    {
        double min = 110;
        for( int i = 0; i< grades.length; i++)
        {
            if(grades[i]<min)
            {
                min = grades[i];
            }
        }
    return min;
    }
    public double highestGrade()
    {
        double max = 0;
        for (int i = 0; i<grades.length ; i++)
        {
            if (grades[i]>max)
            {
                max = grades[i];
            }
        }
        return max;
    }
    public int numOfGrades()
    {
        return grades.length;
    }
    public double averageGrade()
    {
        double sum = 0;
        for (int i=0 ; i<grades.length; i++)
        {
            sum+=grades[i];
        }
        double average = sum/grades.length;
        return average;
    }

    public void displayInfo()
    {
        System.out.println(studentName);
        for (int i = 0; i<grades.length; i++)
        {
            System.out.println(grades[i]);
        }
        
        System.out.println(numOfGrades());
        System.out.println(lowestGrade());
        System.out.println(highestGrade());
        System.out.println(averageGrade());

    }
    
    public static void main(String[] args)
    {
        StudentGrades s1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades s2 = new StudentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5}  );
        StudentGrades s3 = new StudentGrades("Wiktor", 10);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
