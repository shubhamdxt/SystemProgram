package programs;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrivateVarAcess d = new PrivateVarAcess();
    	
	      Method m = PrivateVarAcess.class.getDeclaredMethod("m1");
	        //m.invoke(d);// throws java.lang.IllegalAccessException
	        m.setAccessible(true);// Abracadabra 
	        m.invoke(d);// now its OK
	        

		      Method ma = PrivateVarAcess.class.getDeclaredMethod("m2");
		        //m.invoke(d);// throws java.lang.IllegalAccessException
		        ma.setAccessible(true);// Abracadabra 
		        ma.invoke(d);// now its OK
	        

	}

}
