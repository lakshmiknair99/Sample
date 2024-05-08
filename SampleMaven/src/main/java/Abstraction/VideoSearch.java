package Abstraction;

public class VideoSearch extends Google {
	void search()
	{
		System.out.println("Search for a video");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageSearch obj1=new ImageSearch();
		VideoSearch obj2=new VideoSearch();
		obj1.search();
		obj2.search();

	}

}
