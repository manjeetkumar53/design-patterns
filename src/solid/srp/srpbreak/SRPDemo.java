package solid.srp.srpbreak;

import solid.srp.srpexample.Journal;

public class SRPDemo {
	public static void main(String[] args) throws Exception {
		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I ate a bug");
		System.out.println(j);
	}
}
