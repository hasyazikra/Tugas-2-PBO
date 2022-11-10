public class Elemen { //class elemen adalah superclass dari class mahasiswa dan class dosen
    public String nama;

    public Elemen(String nama) {
        /*constructor subclass merujuk kpd class elemen superclass
        maka termausk downcasting*/
        this.nama = nama;
    }

}

//class Dosen adalah subclass dari class Elemen
//untuk mewarisi properti dan method superclass, digunakan 'extends' 
//polymorphism
class Dosen extends Elemen {
    public int jamSibuk;
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama); // mengconstruct properti superclass, downcasting
        jamSibuk = jumlahHariKerja * 8; // rumus jumlah hari kerja x 8
    }

    public void result() {
        System.out.println(nama + " adalah seorang dosen dengan jam sibuk " + jamSibuk);
    }

    public int getJamSibuk() {
        return jamSibuk;
    }
}

//class Mahasiswa adalah subclass dari class Elemen
//untuk mewarisi properti dan method superclass, digunakan 'extends' 
//polymorphism
class Mahasiswa extends Elemen {
    private int sks;
    public int jamSibuk;

    public Mahasiswa(String nama, int sks) {
        super(nama); // mengconstuct properti superclass, downcasting
        jamSibuk = sks*3; //rumus sks x 3
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void result() {
        System.out.println(nama + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }

}

//class Asdos adalah subclass dari class Mahasiswa
//untuk mewarisi properti dan method class Mahasiswa, digunakan 'extends' 
class Asdos extends Mahasiswa {
    private int jamNgasdos;
    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks); //construct properti pada class Mahasiswa, downcasting
        jamSibuk = jamSibuk + jamNgasdos;  // rummus jam sibuk + jam ngasdos
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void result() {
        /*karena melakukan perubahan isi method yang terdapat pada
        superclass, maka termasuk upcasting*/

        System.out.println(nama + " adalah seorang asdos dengan jam sibuk " +  jamSibuk);
    }

}
