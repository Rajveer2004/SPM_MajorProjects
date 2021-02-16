package com.company;
import java.text.DecimalFormat;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary Decimal Octal Hex

        int choice, rem_decimal;
        for (int rerun = 0; rerun < 2; rerun++) {
            //asks user for type of input
            System.out.println("What is your starting value in?? \n" +
                    "Press the associated number for choice:" +
                    "1:Decimal, 2:Binary, 3:Octal, 4:Hexadecimal");
            choice = sc.nextInt();

            //switch case for input type start
            switch (choice) {

                //decimal to
                case 1:

                    //asks user for Decimal input
                    System.out.println("Pls enter your Decimal value");
                    int decimal_input = sc.nextInt();

                    //separate cautionary value to go through the calculations
                    int decimal_calc = decimal_input;

                    //choice for user convert it to the other values
                    System.out.println("What value do you want " + decimal_input + " converted to?? \n" +
                            "Press the associated number for choice:" +
                            "1:Binary, 2:Octal, 3:Hexadecimal");
                    int convert_choice_decimal = sc.nextInt();

                    //array to get the required value
                    int[] converted_output_decimal = new int[8];

                    //Decimal to Binary
                    if (convert_choice_decimal == 1) {

                        for (int i = 7; i >= 0; i--) {
                            rem_decimal = decimal_calc % 2;
                            if (rem_decimal == 0) {
                                converted_output_decimal[i] = 0;
                            } else {
                                converted_output_decimal[i] = 1;
                            }
                            decimal_calc = decimal_calc / 2;
                        }
                        for (int j = 0; j <= 7; j++) {
                            System.out.print(converted_output_decimal[j]);
                        }
                        System.out.print("\n");
                        break;


                    }


                    //Decimal to Octal
                    else if (convert_choice_decimal == 2) {
                        for (int i = 7; i >= 0; i--) {
                            rem_decimal = decimal_calc % 8;
                            converted_output_decimal[i] = rem_decimal;
                            decimal_calc = decimal_calc / 8;

                        }
                        for (int j = 0; j <= 7; j++) {
                            System.out.print(converted_output_decimal[j]);
                        }
                        System.out.print("\n");
                        break;
                    }


                    //Decimal to Hexadecimal
                    else if (convert_choice_decimal == 3) {
                        String[] converted_output_3 = new String[8];
                        for (int i = 7; i >= 0; i--) {
                            rem_decimal = decimal_calc % 16;
                            String value = String.valueOf(rem_decimal);
                                if (rem_decimal < 10 && rem_decimal>0) {
                                    converted_output_3[i] = value;
                                } else {
                                    if (rem_decimal == 10) {
                                        converted_output_3[i] = "A";
                                    } else if (rem_decimal == 11) {
                                        converted_output_3[i] = "B";
                                    } else if (rem_decimal == 12) {
                                        converted_output_3[i] = "C";
                                    } else if (rem_decimal == 13) {
                                        converted_output_3[i] = "D";
                                    } else if (rem_decimal == 14) {
                                        converted_output_3[i] = "E";
                                    } else if (rem_decimal == 15) {
                                        converted_output_3[i] = "F";
                                    }
                                    else
                                    {
                                        converted_output_3[i]="";
                                    }

                                }
                                decimal_calc = decimal_calc / 16;
                        }
                        for (int j = 0; j <= 7; j++) {
                            System.out.print(converted_output_3[j]);
                        }
                        System.out.print("\n");
                        break;
                    }


                //binary to
                case 2:
                    System.out.println("Pls enter your Binary value");
                    int binary_input = sc.nextInt();

                    //choice for user convert it to the other values
                    System.out.println("What value do you want " + binary_input + " converted to?? \n" +
                            "Press the associated number for choice:" +
                            "1:Decimal, 2:Octal, 3:Hexadecimal");
                    int convert_choice_binary = sc.nextInt();

                    int[] converted_output_binary = new int[8];

                    //Binary to Decimal
                    if (convert_choice_binary == 1) {

                        int val_decimal = 0;
                        for (int m = 0; m <= 7; m++) {
                            converted_output_binary[m] = binary_input % 10;
                            binary_input = binary_input / 10;
                        }
                        for (int mm = 7; mm >= 0; mm--) {
                            if (converted_output_binary[mm] == 1) {
                                val_decimal = (int) (val_decimal + (1 * Math.pow(2, mm)));
                            }
                        }
                        System.out.println(val_decimal);
                        break;
                    }

                    //Binary to Octal
                    else if (convert_choice_binary == 2) {
                        int[] binary_to_octal = new int[3];
                        int q = 2;

                        String string_binary = Integer.toString(binary_input);
                        int len_binary = string_binary.length();
                        if (len_binary % 3 != 0) {
                            DecimalFormat df = new DecimalFormat("000000000");
                            string_binary = df.format(binary_input);
                        }
                        for (int r = 0; r < 9; r = r + 3) {
                            char result_1 = string_binary.charAt(r);
                            char result_2 = string_binary.charAt(r + 1);
                            char result_3 = string_binary.charAt(r + 2);

                            char[] ca = {result_1, result_2, result_3};
                            String character = String.valueOf(ca);


                            if (character.equals("000")) {
                                binary_to_octal[q] = 0;
                                q--;
                            } else if (character.equals("001")) {
                                binary_to_octal[q] = 1;
                                q--;
                            } else if (character.equals("010")) {
                                binary_to_octal[q] = 2;
                                q--;
                            } else if (character.equals("011")) {
                                binary_to_octal[q] = 3;
                                q--;
                            } else if (character.equals("100")) {
                                binary_to_octal[q] = 4;
                                q--;
                            } else if (character.equals("101")) {
                                binary_to_octal[q] = 5;
                                q--;
                            } else if (character.equals("110")) {
                                binary_to_octal[q] = 6;
                                q--;
                            } else if (character.equals("111")) {
                                binary_to_octal[q] = 7;
                                q--;
                            }
                        }

                        for (int i = 2; i >= 0; i--) {
                            System.out.print(binary_to_octal[i]);
                        }
                        System.out.println("\n");
                        break;
                    }


                    //Binary to Hexadecimal
                    else if (convert_choice_binary == 3) {
                        char[] binary_to_hexa = new char[4];
                        int qq = 3;

                        String string_binary_hexa = Integer.toString(binary_input);
                        int len_binary_hexa = string_binary_hexa.length();

                        if (len_binary_hexa % 4 != 0) {
                            DecimalFormat df = new DecimalFormat("000000000000");
                            string_binary_hexa = df.format(binary_input);
                        }
                        for (int r = 0; r < len_binary_hexa; r = r + 4) {
                            char result_1 = string_binary_hexa.charAt(r);
                            char result_2 = string_binary_hexa.charAt(r + 1);
                            char result_3 = string_binary_hexa.charAt(r + 2);
                            char result_4 = string_binary_hexa.charAt(r + 3);

                            char[] ca = {result_1, result_2, result_3, result_4};
                            String character = String.valueOf(ca);


                            if (character.equals("0000")) {
                                binary_to_hexa[qq] = '0';
                                qq--;
                            } else if (character.equals("0001")) {
                                binary_to_hexa[qq] = '1';
                                qq--;
                            } else if (character.equals("0010")) {
                                binary_to_hexa[qq] = '2';
                                qq--;
                            } else if (character.equals("0011")) {
                                binary_to_hexa[qq] = '3';
                                qq--;
                            } else if (character.equals("0100")) {
                                binary_to_hexa[qq] = '4';
                                qq--;
                            } else if (character.equals("0101")) {
                                binary_to_hexa[qq] = '5';
                                qq--;
                            } else if (character.equals("0110")) {
                                binary_to_hexa[qq] = '6';
                                qq--;
                            } else if (character.equals("0111")) {
                                binary_to_hexa[qq] = '7';
                                qq--;
                            } else if (character.equals("1000")) {
                                binary_to_hexa[qq] = '8';
                                qq--;
                            } else if (character.equals("1001")) {
                                binary_to_hexa[qq] = '9';
                                qq--;
                            } else if (character.equals("1010")) {
                                binary_to_hexa[qq] = 'A';
                                qq--;
                            } else if (character.equals("1011")) {
                                binary_to_hexa[qq] = 'B';
                                qq--;
                            } else if (character.equals("1100")) {
                                binary_to_hexa[qq] = 'C';
                                qq--;
                            } else if (character.equals("1101")) {
                                binary_to_hexa[qq] = 'D';
                                qq--;
                            } else if (character.equals("1110")) {
                                binary_to_hexa[qq] = 'E';
                                qq--;
                            } else if (character.equals("1111")) {
                                binary_to_hexa[qq] = 'F';
                                qq--;
                            }
                        }

                        for (int i = 3; i >= 0; i--) {
                            System.out.print(binary_to_hexa[i]);
                        }
                        System.out.println("\n");
                        break;
                    }


                    //Octal to
                case 3:
                    System.out.println("Pls enter your Octal value");
                    int octal_input = sc.nextInt();

                    //choice for user convert it to the other values
                    System.out.println("What value do you want " + octal_input + " converted to?? \n" +
                            "Press the associated number for choice:" +
                            "1:Decimal, 2:Binary");
                    int convert_choice_octal = sc.nextInt();

                    int[] converted_output_octal = new int[8];

                    //Octal to Decimal
                    if (convert_choice_octal == 1) {
                        int val_octal = 0;
                        for (int m = 0; m <= 7; m++) {
                            converted_output_octal[m] = octal_input % 10;
                            octal_input = octal_input / 10;
                        }
                        for (int mm = 7; mm >= 0; mm--) {
                            val_octal = (int) (val_octal + (converted_output_octal[mm] * Math.pow(8, mm)));
                        }
                        System.out.println(val_octal);
                        break;
                    }

                    //octal to binary
                    else if (convert_choice_octal == 2) {
                        String[] octal_to_binary = new String[8];
                        String str_octal = String.valueOf(octal_input);
                        int octa_len = str_octal.length();
                        for (int hn = 0; hn < octa_len; hn++) {
                            char chn = str_octal.charAt(hn);
                            if (chn == '0') {
                                octal_to_binary[hn] = "000";
                            } else if (chn == '1') {
                                octal_to_binary[hn] = "001";
                            } else if (chn == '2') {
                                octal_to_binary[hn] = "010";
                            } else if (chn == '3') {
                                octal_to_binary[hn] = "011";
                            } else if (chn == '4') {
                                octal_to_binary[hn] = "100";
                            } else if (chn == '5') {
                                octal_to_binary[hn] = "101";
                            } else if (chn == '6') {
                                octal_to_binary[hn] = "110";
                            } else if (chn == '7') {
                                octal_to_binary[hn] = "111";
                            }
                        }

                        for (int hh = 0; hh < octa_len; hh++) {
                            System.out.print(octal_to_binary[hh]);
                        }
                        System.out.println("\n");
                        break;
                    }

                    //hexadecimal to
                case 4:
                    System.out.println("Pls enter your Hexadecimal value");
                    String hexadecimal_input = sc.next();
                    int hexa_len = hexadecimal_input.length();


                    //choice for user convert it to the other values
                    System.out.println("What value do you want " + hexadecimal_input + " converted to?? \n" +
                            "Press the associated number for choice:" +
                            "1:Decimal, 2:Binary");
                    int convert_choice_hexadecimal = sc.nextInt();


                    int[] converted_output_hexadecimal = new int[8];


                    //hexa to Decimal
                    if (convert_choice_hexadecimal == 1) {

                        for (int hn = 0; hn < hexa_len; hn++) {
                            char chn = hexadecimal_input.charAt(hn);
                            int a = Character.getNumericValue(chn);
                            converted_output_hexadecimal[hn] = a;
                        }


                        int val_decimal = 0;
                        int ah = 0;

                        for (int hh = hexa_len - 1; hh >= 0; hh--) {
                            val_decimal = (int) (val_decimal + (converted_output_hexadecimal[ah] * Math.pow(16, hh)));
                            ah++;
                        }
                        System.out.println(val_decimal);
                        break;
                    }

                    //Hexadecimal to Binary
                    else if (convert_choice_hexadecimal == 2) {
                        String[] hex_to_binary = new String[8];

                        for (int hn = 0; hn < hexa_len; hn++) {
                            char chn = hexadecimal_input.charAt(hn);
                            if (chn == '0') {
                                hex_to_binary[hn] = "0000";
                            } else if (chn == '1') {
                                hex_to_binary[hn] = "0001";
                            } else if (chn == '2') {
                                hex_to_binary[hn] = "0010";
                            } else if (chn == '3') {
                                hex_to_binary[hn] = "0011";
                            } else if (chn == '4') {
                                hex_to_binary[hn] = "0100";
                            } else if (chn == '5') {
                                hex_to_binary[hn] = "0101";
                            } else if (chn == '6') {
                                hex_to_binary[hn] = "0110";
                            } else if (chn == '7') {
                                hex_to_binary[hn] = "0111";
                            } else if (chn == '8') {
                                hex_to_binary[hn] = "1000";
                            } else if (chn == '9') {
                                hex_to_binary[hn] = "1001";
                            } else if (chn == 'A') {
                                hex_to_binary[hn] = "1010";
                            } else if (chn == 'B') {
                                hex_to_binary[hn] = "1011";
                            } else if (chn == 'C') {
                                hex_to_binary[hn] = "1100";
                            } else if (chn == 'D') {
                                hex_to_binary[hn] = "1101";
                            } else if (chn == 'E') {
                                hex_to_binary[hn] = "1110";
                            } else if (chn == 'F') {
                                hex_to_binary[hn] = "1111";
                            }
                        }

                        for (int hh = 0; hh < hexa_len; hh++) {
                            System.out.print(hex_to_binary[hh]);
                        }
                        System.out.println("\n");
                        break;
                    }

                default:
                    System.out.println("You entered an invalid input");
                    break;
            }


            System.out.println("Press 1 to re-run the code");
            int re=sc.nextInt();
            if (re==1)
            {
                rerun=0;
            }
            else
            {
                rerun=1;
            }
        }
    }
}



