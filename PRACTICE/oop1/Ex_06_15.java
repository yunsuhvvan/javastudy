package oop1;

public class Ex_06_15 {

}


//
//[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
//a.  기본값 -명시적초기화- 초기화블럭- 생성자
//b.  기본값- 명시적초기화- 생성자- 초기화블럭
//c.  기본값- 초기화블럭- 명시적초기화- 생성자
//d.  기본값- 초기화블럭- 생성자- 명시적초기화


// 답안 : a
//
//	클래스변수의 초기화시점   :  클래스가 처음 로딩될 때 단 한번 초기화 된다
//	인스턴스변수의 초기화시점 :  인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다
//	클래스변수의 초기화순서   :  기본값 -명시적초기화 -클래스 초기화 블럭
//	인스턴스변수의 초기화순서 :  기본값- 명시적초기화- 인스턴스 초기화 블럭 - 생성자
//
