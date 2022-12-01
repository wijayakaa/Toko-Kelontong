import java.util.ArrayList;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        ArrayList<dataBarang> myBarang = new ArrayList<>();
        int jumlah_barang,uang,kembalian,totalharga,pilihan,barang;
        String nama_barang;
        char ulang;
        //Bahan masakkan

        //royco
        dataBarang royco = new dataBarang();
        royco.setNama_barang("royco");
        royco.setCode_barang(112233);
        royco.setJenis_barang("Bahan masakkan");
        royco.setJumlah_barang(100);
        royco.setHarga_barang(1000);
        //merica
        dataBarang merica = new dataBarang();
        merica.setNama_barang("merica");
        merica.setCode_barang(257331);
        merica.setJenis_barang("Bahan masakkan");
        merica.setJumlah_barang(125);
        merica.setHarga_barang(1500);
        //bawang bombay
        dataBarang bawang_bombay = new dataBarang();
        bawang_bombay.setNama_barang("Bawang bombay");
        bawang_bombay.setCode_barang(254321);
        bawang_bombay.setJenis_barang("Bahan masakkan");
        bawang_bombay.setJumlah_barang(123);
        bawang_bombay.setHarga_barang(1500);
        //jahe
        dataBarang jahe = new dataBarang();
        jahe.setNama_barang("Jahe");
        jahe.setCode_barang(157679);
        jahe.setJenis_barang("Bahan masakkan");
        jahe.setJumlah_barang(129);
        jahe.setHarga_barang(2000);
        //kunyit
        dataBarang kunyit = new dataBarang();
        kunyit.setNama_barang("Kunyit");
        kunyit.setCode_barang(543671);
        kunyit.setJenis_barang("Bahan masakkan");
        kunyit.setJumlah_barang(133);
        kunyit.setHarga_barang(1500);

        //obat-obatan

        //bodrex
        dataBarang bodrex = new dataBarang();
        bodrex.setNama_barang("Kunyit");
        bodrex.setCode_barang(254321);
        bodrex.setJenis_barang("Obat-obatan");
        bodrex.setJumlah_barang(132);
        bodrex.setHarga_barang(2500);
        //promagh
        dataBarang promagh = new dataBarang();
        promagh.setNama_barang("Promagh");
        promagh.setCode_barang(157689);
        promagh.setJenis_barang("Obat-obatan");
        promagh.setJumlah_barang(135);
        promagh.setHarga_barang(1000);
        //paramex
        dataBarang paramex = new dataBarang();
        paramex.setNama_barang("Paramex");
        paramex.setCode_barang(1765894);
        paramex.setJenis_barang("Obat-obatan");
        paramex.setJumlah_barang(117);
        paramex.setHarga_barang(1500);
        //panadol
        dataBarang panadol = new dataBarang();
        panadol.setNama_barang("Panadol");
        panadol.setCode_barang(1436729);
        panadol.setJenis_barang("Obat-obatan");
        panadol.setJumlah_barang(134);
        panadol.setHarga_barang(3000);
        //balsem
        dataBarang balsem = new dataBarang();
        balsem.setNama_barang("Balsem");
        balsem.setCode_barang(1765894);
        balsem.setJenis_barang("Obat-obatan");
        balsem.setJumlah_barang(117);
        balsem.setHarga_barang(1500);

        //alat mandi

        //sabun-lifeboy
        dataBarang lifeboy = new dataBarang();
        lifeboy.setNama_barang("Sabun lifeboy");
        lifeboy.setCode_barang(1327849);
        lifeboy.setJenis_barang("Alat Mandi");
        lifeboy.setJumlah_barang(122);
        lifeboy.setHarga_barang(1500);
        //pepsodent
        dataBarang pepsodent = new dataBarang();
        pepsodent.setNama_barang("Odol Pepsodent");
        pepsodent.setCode_barang(1987365);
        pepsodent.setJenis_barang("Alat Mandi");
        pepsodent.setJumlah_barang(129);
        pepsodent.setHarga_barang(3000);
        //kodomo
        dataBarang kodomo = new dataBarang();
        kodomo.setNama_barang("Sikat Gigi Kodomo");
        kodomo.setCode_barang(1678291);
        kodomo.setJenis_barang("Alat Mandi");
        kodomo.setJumlah_barang(117);
        kodomo.setHarga_barang(3000);
        //pentene
        dataBarang pentene = new dataBarang();
        pentene.setNama_barang("Shampo Pentene");
        pentene.setCode_barang(14563896);
        pentene.setJenis_barang("Alat Mandi");
        pentene.setJumlah_barang(118);
        pentene.setHarga_barang(1000);
        //garnier
        dataBarang garnier = new dataBarang();
        garnier.setNama_barang("Sabun Muka Garnier");
        garnier.setCode_barang(14920394);
        garnier.setJenis_barang("Alat Mandi");
        garnier.setJumlah_barang(127);
        garnier.setHarga_barang(9000);

        //makanan ringan

        //kacang kering
        dataBarang pilus = new dataBarang();
        pilus.setNama_barang("Pilus Garuda");
        pilus.setCode_barang(18994702);
        pilus.setJenis_barang("Makanan Ringan");
        pilus.setJumlah_barang(137);
        pilus.setHarga_barang(1000);
        //kue kering
        dataBarang slayolay = new dataBarang();
        slayolay.setNama_barang("Slayolay");
        slayolay.setCode_barang(193782040);
        slayolay.setJenis_barang("Makanan Ringan");
        slayolay.setJumlah_barang(127);
        slayolay.setHarga_barang(1000);
        //chitato
        dataBarang chitato = new dataBarang();
        chitato.setNama_barang("Chitato");
        chitato.setCode_barang(120388420);
        chitato.setJenis_barang("Makanan Ringan");
        chitato.setJumlah_barang(133);
        chitato.setHarga_barang(3000);
        //doritos
        dataBarang doritos = new dataBarang();
        doritos.setNama_barang("Doritos");
        doritos.setCode_barang(128374940);
        doritos.setJenis_barang("Makanan Ringan");
        doritos.setJumlah_barang(135);
        doritos.setHarga_barang(5000);
        //lays
        dataBarang lays = new dataBarang();
        lays.setNama_barang("Lays");
        lays.setCode_barang(14538290);
        lays.setJenis_barang("Makanan Ringan");
        lays.setJumlah_barang(134);
        lays.setHarga_barang(5000);

        //minuman segar

        //fanta
        dataBarang fanta = new dataBarang();
        fanta.setNama_barang("Fanta");
        fanta.setCode_barang(10293044);
        fanta.setJenis_barang("Minuman Segar");
        fanta.setJumlah_barang(136);
        fanta.setHarga_barang(3000);
        //aqua
        dataBarang aqua = new dataBarang();
        fanta.setNama_barang("Aqua");
        fanta.setCode_barang(10293044);
        fanta.setJenis_barang("Minuman Segar");
        fanta.setJumlah_barang(136);
        fanta.setHarga_barang(3000);
        //freshtea
        dataBarang freshtea = new dataBarang();
        freshtea.setNama_barang("Freshtea");
        freshtea.setCode_barang(12994739);
        freshtea.setJenis_barang("Minuman Segar");
        freshtea.setJumlah_barang(126);
        freshtea.setHarga_barang(3000);
        //GoodDay
        dataBarang goodday = new dataBarang();
        goodday.setNama_barang("Kopi GoodDay");
        goodday.setCode_barang(119203784);
        goodday.setJenis_barang("Minuman Segar");
        goodday.setJumlah_barang(128);
        goodday.setHarga_barang(3000);
        //sprite
        dataBarang sprite = new dataBarang();
        sprite.setNama_barang("Sprite");
        sprite.setCode_barang(1083726192);
        sprite.setJenis_barang("Minuman Segar");
        sprite.setJumlah_barang(129);
        sprite.setHarga_barang(3000);
        //form login.
        String username;
        System.out.println("============================");
        System.out.print("Masukkan username : ");
        username = login.nextLine();
        String password;
        System.out.print("Masukkan password : ");
        password = login.nextLine();
        //Proses Login.
        if (username.equals("admin")&&password.equals("admin")) {
            System.out.println("==================================================");
            System.out.println("==               Login Berhasil.!!              ==");
            System.out.println("==================================================");

            do {
            System.out.println("==================================================");
            System.out.println("==  Selamat datang di toko kelontong 10 PPLG 2  ==");
            System.out.println("==================================================");
            System.out.println("1.Lihat list barang.");
            System.out.println("2.Input Barang.");
            System.out.println("3.Beli barang.");
            System.out.println("============================");

            System.out.print("masukkan pilihan : ");
            pilihan = login.nextInt();
            if (pilihan==1) {
                System.out.println("============================");
                System.out.println(royco.getNama_barang());
                System.out.println(merica.getNama_barang());
                System.out.println(bawang_bombay.getNama_barang());
                System.out.println(jahe.getNama_barang());
                System.out.println(kunyit.getNama_barang());
                System.out.println(bodrex.getNama_barang());
                System.out.println(promagh.getNama_barang());
                System.out.println(paramex.getNama_barang());
                System.out.println(panadol.getNama_barang());
                System.out.println(balsem.getNama_barang());
                System.out.println(lifeboy.getNama_barang());
                System.out.println(pepsodent.getNama_barang());
                System.out.println(kodomo.getNama_barang());
                System.out.println(pentene.getNama_barang());
                System.out.println(garnier.getNama_barang());
                System.out.println(pilus.getNama_barang());
                System.out.println(slayolay.getNama_barang());
                System.out.println(chitato.getNama_barang());
                System.out.println(doritos.getNama_barang());
                System.out.println(lays.getNama_barang());
                System.out.println(fanta.getNama_barang());
                System.out.println(aqua.getNama_barang());
                System.out.println(freshtea.getNama_barang());
                System.out.println(goodday.getNama_barang());
                System.out.println(sprite.getNama_barang());
                System.out.println("============================");
            }

                if (pilihan==2) {
                    System.out.println("============================");
                    System.out.println(royco.getNama_barang());
                    System.out.println(merica.getNama_barang());
                    System.out.println(bawang_bombay.getNama_barang());
                    System.out.println(jahe.getNama_barang());
                    System.out.println(kunyit.getNama_barang());
                    System.out.println(bodrex.getNama_barang());
                    System.out.println(promagh.getNama_barang());
                    System.out.println(paramex.getNama_barang());
                    System.out.println(panadol.getNama_barang());
                    System.out.println(balsem.getNama_barang());
                    System.out.println(lifeboy.getNama_barang());
                    System.out.println(pepsodent.getNama_barang());
                    System.out.println(kodomo.getNama_barang());
                    System.out.println(pentene.getNama_barang());
                    System.out.println(garnier.getNama_barang());
                    System.out.println(pilus.getNama_barang());
                    System.out.println(slayolay.getNama_barang());
                    System.out.println(chitato.getNama_barang());
                    System.out.println(doritos.getNama_barang());
                    System.out.println(lays.getNama_barang());
                    System.out.println(fanta.getNama_barang());
                    System.out.println(aqua.getNama_barang());
                    System.out.println(freshtea.getNama_barang());
                    System.out.println(goodday.getNama_barang());
                    System.out.println(sprite.getNama_barang());
                    System.out.println("============================");
                    System.out.print("masukkan nama barang : ");
                    nama_barang = login.next();
                    if (nama_barang.equals("royco")){
                        //royco
                        System.out.println("============================");
                        System.out.println("Nama barang : " + royco.getNama_barang());
                        System.out.println("Jenis barang : " + royco.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + royco.getJumlah_barang());
                        System.out.println("Harga barang : " + royco.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("merica")){
                        //merica
                        System.out.println("============================");
                        System.out.println("Nama barang : " + merica.getNama_barang());
                        System.out.println("Jenis barang : " + merica.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + merica.getJumlah_barang());
                        System.out.println("Harga barang : " + merica.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("bawang bombay")){
                        //bawang bombay
                        System.out.println("============================");
                        System.out.println("Nama barang : " + bawang_bombay.getNama_barang());
                        System.out.println("Jenis barang : " + bawang_bombay.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + bawang_bombay.getJumlah_barang());
                        System.out.println("Harga barang : " + bawang_bombay.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("jahe")){
                        //jahe
                        System.out.println("============================");
                        System.out.println("Nama barang : " + jahe.getNama_barang());
                        System.out.println("Jenis barang : " + jahe.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + jahe.getJumlah_barang());
                        System.out.println("Harga barang : " + jahe.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("kunyit")){
                        //kunyit
                        System.out.println("============================");
                        System.out.println("Nama barang : " + kunyit.getNama_barang());
                        System.out.println("Jenis barang : " + kunyit.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + kunyit.getJumlah_barang());
                        System.out.println("Harga barang : " + kunyit.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("bodrex")) {
                        System.out.println("============================");
                        System.out.println("Nama barang : " + bodrex.getNama_barang());
                        System.out.println("Jenis barang : " + bodrex.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + bodrex.getJumlah_barang());
                        System.out.println("Harga barang : " + bodrex.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("promagh")) {
                        //promagh
                        System.out.println("============================");
                        System.out.println("Nama barang : " + promagh.getNama_barang());
                        System.out.println("Jenis barang : " + promagh.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + promagh.getJumlah_barang());
                        System.out.println("Harga barang : " + promagh.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("paramex")) {
                        //paramex
                        System.out.println("============================");
                        System.out.println("Nama barang : " + paramex.getNama_barang());
                        System.out.println("Jenis barang : " + paramex.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + paramex.getJumlah_barang());
                        System.out.println("Harga barang : " + paramex.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("panadol")) {
                        //panadol
                        System.out.println("============================");
                        System.out.println("Nama barang : " + panadol.getNama_barang());
                        System.out.println("Jenis barang : " + panadol.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + panadol.getJumlah_barang());
                        System.out.println("Harga barang : " + panadol.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("balsem")) {
                        //balsem
                        System.out.println("============================");
                        System.out.println("Nama barang" + balsem.getNama_barang());
                        System.out.println("Jenis barang : " + balsem.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + balsem.getJumlah_barang());
                        System.out.println("Harga barang : " + balsem.getHarga_barang());
                        System.out.println("============================");
                    }
                    //alatmandi
                    if (nama_barang.equals("lifeboy")) {
                        //lifeboy
                        System.out.println("============================");
                        System.out.println("Nama barang : " + lifeboy.getNama_barang());
                        System.out.println("Jenis barang : " + lifeboy.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + lifeboy.getJumlah_barang());
                        System.out.println("Harga barang : " + lifeboy.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("pepsodent")) {
                        //pepsodent
                        System.out.println("============================");
                        System.out.println("Nama barang : " + pepsodent.getNama_barang());
                        System.out.println("Jenis barang : " + pepsodent.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + pepsodent.getJumlah_barang());
                        System.out.println("Harga barang : " + pepsodent.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("kodomo")) {
                        //kodomo
                        System.out.println("============================");
                        System.out.println("Nama barang : " + kodomo.getNama_barang());
                        System.out.println("Jenis barang : " + kodomo.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + kodomo.getJumlah_barang());
                        System.out.println("Harga barang : " + kodomo.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("pentene")){
                        //pentene
                        System.out.println("============================");
                        System.out.println("Nama barang : " + pentene.getNama_barang());
                        System.out.println("Jenis barang : " + pentene.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + pentene.getJumlah_barang());
                        System.out.println("Harga barang : " + pentene.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("garnier")){
                        //garnier
                        System.out.println("============================");
                        System.out.println("Nama barang : " + garnier.getNama_barang());
                        System.out.println("Jenis barang : " + garnier.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + garnier.getJumlah_barang());
                        System.out.println("Harga barang : " + garnier.getHarga_barang());
                        System.out.println("============================");
                    }
                    //jajanan
                    if (nama_barang.equals("pilus")){
                        //pilus
                        System.out.println("============================");
                        System.out.println("Nama barang : " + pilus.getNama_barang());
                        System.out.println("Jenis barang : " + pilus.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + pilus.getJumlah_barang());
                        System.out.println("Harga barang : " + pilus.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("slayolay")){
                        //slayoley
                        System.out.println("============================");
                        System.out.println("Nama barang : " + slayolay.getNama_barang());
                        System.out.println("Jenis barang : " + slayolay.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + slayolay.getJumlah_barang());
                        System.out.println("Harga barang : " + slayolay.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("chitato")){
                        //chitato
                        System.out.println("============================");
                        System.out.println("Nama barang : " + chitato.getNama_barang());
                        System.out.println("Jenis barang : " + chitato.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + chitato.getJumlah_barang());
                        System.out.println("Harga barang : " + chitato.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("doritos")){
                        //doritos
                        System.out.println("============================");
                        System.out.println("Nama barang : " + doritos.getNama_barang());
                        System.out.println("Jenis barang : " + doritos.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + doritos.getJumlah_barang());
                        System.out.println("Harga barang : " + doritos.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("doritos")){
                        //lays
                        System.out.println("============================");
                        System.out.println("Nama barang : " + lays.getNama_barang());
                        System.out.println("Jenis barang : " + lays.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + lays.getJumlah_barang());
                        System.out.println("Harga barang : " + lays.getHarga_barang());
                        System.out.println("============================");
                    }
                    //minuman segar
                    if (nama_barang.equals("fanta")){
                        //fanta
                        System.out.println("============================");
                        System.out.println("Nama barang : " + fanta.getNama_barang());
                        System.out.println("Jenis barang : " + fanta.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + fanta.getJumlah_barang());
                        System.out.println("Harga barang : " + fanta.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("aqua")){
                        //aqua
                        System.out.println("============================");
                        System.out.println("Nama barang : " + aqua.getNama_barang());
                        System.out.println("Jenis barang : " + aqua.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + aqua.getJumlah_barang());
                        System.out.println("Harga barang : " + aqua.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("freshtea")){
                        //freshtea
                        System.out.println("============================");
                        System.out.println("Nama barang : " + freshtea.getNama_barang());
                        System.out.println("Jenis barang : " + freshtea.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + freshtea.getJumlah_barang());
                        System.out.println("Harga barang : " + freshtea.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("goodday")){
                        //goodday
                        System.out.println("============================");
                        System.out.println("Nama barang : " + goodday.getNama_barang());
                        System.out.println("Jenis barang : " + goodday.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + goodday.getJumlah_barang());
                        System.out.println("Harga barang : " + goodday.getHarga_barang());
                        System.out.println("============================");
                    }
                    if (nama_barang.equals("goodday")){
                        //sprite
                        System.out.println("============================");
                        System.out.println("Nama barang : " + sprite.getNama_barang());
                        System.out.println("Jenis barang : " + sprite.getJenis_barang());
                        System.out.println("Sisa stock di toko : " + sprite.getJumlah_barang());
                        System.out.println("Harga barang : " + sprite.getHarga_barang());
                        System.out.println("============================");
                    }
                }
                    if (pilihan==3){
                        System.out.println("============================");
                        System.out.println(royco.getNama_barang());
                        System.out.println(merica.getNama_barang());
                        System.out.println(bawang_bombay.getNama_barang());
                        System.out.println(jahe.getNama_barang());
                        System.out.println(kunyit.getNama_barang());
                        System.out.println(bodrex.getNama_barang());
                        System.out.println(promagh.getNama_barang());
                        System.out.println(paramex.getNama_barang());
                        System.out.println(panadol.getNama_barang());
                        System.out.println(balsem.getNama_barang());
                        System.out.println(lifeboy.getNama_barang());
                        System.out.println(pepsodent.getNama_barang());
                        System.out.println(kodomo.getNama_barang());
                        System.out.println(pentene.getNama_barang());
                        System.out.println(garnier.getNama_barang());
                        System.out.println(pilus.getNama_barang());
                        System.out.println(slayolay.getNama_barang());
                        System.out.println(chitato.getNama_barang());
                        System.out.println(doritos.getNama_barang());
                        System.out.println(lays.getNama_barang());
                        System.out.println(fanta.getNama_barang());
                        System.out.println(aqua.getNama_barang());
                        System.out.println(freshtea.getNama_barang());
                        System.out.println(goodday.getNama_barang());
                        System.out.println(sprite.getNama_barang());
                        System.out.println("============================");
                        System.out.print("barang apa yang akan dibeli? : ");
                        barang = login.nextInt();

                        if (barang==1){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+ royco.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : " + royco.getJenis_barang());
                            System.out.println("Sisa stock di toko : " + royco.getJumlah_barang());
                            System.out.println("Harga barang : " + royco.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==2){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+merica.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+merica.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+merica.getJumlah_barang());
                            System.out.println("Harga barang : "+merica.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==3){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+bawang_bombay.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+bawang_bombay.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+bawang_bombay.getJumlah_barang());
                            System.out.println("Harga barang : "+bawang_bombay.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==4){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+jahe.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+jahe.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+jahe.getJumlah_barang());
                            System.out.println("Harga barang : "+jahe.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==5){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+kunyit.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+kunyit.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+kunyit.getJumlah_barang());
                            System.out.println("Harga barang : "+kunyit.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==6){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+bodrex.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+bodrex.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+bodrex.getJumlah_barang());
                            System.out.println("Harga barang : "+bodrex.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==7){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+promagh.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+promagh.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+promagh.getJumlah_barang());
                            System.out.println("Harga barang : "+promagh.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==8){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+paramex.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+paramex.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+paramex.getJumlah_barang());
                            System.out.println("Harga barang : "+paramex.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==9){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+panadol.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+panadol.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+panadol.getJumlah_barang());
                            System.out.println("Harga barang : "+panadol.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==10){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+balsem.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+balsem.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+balsem.getJumlah_barang());
                            System.out.println("Harga barang : "+balsem.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==11){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+lifeboy.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+lifeboy.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+lifeboy.getJumlah_barang());
                            System.out.println("Harga barang : "+lifeboy.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==12){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+pepsodent.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+pepsodent.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+pepsodent.getJumlah_barang());
                            System.out.println("Harga barang : "+pepsodent.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==13){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+kodomo.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+kodomo.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+kodomo.getJumlah_barang());
                            System.out.println("Harga barang : "+kodomo.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==14){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+pentene.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+pentene.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+pentene.getJumlah_barang());
                            System.out.println("Harga barang : "+pentene.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==15){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+garnier.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+garnier.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+garnier.getJumlah_barang());
                            System.out.println("Harga barang : "+garnier.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==16){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+pilus.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+pilus.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+pilus.getJumlah_barang());
                            System.out.println("Harga barang : "+pilus.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==17){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+slayolay.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+slayolay.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+slayolay.getJumlah_barang());
                            System.out.println("Harga barang : "+slayolay.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==18){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+chitato.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+chitato.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+chitato.getJumlah_barang());
                            System.out.println("Harga barang : "+chitato.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==19){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+doritos.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+doritos.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+doritos.getJumlah_barang());
                            System.out.println("Harga barang : "+doritos.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==20){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+lays.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+lays.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+lays.getJumlah_barang());
                            System.out.println("Harga barang : ");
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==21){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+fanta.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+fanta.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+fanta.getJumlah_barang());
                            System.out.println("Harga barang : "+fanta.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==22){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+aqua.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+aqua.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+aqua.getJumlah_barang());
                            System.out.println("Harga barang : "+aqua.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==23){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+freshtea.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+freshtea.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+freshtea.getJumlah_barang());
                            System.out.println("Harga barang : "+freshtea.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==24){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+goodday.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+goodday.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+goodday.getJumlah_barang());
                            System.out.println("Harga barang : "+goodday.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                        if (barang==25 ){
                            System.out.println("============================");
                            System.out.println("Nama barang yang di pesan : "+sprite.getNama_barang());
                            System.out.println("Jenis barang yang di pesan : "+sprite.getJenis_barang());
                            System.out.println("Sisa stock di toko : "+sprite.getJumlah_barang());
                            System.out.println("Harga barang : "+sprite.getHarga_barang());
                            System.out.println("============================");
                            System.out.print("Berapa Jumlah barang yang mau dibeli : ");
                            jumlah_barang = login.nextInt();
                            totalharga = jumlah_barang * royco.getHarga_barang();
                            System.out.println("Harganya : " + totalharga);
                            System.out.println("============================");
                            System.out.print("Masukkan jumlah uang anda : ");
                            uang = login.nextInt();
                            System.out.println("============================");
                            kembalian = uang - totalharga;
                            if (uang >= totalharga){
                                System.out.println("Kembaliannya adalah : " + kembalian);
                            } else {
                                System.out.println("Maaf Uang Kurang,silahkan kembali dengan uang yang cukup");
                            }
                        }
                 }
                    System.out.print("Kembali ? (y/n)? ");
                    ulang = login.next().charAt(0);
            }while (ulang != 'n');
        }else {
            System.out.println("Login Gagal,silahkan ulang dari awal");
        }
    }
}
