public class Operation {
    public static void main(String[] args) {

        int result = (5 + 3) * 2; //16

        int x = 5;
        int y = ++x;

        System.out.println("y = "+ y);//7

        boolean flag = false;
        boolean notFlag = !flag; // flag가 false일때, notFlag는 true가 된다

        System.out.println("notFlag = "+ notFlag);//true
        boolean flag2 = !notFlag;
        System.out.println("flag2 = "+ flag2);//false

        int a =10;
        int b =3;
        int product = a*b;
        int quotient = a / b;
        int remainder = a % b;

        int bit1 = 4 << 2;//왼쪽으로 2비트 이동 결과: 16
        int bit2 = 16 >> 2;//오른쪽으로 2비트 이동 결과: 4

        System.out.println("bit1 = "+ bit1);
        System.out.println("bit2 = "+ bit2);

        boolean isLess = (5< 10);
        boolean isGreaterOREqual = (10>= 10);

        boolean isEqual = (5 == 5);
        boolean isNotEqual = (5 != 3);

        boolean andAnd = (true && false);
        boolean or = (true || false);

        int variable = (a > b) ? a- b : b - a;
        int xx = 5;
        xx += 3;
        xx *= 2;
        xx <<= 1;




    }
}
