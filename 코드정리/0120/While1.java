
public class While1 {

	public static void main(String[] args) {

		int a = 2;//�ʱ��
		while(a < 10) {//���ǽ�
			int b = 1;
			while(b < 10) {
				System.out.println(a + "*" + b + "=" + (a * b));
				b++;
			}
			a++;//�����
		}

	}

}
