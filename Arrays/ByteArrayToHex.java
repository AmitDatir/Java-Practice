//Byte Array to Hex:
public class ByteHex1 {
    public static void main(String args[]) {
        byte[] bytes = {2, 10, 1, 15, 9, 11};
        for(byte b : bytes){
            String st = String.format("%02X", b);
            System.out.print(st);
        }
    }
}



//Output: 020A010F090B



//using byte operations:
public class ByteHex {
    
    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
    
    public static void main(String args[]) {
        byte[] bytes = {2, 10, 1, 15, 9, 11};
        String st = bytesToHex(bytes);
        System.out.print(st);
    }
}
