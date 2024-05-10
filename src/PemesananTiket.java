class PemesananTiket {
   // Do your magic here...
   private String namaPemesan;
    private TiketKonser tiketTerpilih;

    public PemesananTiket(String namaPemesan, TiketKonser tiketTerpilih) {
        this.namaPemesan = namaPemesan;
        this.tiketTerpilih = tiketTerpilih;
    }

    public void cetakNotaPesanan() {
        String kodeBooking = Main.generateKodeBooking();
        String tanggalPesanan = Main.getCurrentDate();
        int hargaTiket = tiketTerpilih.getHarga();

        System.out.println("---- Detail Pemesanan ----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket Terpilih: " + tiketTerpilih.getNamaTiket());
        System.out.println("Total Harga: " + hargaTiket + " USD");
    }
 }