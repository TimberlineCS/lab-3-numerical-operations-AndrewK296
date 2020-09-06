public class numberical operations{
public static void main(String args[])
{
  //challenge 1
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;


double a = 57.2 * (i1 / i2) + 1; //I guess 1
double b = 57.2 * ((double)i1 / i2) + 1; //I guess 39.1333
double c = 15 - i1 * (d1 * 3) + 4; //I guess -1345.9
double d = 15 - i1 * ((int)d1 * 3) + 4; //I guess -1349

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);


//challenge 2

int one = 1234;
System.out.println(one);
int one1 = one%10;
int one2 = one%100-one%10;
int one3 = one%1000-one%100;
int one4 = one%10000-one%1000;

int one1*= 1000;
int one2*= 10;
int one3/= 10;
int one4/= 1000;

int one = one1 + one2 + one3 + one4;
System.out.println(one);

}
}