/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int read = 0;
        boolean eof = false;
        char[] buffer = new char[4];
        while(eof == false && read < n){
            int curr = read4(buffer);
            if(curr < 4) eof = true;
            int bytes = Math.min(curr, n - read);
            System.arraycopy(buffer, 0, buf, read, bytes);
            read += bytes;
        }
        return read;
    }
}