public class test_gc {
    public static void main(String[] args) {

		try
		{
		Thread.sleep(20000);	// 20秒待機
		}
		catch (InterruptedException e)
		{}

		System.out.printf("Start\n");
        long start = System.currentTimeMillis();  // 開始時刻を取得
        String s = "abc";
        for(int i=0; i<1000; i++) {
            for(int j=0; j<250; j++) {
                s += "a";  //文字列の結合
            }
        }
        long finish = System.currentTimeMillis(); // 終了時刻の取得
        System.out.printf("実行時間：%f秒\n",(finish-start)/1000.0);  //処理にかかった時間の表示
    }
}
