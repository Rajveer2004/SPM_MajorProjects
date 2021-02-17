import java.util.*;
public class conversionsAadit {
    public int inputType;
    public String inputValue;
    conversionsAadit(int inputType, String inputValue) {
        this.inputType=inputType;
        this.inputValue=inputValue;   
    }
    public static void main(String args[]){
        System.out.println("----------------------");
        input();
    }
    static void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("starting value \n 1:decimal \t2:binary \t3:hexadecimal"+
        "\t4:octal");
        int choiceType=sc.nextInt();
        System.out.println("enter your number");
        String choice=sc.next();
        conversionsAadit client=new conversionsAadit(choiceType,choice);
        switch (client.inputType){
            case 1: decimalFunction(client.inputValue); 
                    break;
            case 2: binaryFunction(client.inputValue);
                    break;
            case 3: hexaFunction(client.inputValue);
                    break ;
            case 4: octalFunction(client.inputValue);
                    break;
            default: System.err.println("wrong choice");
        }
    sc.close();
    }
    static void decimalFunction(String choice){
        int c=Integer.parseInt(choice);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toOctalString(c));
        again();
    }
    static void binaryFunction(String choice){     
        System.out.println(Integer.parseInt(choice,2));
        int c=Integer.parseInt(choice,2);
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toOctalString(c));
        again();
    }
    static void hexaFunction(String choice){
        int c=Integer.parseInt(choice,16);
        System.out.println(c);
        System.out.println(Integer.toOctalString(c));
        System.out.println(Integer.toBinaryString(c));
        again();
    }
    static void octalFunction(String choice){
        int c=Integer.parseInt(choice,8);
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toHexString(c));
        again();
    }
    static void again(){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("wanna run the program again? ");
        System.out.println("1:Yes \t 2:No");
        int choice=sc.nextInt();
        if(choice==1) input();
        sc.close();
    }
}

