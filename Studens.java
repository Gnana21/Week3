package assignments.selenium.week3.day1;

public class Studens {

 public void getStidentInfo(int id) {

   System.out.println(id);
 }
 
 public void getStidentInfo(int id, String name) {
	   System.out.println(id+ "&" + name);
 }
 
 public void getStidentInfo(String email, long phoneNumber) {
	   System.out.println(email+ "&" + phoneNumber);
 }

 public static void main(String[] args) {
	 Studens obj = new Studens();
	 
	 obj.getStidentInfo(563383);
	 obj.getStidentInfo(563383, "Gnana Prasuna");
	 obj.getStidentInfo("Textmail@tesing.com", 994993455);

}
 }

