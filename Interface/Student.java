package Interface;

public abstract interface Student {
	abstract void study();

	default void uploadVideo()
	{
		System.out.println("safasfsf");
	}

}
