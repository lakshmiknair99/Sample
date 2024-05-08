package Abstraction;

public class VideoCalls implements Phone {
	public void calls()
	{
		System.out.println("Video call....");
	}
	public void mute()
	{
		System.out.println("Video call is muted");
	}
	public void disconnect()
	{
		System.out.println("Video call is disconnected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone obj=new VideoCalls();
		obj.calls(); 
		obj.mute();
		obj.disconnect();

	}

}
