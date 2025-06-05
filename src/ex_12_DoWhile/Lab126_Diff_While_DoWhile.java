package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a=0;
//        while(a<0)
//        {
//            System.out.println(a);  //blank output
//            a++;
//        }

        do{
            System.out.println(a);     //0 is printed atleast once
            a++;
        }while(a<0);
    }
}
