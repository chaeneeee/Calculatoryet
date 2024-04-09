package com.java.calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner scanner = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        //숫자를 입력하면 첫번째 double 에 할당된다
        //숫자가 아닌 값을 입력하면 숫자를 입력하라고 String 출력
        //숫자가 입력되고 입력받은 연산자 값을 String or Char 타입으로 저장한다
        // 연산자 저장 후
        //두번째 숫자 double 을 받는다 .
        //첫번째 숫자 값 +연산자 + 두번째 숫자 값 계산을 한 결과 result 를 반환한다

//        double FirstSValue;

        String wrongNum = "숫자를 입력해주세요";


//        if( FirstSValue ==!){
//           ;}
//         else {  double FirstSValue = scanner.nextFloat();}

        System.out.println("숫자를 입력해주세요");

        String FirstSValue = scanner.nextLine();
        String OperatorValue =scanner.nextLine();
        String SecondValue = scanner.nextLine();

        double result = 0;

       if( !OperatorValue.equals("+")|| !OperatorValue.equals("-")|| !OperatorValue.equals("*") || !OperatorValue.equals("/") ) {
           System.out.println("연산자를 입력해주세요");
       }




        if (OperatorValue.equals("+")) {
            result = Double.parseDouble(FirstSValue) + Double.parseDouble(SecondValue);

        } else if (OperatorValue.equals("-")) {
           result = Double.parseDouble(FirstSValue) - Double.parseDouble(SecondValue);

        } else if (OperatorValue.equals("*")) {
            result = Double.parseDouble(FirstSValue) * Double.parseDouble(SecondValue);

        } else if (OperatorValue.equals("/")) {
            result = Double.parseDouble(FirstSValue) / Double.parseDouble(SecondValue);

        } System.out.println("결과값은?" );
            System.out.println(result);








//                    Integer.parseInt(FirstSValue.nextLine());



//                 String.valueOf(FirstSValue)+String.valueOf(SecondValue);}

//        }



    }






//            System.out.println( FirstSValue);
//            System.out.println( OperatorValue);
//            System.out.println( SecondValue);

        }





//        System.out.println( OperatorValue);

//        System.out.println( FirstSValue + SecondValue);



