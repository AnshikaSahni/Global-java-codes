/*Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.
*/

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class E
{
	int id;
	String name;
	E(int id,String name) {
		this.id=id;
		this.name=name;
		 
	}
	
}
public class Hd27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<E> vec= new Vector<>();
        vec.add(new E(1,"anshika"));
        vec.add(new E(2,"jitin"));
        vec.add(new E(3,"pranjali"));
        /*Iterator <E>itr2=vec.iterator();

        while(itr2.hasNext())
        {

          E e=itr2.next();

        System.out.println(e.id+" "+e.name);

        }
      */
        Enumeration<E> e = vec.elements();

        while(e.hasMoreElements()) {
          E e1= e.nextElement();

          System.out.println(e1.id+" "+e1.name);

        }


	}

}
