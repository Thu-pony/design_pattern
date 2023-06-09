package SignleInstance;

public class SignleObject {
	//������ڲ���������
	private static SignleObject instance = new SignleObject();
	
	//˽�л����캯�������޷���ʵ����
	private SignleObject() {}
	
	//��ȡΨһ���ö��� ����ģʽ�̰߳�ȫ
	public static synchronized SignleObject getInstance() {
		if (instance == null)
			return new SignleObject();
		return instance;
	}
	
	public void message() {
		System.out.println("Hello World!!!");
	}

}
