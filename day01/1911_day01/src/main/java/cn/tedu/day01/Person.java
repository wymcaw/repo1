package cn.tedu.day01;

public class Person {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��Դ�ͷŹ���");
	}

}
