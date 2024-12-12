package OOPSconcepts;
interface TvRemote
{
	public void poweron();
	public void poweroff();
}

interface smartTvRemote extends TvRemote
{
	public void smartTv();
	public void channels();
}
/*
	public class TV implements smartTvRemote
	{
		@Override
		public void smartTv()
		{
			System.out.println("Power on tv");
		}
		@Override
		public void power()
		{
			System.out.println("Power on tv");
		}
		@Override
	/*	public void volume()
		{
			System.out.println("Volume up and down");
		}
		@Override
		public void channels()
		{
			System.out.println("Netflix");
		}
	}
}
public class Tvremote {
	public static void main(String[] args) {
	}

}
*/