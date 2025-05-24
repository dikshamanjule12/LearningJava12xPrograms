package Tasks;

public class Task_Traingle_classifier {

    public static void main(String[] args) {


        int side1 = 10;
        int side2 = 12;
        int side3 = 12;


        if(side1 == side2 && side1==side3)
        {
            System.out.println("This is an equilateral triangle");

        } else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("This is an Isosceles triangle");

        }
        else {
            System.out.println("This is a scalene triangle");

        }


    }

}
