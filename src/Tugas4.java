import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        String pilihan;
        Integer selesai;
        boolean pilihan2, pilihan4;
        int NomorAntrian = 1, angka, pesanan, pilihan3, j = 0;
        Queue<Integer> NoAntrian = new LinkedList<>();
        Queue<String> PesananPelanggan = new LinkedList<>();
        Queue<Integer> PelangganSelesai = new LinkedList<>();
        Scanner Input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Ayamku");
        System.out.println("=================================");
        do {
            System.out.println("Apakah anda ingin melakukan pemesanan (y/t) : ");
            pilihan = Input.nextLine();
            System.out.println("----------------------------------------------");
            switch (pilihan) {
                // pelanggan
                case "y":
                    System.out.println("silahkan Ambil Nomor Antrian");
                    var data_antrian = NomorAntrian++;
                    NoAntrian.add(data_antrian);
                    System.out.println("-------------------------------------------");
                    System.out.println("Nomor antrian anda adalah : " + data_antrian);
                    System.out.println("-------------------------------------------");
                    System.out.println("Menu Ayamku : ");
                    System.out.println("1. Kenthir 1");
                    System.out.println("2. Cah Kangkung");
                    System.out.println("3. Kol Goreng");
                    System.out.println("4. Ayam Gepuk");
                    System.out.println("-------------------------------------------");
                    do {
                        System.out.println("Masukan jumlah pesanan anda : ");
                        angka = Input.nextInt();
                        System.out.println("Masukan pesanan anda (isi sesuai nomor): ");
                        for (int i = 1; i <= angka; i++) {
                            System.out.println("Pesanan ke - " + i + " : ");
                            pesanan = Input.nextInt();
                            switch (pesanan) {
                                case 1:
                                    PesananPelanggan.add("Kenthir 1"); // add deque
                                    System.out.println("Pesanan : Kenthir 1");
                                    break;
                                case 2:
                                    PesananPelanggan.add("Cah Kangkung");
                                    System.out.println("Pesanan : Cah Kangkung");
                                    break;
                                case 3:
                                    PesananPelanggan.add("Kol Goreng");
                                    System.out.println("Pesanan : Kol Goreng");
                                    break;
                                case 4:
                                    PesananPelanggan.add("Ayam Gepuk");
                                    System.out.println("Pesanan : Ayam Gepuk");
                                    break;
                                default:
                                    System.out.println("Pesanan anda tidak ditemukan");
                                    break;
                            }
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("Apakah anda ingin mengulang pemesanan lagi (true/false): ");
                        pilihan2 = Input.nextBoolean();
                    } while (pilihan2);
                    break;
                // pemilik restoran
                case "t":
                    do {
                        System.out.println("Menu Operasi Data Pesanan");
                        System.out.println("------------------------------");
                        System.out.println("1. Cek data pelanggan kosong");
                        System.out.println("2. Cek data pesanan kosong"); // isempty
                        System.out.println("3. Pesanan Selesai"); // poll antrian
                        System.out.println("4. Tampilkan pelanggan yang sudah diselesaikan"); // to array
                        System.out.println("5. Jumlah Pesanan"); // size
                        System.out.println("6. Jumlah Pelanggan");
                        System.out.println("7. Riwayat pesanan"); // pesananpelanggan
                        System.out.println("8. Data pelanggan yang tersedia"); // no antrian
                        System.out.println("9. Hapus semua data"); // clear
                        System.out.println("10.Tutup Restoran ayamku"); // out
                        System.out.println("------------------------------");
                        System.out.println("Masukan pilihan anda : ");
                        pilihan3 = Input.nextInt();
                        switch (pilihan3) {
                            case 1:
                                var DataKosong = NoAntrian.isEmpty();
                                System.out.println("Data pelanggan kosong : " + DataKosong);
                                break;
                            case 2:
                                var DataKosong2 = PesananPelanggan.isEmpty();
                                System.out.println("Data pesanan kosong : " + DataKosong2);
                                break;
                            case 3:
                                if (NoAntrian.isEmpty() == true) {
                                    System.out.println("Tidak ada pesanan");
                                } else {
                                    selesai = NoAntrian.poll(); // enque
                                    PelangganSelesai.add(selesai); // deque
                                    System.out.println("Pesanan berhasil diselesaikan");
                                }
                                break;
                            case 4:
                                System.out.println("data pelanggan yang sudah diselesaikan : ");
                                System.out.println(PelangganSelesai);
                                break;
                            case 5:
                                System.out.println("Jumlah data pesanan yang tersedia : " + PesananPelanggan.size());
                                break;
                            case 6:
                                System.out.println("Jumlah data pelanggan yang tersedia : " + NoAntrian.size());
                                break;
                            case 7:
                                System.out.println("Riwayat Pesanan ayamku : " + PesananPelanggan);
                                break;
                            case 8:
                                System.out.println("Data pelanggan yang tersedia : " + NoAntrian);
                                break;
                            case 9:
                                NoAntrian.clear();
                                PesananPelanggan.clear();
                                System.out.println("semua data berhasil di hapus");
                                break;
                            case 10:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("pilihan yang anda tuliskan salah!");
                                break;
                        }
                        System.out.println("--------------------------------------------------------");
                        System.out.println("apakah anda ingin mengulang operasi lagi (true/false) : ");
                        pilihan4 = Input.nextBoolean();
                    } while (pilihan4);
            }
        } while (true);
    }
}
