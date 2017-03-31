package others;

public class SingletonExample {

	static SingletonExample se;
	
	private SingletonExample(){}
	
	public SingletonExample getInstance(){
		if(se == null){
			se = new SingletonExample();
			return se;
		}
		return se;
	}
}
