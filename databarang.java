package TugasPTS_Ganjil;

public class dataBarang {
    private String nama_barang;
    private int code_barang;
    private String jenis_barang;
    private int jumlah_barang;
    private int harga_barang;
    private String list_barang;

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    public void setCode_barang(int code_barang) {
        this.code_barang = code_barang;
    }
    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }
    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }
    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
    public void setList_barang(String list_barang) {
        this.list_barang = list_barang;
    }
    public String getJenis_barang() {
        return jenis_barang;
    }
    public String getNama_barang(){
        return nama_barang;
    }
    public int getJumlah_barang() {
        return jumlah_barang;
    }
    public int getCode_barang(){
        return code_barang;
    }
    public int getHarga_barang() {
        return harga_barang;
    }
    public String getList_barang() {
        return list_barang;
    }
}
