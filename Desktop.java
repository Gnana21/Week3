package org.system;

public class Desktop extends Computer{

	
	public void desktopSize() {
		
		System.out.println("desktopSize");
		
	}
	
	public static void main(String[] args) {
	
		Computer comobj = new Computer();
		comobj.computerModle();
		
		Desktop desobj = new Desktop();
		desobj.computerModle();
		desobj.desktopSize();
		
	}

}
