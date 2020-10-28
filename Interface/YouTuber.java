package Interface;

public abstract interface YouTuber extends VideoEditor {
	int x=6;
	abstract void makeVideo();
	
//till version 8 u were nt allowed to ceate a functio with body but u can
// add default
	
	default void uploadVideo()
	{
		System.out.println("uploaded");
	}
// what next? suppose u have this void uploadVideo in both here and Student inerface
//	so upon implements in person, when i call this method , ambiiguity may arise
//	so u have to overide this mentod in person. else error wil come up
//	go to person an override it
}
