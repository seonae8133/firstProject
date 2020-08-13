package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] {3,6,9,2,4};
		
		int[] cpyAry = new int[5];// 5칸인 빈 배열 만들었고
		
//		for(int i=0; i<origAry.length; i++) {
//			cpyAry[i] = origAry[i];
//		}
		System.arraycopy(origAry, 1, cpyAry, 1, 4); //(원본배열의,몇번째배열부터,빈배열의,
//		원본배열 n번째 안의 값부터,n까지 복사) , 근데 빈공간을 5개로 만들어줘서
//		앞에 배열두고 뒤에 배열만 가지고오면 앞에 남은 배열은 초기값인 0으로 들어감
		for(int i=0; i<origAry.length; i++) {
		System.out.println(cpyAry[i]);
		}
		
		// 확장 for()
		for(int num : cpyAry) { //
			System.out.println(num);
		}
	}
}
