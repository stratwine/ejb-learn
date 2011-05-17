package foo;

import javax.ejb.Local;
import javax.ejb.Stateless;


@Stateless
public class BarImpl implements BarLocal {

	@Override
	public void sayHello() {

		System.out.println("Hello there !!");
	}

}
