package chapter1;

public class Test1_1_02 {

	public static void main(String[] args) {
		Object oa=(1+2.236)/2;
		System.out.println("oa的类型为"+oa.getClass().getName()+" 值为"+oa);
		Object ob=(1+2+3+4.0);
		System.out.println("ob的类型为"+ob.getClass().getName()+" 值为"+ob);
		Object oc=(4.1>=4);
		System.out.println("oc的类型为"+oc.getClass().getName()+" 值为"+oc);
		Object od=(1+2+"3");
		System.out.println("od的类型为"+od.getClass().getName()+" 值为"+od);

	}

}
