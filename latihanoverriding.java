import java.util.Scanner;
public class latihanoverriding {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Menentukan Hari ");
        System.out.println();

        int n;

        System.out.println(" Input Angka Hari (1-7): ");
        n = input.nextInt();

        String[] hari = {
            "Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"
        };

        if ((n<1)|| (n>7)){
            System.out.println(" Pilihan Anda Tidak Tersedia ");
        }
        else {
            System.out.println(hari[n-1]);
        }
    }
}
