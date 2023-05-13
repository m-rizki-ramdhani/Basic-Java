public class JavaVariable {

    /*
        Static Variable: Sebuah variabel yang dinyatakan sebagai statis disebut static variable.
        Dapat membuat satu salinan variabel statis dan membagikannya di antara semua instance class.
     */
    static int staticVar = 100;

    void method()
    {
        /*
            Local Variable: Variabel yang dideklarasikan di dalam suatu method.
            Dapat digunakan hanya di dalam method itu sendiri
         */
        int localVar = 90;
    }

    public static void main(String[] args) {

        /*
            Instance variable: Variabel yang dideklarasikan di dalam class
            tetapi di luar method disebut variabel instan.
            tidak dinyatakan sebagai static variable.
         */
        int instanceVar = 20;

    }
}
