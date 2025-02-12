public class test_gc {
    public static void main(String[] args) {

		try
		{
		Thread.sleep(20000);	// 20秒待機
		}
		catch (InterruptedException e)
		{}

		System.out.printf("Start\n");

        String s = "abc";
        for(int i=0; i<1000; i++) {
            for(int j=0; j<250; j++) {
                s += "a";  //文字列の結合
            }
        }
        System.out.printf("Finish\n"); 
    }
}
