import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public final static void cls(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void confirm() throws IOException{
        System.out.println("\n");
        System.out.print("Enter untuk melanjutkan.");
        br.readLine();
    }
    public static void main(String[] args) throws Exception {
        boolean end = true;
        while(end){
            System.out.println("Tugas Akhir");
            System.out.println("Reihan Al Sya'Ban - 2109106051");
            System.out.println("1. Soal 1");
            System.out.println("2. Soal 2");
            System.out.println("0. Keluar");
            System.out.println("Pilih : ");
            int pilih = Integer.parseInt(br.readLine());

            switch(pilih){
                case 1:
                    cls();
                    soal1();
                    break;
                case 2:
                    cls();
                    soal2();
                    break;
                case 0:
                    end = false;
                    break;
                default:
                    System.out.println("Pilih yang bener :v");
                    break;
            }
        }System.out.println("");
    }

    private static void soal1() throws IOException{
        String og = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        System.out.println("Soal 1");
        System.out.println("\n");
        System.out.println("1. " + og.substring(0, 37));
        System.out.println("2. " + og.toLowerCase().substring(0, 37));
        System.out.println("3. " + og.toUpperCase().substring(0, 37));
        System.out.println("4. " + og.substring(25, 36));
        System.out.println("5. " + og.substring(37));
        confirm();
        cls();
    }

    private static double nilaiabsen(int absen){
        if (absen < 3){
            return 0;
        }
        else if (absen >= 3 && absen <= 4){
            return 60;
        }
        else if (absen >= 5 && absen <= 6){
            return 80;
        }
        else {
            return 100;
        }
    }

    private static char skor(double nilaiakhir){
        if (nilaiakhir >= 85 && nilaiakhir <= 100) {
            return 'A';
        } else if (nilaiakhir >= 70 && nilaiakhir <= 84) {
            return 'B';
        } else if (nilaiakhir >= 60 && nilaiakhir <= 69) {
            return 'C';
        } else if (nilaiakhir >= 50 && nilaiakhir <= 59) {
            return 'D';
        } else {
            return 'E';
        }
    }

    private static void soal2() throws NumberFormatException, IOException{
        System.out.println("Soal 2");
        System.out.println("Masukkan Jumlah Kehadiran : ");
        int absen = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Nilai UTS : ");
        double UTS = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Nilai UAS : ");
        double UAS = Integer.parseInt(br.readLine());

        double nilaiabsen = nilaiabsen(absen);
        double nilaiakhir = (nilaiabsen * 0.2) + (UTS * 0.3) + (UAS * 0.5);
        char skor = skor(nilaiakhir);

        System.out.println("Nilai Akhir : " + nilaiakhir);
        System.out.println("Skor Akhir : " + skor);

        confirm();
        cls();
    }
}
