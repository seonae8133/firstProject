package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {//void는 반환되는 값이 없다
		
		
//		int[] numAry = {2,3,4,5,3,5};
//		int result =addAry(numAry);
		int result = addAry(new int[] {2,3,4});
		System.out.println("배열의 합 : " + result);
		add(33);
		
	}

	public static int add(int a) {

		return a * 3;
	}
	public static int addAry(int[] ary){//void 없이 함수 정의되면 함수 안에서 반환값 나오게 만들어줘야됨
		int sum = 0;
		for(int i = 0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
