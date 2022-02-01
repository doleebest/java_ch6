class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath(); // 객체 생성
		
		long result = mm.max(5,3);
		long result1 = mm.add(5L, 3L); // 객체 사용 (메서드 호출)
//		long result1 = mm.add(5, 3); // 같은 말임
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(6);
		
		System.out.println(result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath { // 메서드 작성(클래스 작성) 클래스 영역에만 정의 가능
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return; // 입력받은 단이 2단이 아니면 메서드 종료하고 돌아가기
		for (int i=1; i<9; i++)
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
	}
	 
	 
	 long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	//두 값을 받아서 둘중에 큰값을 변환하는 메서드를 작성하시오.
	long max(long a, long b)
	{
		if(a>b)
			return a; //조건식이 참일 때 실행
		else {
			return b; // 조건식이 거짓일 때 실행
		// return a>b ? a : b
		}
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
