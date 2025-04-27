// Java Program to convert string to byte 

class convert_str {

    public static byte convertStringToByte(String str) {
        return Byte.parseByte(str);
    } 
    public static void main(String[] args) {

        String stringValue = "1"; 

        byte byteValue;
        byteValue = convertStringToByte(stringValue); 

        System.out.println(
                stringValue
                + " after converting into byte = "
                + byteValue);
    }
}
 
