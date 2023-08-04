package com.ohgiraffers.section02.variable;

public class Application2 {

	public static void main(String[] args) {
		
		/* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. */
		/* 필기.
		 *  변수를 사용하는 방법
		 *   1. 변수를 준비한다.(선언)
		 *   2. 변수에 값을 대입한다.(값 대입 및 초기화)
		 *   3. 변수를 사용한다.
		 * */
		
		/* 목차. 1. 변수를 준비한다. (선언) */
		/* 목차. 1-1. 변수를 선언하는 방법 */
		/* 필기. 자료형 변수명; */
		
		/* 필기.
		 *  자료형이란?
		 *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
		 *  예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
		 *     이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
		 *  그 중 기본자료형 8가지 부터 살펴보기로 한다.
		 *  */
		
		/* 목차. 1-1-1. 숫자를 취급하는 자료형 */
		/* 필기. 정수를 취급하는 자료형은 4가지가 있다. */
		byte bnum;			//1byte
		short snum;			//2byte
		int inum;			//4byte
		long lnum;			//8byte
		
		/* 필기. 실수를 취급하는 자료형은 2가지가 있다. */
		float fnum;			//4byte
		double dnum;		//8byte
		
		/* 목차. 1-1-2. 문자를 취급하는 자료형 */
		/* 필기. 문자를 취급하는 자료형은 한 가지가 있다. */
		char ch;			//2byte
		char ch2;
		
		/* 목차. 1-1-3. 논리값을 취급하는 자료형 */
		boolean isTrue;		//1byte
		
		/* 필기. 이상 8가지를 기본자료형(Primary type)이라고 한다. */
		
		/* 설명.
		 *  앞에서 다뤄 본 값의 형태 중 문자열이 빠져있다.
		 *  문자열은 조금 다른 방식으로 취급하게 되는데 이 부분은 나중에 깊게 다루게 될 것이다.
		 * */
		
		/* 목차. 1-1-4. 문자열을 취급하는 자료형 */
		String str;			//4byte (엄밀히 이야기 하면 주소값은 4byte 정수형이다.)
		
		/* 설명. 위에서 사용한 자료형들은 어떤 형태의 값을 몇 byte를 하나의 값으로 취급하겠다는 Compiler와의 약속이다. */
		
		/* 목차. 2. 변수에 값을 대입한다.(값 대입 및 초기화) */
		/* 설명.
		 *  위에서 한 변수 선언은 메모리에 값을 저장하기 위해 공간만 생성해 둔 상태이다.
		 *  그 공간에 대입연산자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
		 *  만약, 약속 내용과 다른 형태의 값을 대입하려고 하면 Compiler는 에러를 발생시킨다.
		 *
		 * 설명.
		 *  대입 연산자의 실행 방향은 오른쪽에서 왼쪽이다.
		 *  즉, 오른쪽에 있는 값을 왼쪽의 공간에 대입한다는 의미이며, 왼쪽에는 항상 공간, 오른쪽에는 항상 값이 온다.
		 *  변수를 대입연산자 왼쪽에 사용하면 공간의 의미이고, 대입연산자 오른쪽에 사용하면 변수가 가진 값을 의미한다.
		 * */

		/* 목차. 2-1. 정수를 취급하는 자료형에 값 대입 */
		bnum = 1;
		snum = 2;
		inum = 4;
		//lnum = 8;			//아무 문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야 한다. 그 이유는 뒤에 형변환에서 다루게 될 것이다.
		lnum = 8L;			//소문자로 'l'을 써도 되지만 글꼴에 따라 숫자 1과 혼선이 빚어질 수 있어서 대문자로 하는 것이 권장이다.
		
		/* 목차. 2-2. 실수를 취급하는 자료형에 값 대입 */
		//fnum = 4.0;		//실수 형태의 값을 fnum에 사용하는 것은 불가능하다.
		fnum = 4.0f;		//실수 뒤에 'f'를 붙여야 한다. 대문다 'F'도 가능하지만 소문자를 사용하는 것이 일반적이다.
		dnum = 8.0;
		
		/* 목차. 2-3. 문자를 취급하는 자료형에 값 대입 */
		ch = 'a';			//문자 형태의 값을 저장할 수 있다.
		ch2 = 97;			//'a'는 97이라는 숫자였지? 그래서 숫자로도 저장할 수 있다.
		
		/* 목차. 2-4. 논리를 취급하는 자료형에 값 대입 */
		isTrue = true;
		isTrue = false;		//true 혹은 false 중 한 가지의 값만 사용 가능하다.
		
		/* 목차. 2-5. 문자열을 취급하는 자료형에 값 대입 */
		str = "안녕하세요";
		
		/* 필기.
		 *  숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double이다.
		 *  일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
		 *  정수형은 int, 실수형은 double이 대표 자료형이다.
		 *
		 * 설명.
		 *  정수의 경우는 일상 생활에서 많이 사용되는 숫자의 범위는 byte와 short으로 표현이 불가능한 경우가 많다.
		 *  따라서 int를 대표자료형으로 여기며, 특수한 경우가 아닌 이상 byte와 short은 잘 사용하지 않는다.
		 *  실수의 경우는 정확도를 기준으로 4byte 자료형보다 8byte 자료형이 더 정확한 실수를 표현할 수 있기 때문에 double을 대표자료형으로 사용하고
		 *  float는 특수한 목적이 있는 경우에만 사용하게 된다.
		 *  예) 원주율 3.14 보다 3.141592.. 가 더 정확한 실수 이겠지??
		 * */
		
		/* 설명.
		 *  위처럼 변수를 선언하고 난 뒤 최초로 값이 대입되는 것을 초기화 라고 한다.
		 *  위에서는 변수 선언과 값 대입을 따로 했지만 동시에 수행할 수 도 있다.
		 *  명칭이 중요하지는 않지만 이 것을 '선언과 동시에 초기화' 라고 한다.
		 * */
		int point = 100;
		int bonus = 10;
		
		/* 목차. 3. 변수를 사용한다. */
		/* 목차. 3-1. 변수에 저장한 값 출력하기 */
		/* 설명. 위에서 선언 후 초기화 한 변수들을 출력해보자 */
		System.out.println("========== 변수에 저장된 값 출력 ===========");
		System.out.println("bnum의 값 : " + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println("fnum의 값 : " + fnum);
		System.out.println("dnum의 값 : " + dnum);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("ch2의 값 : " + ch2);
		
		System.out.println("isTrue의 값 : " + isTrue);
		
		System.out.println("str의 값 : " + str);
		
		/* 목차. 3-2. 변수를 이용해서 연산하기 */
		/* 필기. 변수에 저장된 값을 이용해서 연산을 할 수도 있다. */
		System.out.println("포인트와 보너스의 합은? : " + (point + bonus));
		
		/* 목차. 3-3. 대입연산자의 왼쪽과 오른쪽 편에 사용하기 */
		/* 필기.
		 *  대입연산자의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미이다.
		 *  따라서 point라는 공간에 point가 가지고 있는 값에 + 100한 값을 대입하라는 의미이다.
		 * */
		point = point + 100;
		
		System.out.println("point = point + 100 ? " + point);
	}
}
