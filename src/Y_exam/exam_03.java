package Y_exam;

public class exam_03 {
	public static void main(String[] args){ 
//	[3-1] 다음 연산의 결과를 적으시오.
//	[연습문제]/ch3/Exercise3_1.java

	int x = 2;
	int y = 5;
	char c = 'A'; // 'A'의 문자코드는 65
	System.out.println(1 + x << 33); // int는 4byte -> 32bit 
	                                // 3<<33 , 한바퀴돌고 한칸더가기!
	                                // 3*2^32*2^1 = 6 -> 2^32는 1바퀴로 overflow된다. 
	System.out.println(y >= 5 || x < 0 && x > 2); // &&앤드연산자 먼저 수행, 그다음 ||오아연산자 수행
	                                              // 앤드연산자 결과는 0<0 and 2>2 라서 false 
	                                              // 오아연산자 결과는 5>=5 true or false 니까 하나라도 true라면 true
	System.out.println(y += 10 - x++); // y = y +10 - x++
	                                   // y = 5+ 10 - 2 = 13 그후 x값은 3이다.
	System.out.println(x+=2);// 앞에서 x++는 그다음 x의 값에 1을증가시킨다.
	                         //x = x+2 
	                         // x = 3+2 =5
	System.out.println( !('A' <= c && c <='Z') ); // 산술 > 비교 > 논리 > 대입
	                                              // 65 <= 65 and 65<=90 -> true
	                                              // ! : not연산자 -> false
	System.out.println('C'-c); // 67-65 = 2 
	                           // 연산할때 규칙타입 4byte미만은 int형으로 바꾸어준다.
	System.out.println('5'-'0');// char5 - char0 = int5 - int0 = 5
	                           //x+5 -x = 5 -> x를 0으로 설정해준다. 
	System.out.println(c+1);// char 65 + int 1 = int 66
	System.out.println(++c);// ++c는 먼저 1을 증가해준다. 66 = B
	System.out.println(c++);// c++은 다음의 값에 1을 증가해준다. 66 = B
	System.out.println(c);// 앞의 c를 이번에 1증가 시켜준다. 67 = C
	
	
//	[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
//	사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
//	가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
//	[연습문제]/ch3/Exercise3_2.java
//	class Exercise3_2 {
//	public static void main(String[] args) {
	
	
	int numOfApples = 123; // 사과의 개수
	int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	//int numOfBucket = (numOfApples%sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1); // 모든 사과를 담는데 필요한 바구니의 수
	int numOfBucket = numOfApples/sizeOfBucket+(numOfApples % sizeOfBucket == 0 ? 0 : 1);
	
	System.out.println("필요한 바구니의 수 :"+numOfBucket);
	
	// 사과의개수 / 바구니의 크기의 나머지가 0이라면 사과의 개수 나누기 바구니의 크기의 결과값이 필요한 바구니의 수일것이다.
	// 하지만 나머지가 0으로 나누어 떨어지지 않는다면 나누어진값에 +1을 한다.

//	[실행결과]
//	13
//	
	
	/*
	 [3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
자를 이용해서 (1)에 알맞은 코드를 넣으시오.
[Hint] 삼항 연산자를 두 번 사용하라.
[연습문제]/ch3/Exercise3_3.java
class Exercise3_3 {
public static void main(String[] args) {*/
	
	int num = 10;
	System.out.println( num>0 ? "양수" : num==0? "0" : "음수" );

// 삼항연산자를 이용 
// num의값이 0보다 크다면 양수값이 나오고 num의값이 0일경우 0 그렇지 않을경우 음수가 나오게한다.


//[실행결과]
//양수
	
//[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
//의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
//시오.
//[연습문제]/ch3/Exercise3_4.java
//class Exercise3_4 {
//public static void main(String[] args) {
	int num1 = 456;
	System.out.println(num1/100*100);

	//456/100= 4.56 => int형변환시 4만남는다. => 4*100을 해주면 400
	/*
	 * (int)(num1/100)*100
	 * (int)num1/100*100 도 가능
	 * num1/100*100 도가능
	 * 정수형 / 정수형 = 정수형이되서 4밑에 나머지를 버린다 *100
	 * num1 - (num1%100) = 400
	 */
	/* 
	 
	 */
	

//	
//[실행결과]
//400
	
//	[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//	값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
//	[연습문제]/ch3/Exercise3_5.java
//	class Exercise3_5 {
//	public static void main(String[] args) {
	
	int num2 = 333;
	System.out.println(num2/10*10+1 );
	
	// 333 /10 = 33.3인데 int/int는 소수점 자리수가 사라진다
	// 따라서 33*10+1을 해주면 331이 나온다.
	/*
	 num2/10*10+1만 해주어도 된다
	 num2/10 은 int형 더하기 int라서 소수자리수를 사라지게 하기때문에 int를 안써줘도 알아서 정수형변수가 된다.
	 */
	
//	[실행결과]
//	331
	
//	[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//	뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//	다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//	수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
//	[Hint] 나머지 연산자를 사용하라.
//	[연습문제]/ch3/Exercise3_6.java
//	class Exercise3_6 {
//	public static void main(String[] args) {
	
//	int num3 = 24;
//	System.out.println(num3/10+num3%10);
	
	//24/10 => 2가나온다.
	//24%10 => 4가나온다.
	//2+4는 6
	//하지만 이방법은 나머지가없다면 틀리게된다
	
	int num4 = 24;
	System.out.println(10-num4%10); 
	
	//24%10 = 4  
	//10-4= 6 -> 나보다 큰 10의배수이기 때문에 10의값에서 나머지를 빼주면 된다.
	
	
	//(num4/10+1)*10-num
	
	
	
//	[실행결과]
//			6
//	
//	[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//	5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//	셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
//	[연습문제]/ch3/Exercise3_7.java
//	class Exercise3_7 {
//	public static void main(String[] args) {
//	
	int fahrenheit = 100;
	float celcius = ((int)(5f/9*(fahrenheit-32)*100+0.5f)/100f);
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
	
//	[실행결과]
//			Fahrenheit:100
//			Celcius:37.78

//	[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
//	[연습문제]/ch3/Exercise3_8.java
//	class Exercise3_8 {
//	public static void main(String[] args) {
	byte a = 10;
	byte b = 20;
	byte c1 = (byte)(a + b); // byte + byte => int + int => int에 넣어줘야하는데 c의 변수타입은 byte이다. 그래서 byte로 형변환한다.
	char ch2 = 'A';
	ch2 = (char)(ch2 + 2); // char + char => int + int로 변환 => char타입에 넣어줘야하기 때문에 char타입으로 형변환 해줘야한다.
	float f = 3 / 2f; // float은 뒤에 f을 써줘야 한다.
	                  // float f = (float) 3 / 2 ;
	long l = 3000 * 3000 * 3000l; // long은 뒤에 long을 써줘야한다. int * int = int * int = int -> int는 23억 얼마... 결과값이 넘어주기때문에 l을 써줘야한다.
	                              //long 1 = (long) 3000 * 3000 * 3000; -> 앞숫자가 int값을 넘어설수도 있기 때문에 앞에 (long)형번환 붙여줘도 된다.
	float f2 = 0.1f;
	double d = 0.1; // double d = 0.1f;
	boolean result = d!=f2; // float 소수점이 나오는데 딱떨어지고 double타입은 근사값이나와서 다르다.
	                        // !(d = f2)
	System.out.println("c1="+c1);
	System.out.println("ch2="+ch2);
	System.out.println("f="+f);
	System.out.println("l="+l);
	System.out.println("result="+result);// "result=" !+result

//	[실행결과]
//			c=30
//			ch=C
//			f=1.5
//			l=27,000,000,000
//			result=true
	
	
//	[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//	의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
//	[연습문제]/ch3/Exercise3_9.java
//	class Exercise3_9 {
//	public static void main(String[] args) {
	char ch = 'z';
	boolean b1 = ('A'<=ch&& ch<='Z'||'a'<=ch&& ch<='z');
	//대문자 'A'부터 'Z'까지 또는 소문자 'a'부터 'z'까지라면 트루를 실행해준다.
	System.out.println(b1);
	
//	[실행결과]
//			true
	
	
//	[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//	인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
//	들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
//	[연습문제]/ch3/Exercise3_10.java
//	class Exercise3_10 {
//	public static void main(String[] args) {
	char ch3 = 'A';
	char lowerCase = ('A'<=ch3 && ch3<='Z' ) ? ((char)(ch3+32)) : ch3;
	// ch3이 대문자라면 ch3을 소문자로 변환해주어야한다. char + char => int +int로 변하기때문에 char로 형변환 해주어야한다.
	// 대문자A를 소문자a 숫자까지 가려면 +32만큼 해주어야한다. 
	System.out.println("ch3:"+ch3);
	System.out.println("ch to lowerCase:"+lowerCase);
	

//	[실행결과]
//			ch:A
//			ch to lowerCase:a
	
	
	
   }

}
	

	

