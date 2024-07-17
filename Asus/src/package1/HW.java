package package1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class HW {

	public static void main(String[] args) {
		System.out.println("Great to see you");
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(678);
        al.add(78);
        al.add(68);
        
       Long n = al.stream().count();
       Stream <Integer> st = al.stream().distinct();
     

      }

}
