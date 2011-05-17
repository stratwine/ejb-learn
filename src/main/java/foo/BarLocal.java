package foo;

import javax.ejb.Remote;

@Remote
public interface BarLocal {

	public void sayHello();
}
