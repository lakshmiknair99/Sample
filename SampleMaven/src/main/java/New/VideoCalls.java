package New;

public class VideoCalls implements Phone {
	public void calls()
	{
		System.out.println("Video Call....");
	}
	public void mute()
	{
		System.out.println("Video call is muted...");
	}
	public void disconnect()
	{
		System.out.println("Video call is disconnected..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioCalls obj1=new AudioCalls();
		VideoCalls obj2=new VideoCalls();
		obj1.calls();
		obj2.disconnect();

	}

}
