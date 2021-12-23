package com.kh.spring.tv;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * context에 등록할 빈을 작성하는 방법
 * 1. xml
 * 2. java anotation
 * 3. java anotation + xml
 *
 */
public class TvMain {

	public static void main(String[] args) {
		// 1. ApplicationContext 생성 (빈을 관리)
		String configLocation = "/application-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println("========================= spring container 초기화 완료 =========================");
		
		Tv lgTv1 = context.getBean(LgTv.class);
		lgTv1.powerOn();
		lgTv1.changeChannel(8);
		
		Tv lgTv2 = (Tv) context.getBean("lgTv");
		lgTv2.powerOn();
		lgTv2.changeChannel(20);
		
		System.out.println(lgTv1);
		System.out.println(lgTv2);
		System.out.println(lgTv1 == lgTv2);
		
		System.out.println("엔터 입력시 삼성Tv객체를 사용합니다..");
		new Scanner(System.in).nextLine();
		Tv samsungTv = context.getBean("samsungTv", SamsungTv.class);
		samsungTv.powerOn();
		samsungTv.changeChannel(18);
	}

}
