/*
    Ada dua jenis tipe data di Java:
    1. Tipe data primitif : boolean, char, int, dll
    2. Tipe data non primitif : Array, Class, Interface
 */

public class JavaDataTypes {
    public static void main(String[] args) {

        //boolean
        boolean status = true; //nilai default : false

        /*
            number:
            byte, short, int, long, float, double
        */
        int intNum = 100;
        byte byteNum = (byte)intNum; //dikonversi
        float floatNum = byteNum;
        floatNum = 100.10F;

        /*
            tipe data karakter hanya ada char, sedangkan String merupakan tipedata non primitif
        */
        char charValue = 'a';
        String name = "Rizki"; //tipe data non primitif



    }
}
