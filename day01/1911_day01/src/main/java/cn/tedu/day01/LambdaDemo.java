package cn.tedu.day01;

public class LambdaDemo {
	public static void main(String[] args) {
//		Foo foo = new Foo() {
//			@Override
//			public void demo() {
//				System.out.println("demo������������");
//			}
//		};
//
//		foo.demo();

		// ʹ��lambda���ʽʵ��Foo�ӿ�
		Foo foo1 = ()->System.out.println("lambda���ʽ����01");
		foo1.demo();
	}

}
