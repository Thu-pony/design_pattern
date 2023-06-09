package SignleInstance;

public class SignleObject {
	//在类的内部创建对象
	private static SignleObject instance = new SignleObject();
	
	//私有化构造函数，类无法被实例化
	private SignleObject() {}
	
	//获取唯一可用对象 懒汉模式线程安全
	public static synchronized SignleObject getInstance() {
		if (instance == null)
			return new SignleObject();
		return instance;
	}
	
	public void message() {
		System.out.println("Hello World!!!");
	}

}
