package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1='A'; // A to Z, a-z, !@#$%^&*()_+
      //   char c="A"; // "" == String - bunch of char

        char c2= 'B';
        char c3='@';
        char c4='$';
        char c5='%';
        char c6='1';
        char c7='(';

        char c8= ' ';  // blank space

        //Escape char
        char new_line ='\n';
        char tab_line= '\t';
        char back_space ='\b';
        char carriage_return ='\r';

        System.out.println("DikshaManjule");
        System.out.println("Diksha"+new_line+"Manjule");
        System.out.println("Diksha"+tab_line+"Manjule");
        System.out.println("Diksha"+back_space+"Manjule");
        System.out.println("  --------");
        System.out.println("Diksha is old"+carriage_return+"Manjule");// first string before it is removed

        System.out.println("Diksha  \n Manjule");

        char c='A';
        char rupees ='₹';
        System.out.println(rupees);
        char my_laugh_smily='\u1F60';
        System.out.println(my_laugh_smily);
        char c11='\u1F60';
    }
}
