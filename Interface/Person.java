package Interface;
// one interface can extend multiple interfaces
// one class can exetend only once class: no multiple inheritance
//one class can implement multiple interfaces // functionality of multiuple inheritance

public class Person  implements Student, YouTuber  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		
		obj.makeVideo();
		obj.study();
		
//		YouTuber obj2 = new YouTuber();cannot instantiate interface.cannot make obj of inteface
		YouTuber obj2 = obj;  // but upcasting can be done. and obj2  will support all the behaviour of Youtuber.
		obj2.editVideo();
		obj2.makeVideo();
	}


	

	
	
	


	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is studying.");
	}





	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is making youtube video");
		
	}





	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		System.out.println("youtuber is editing");
	}









	@Override
	public void uploadVideo() {
		// TODO Auto-generated method stub
		Student.super.uploadVideo();
	}








	
}
