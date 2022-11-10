public class Result { // untuk menampilkan output dari kodingan sebelumnya
    public static void main(String[] args) {
        Asdos a = new Asdos("Fairuzikun", 23, 4);
        a.result();
        Dosen b = new Dosen("Raja OP Damanik", 5);
        b.result();
        Asdos c = new Asdos("Angel-chan", 20, 4);
        c.result();
        Mahasiswa d = new Mahasiswa("Firman", 20);
        d.result();
        Mahasiswa e = new Mahasiswa("Nid to Pass this sem", 23);
        e.result();
        Dosen f = new Dosen("Nivotko", 3);
        f.result();

        int totalJamSibuk = a.getJamSibuk() + b.getJamSibuk() + c.getJamSibuk() + d.getJamSibuk() + e.getJamSibuk() + f.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
    }
}