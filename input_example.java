package tugas.pkg2.hasil.output;

import java.util.Scanner;

public class input_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Membuat Objek dari Class Scanner
        String nama; //Variabel String, Untuk Menyimpan Input dari User
        System.out.print("anda sedang belajar apa ? ");
        nama = input.nextLine(); //Mendapatkan Input dari User
        System.out.println("pemrograman web "); //Mencetak Output
    }
}