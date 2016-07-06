import java.io.*;

class BufferedInputStreamExample{
	public static void main(String[] args) throws IOException{
	/*	BufferedInputStream br = new BufferedInputStream(System.in);
		System.out.println(br.read().toString());*/
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		BufferedInputStream buff = new BufferedInputStream(System.in);
		System.out.println(readLine(buff));
		System.out.println(readLine(buff));
		System.out.println(readLine(buff));
		System.out.println(readLine(buff));
		buff.close();

		/*For file input 
		InputStream inStream = null;
      BufferedInputStream bis = null;
      
      try{
         // open input stream test.txt for reading purpose.
         inStream = new FileInputStream("c:/test.txt");

         // input stream is converted to buffered input stream
         bis = new BufferedInputStream(inStream);			

         // read until a single byte is available
         while(bis.available()>0)
         {
            // read the byte and convert the integer to character
            char c = (char)bis.read();

            // print the characters
            System.out.println("Char: "+c);;
         }
      }catch(Exception e){
         // if any I/O error occurs
         e.printStackTrace();
      }finally{		
         // releases any system resources associated with the stream
         if(inStream!=null)
            inStream.close();
         if(bis!=null)
            bis.close();
      }*/






		long stopTime = System.currentTimeMillis();
    	long elapsedTime = stopTime - startTime;
    	System.out.println(stopTime);
        System.out.println(elapsedTime);
	}


	public static String readLine(BufferedInputStream buff) {
	    StringBuffer response = new StringBuffer();
	    try {
	//      BufferedInputStream buff = new BufferedInputStream(System.in);
	      int in = 0;
	      char inChar;
	      do {
	        in = buff.read();
	        inChar = (char) in;
	        if ((in != -1) & (in != '\n') & (in != '\r')) {
	          response.append(inChar);
	        }
	      } 
	      while ((in != -1) & (inChar != '\n') & (in != '\r'));
	//      buff.close();
	      return response.toString();
	    } 
	    catch (IOException e) {
	      System.out.println("Exception: " + e.getMessage());
	      return null;
    	}
    }



    public static int readInt(BufferedInputStream in) {
        int no = 0;
        boolean minus = false;
        try {
            int a = in.read();
            while (a == 32 || a == 10) //10 is newline & 32 is ASCII for space
                a = in.read();
            if (a == '-') {
                minus = true;
                a = in.read();
            }
            while (a != 10 && a != 32 && a != -1) {
                no = no * 10 + (a - '0');
                a = in.read();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return minus ? -no: no;
    }

}
