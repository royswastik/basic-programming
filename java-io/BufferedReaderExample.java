import java.io.*;

class BufferedReaderExample{
	public static void main(String[] args) throws IOException{
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		long stopTime = System.currentTimeMillis();
    	long elapsedTime = stopTime - startTime;
    	System.out.println(stopTime);
        System.out.println(elapsedTime);
	}
}
