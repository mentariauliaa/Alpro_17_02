
package ch02;

public class Mahasiswa {
String nim;
String nama;
String alamat;
String hp;

public String getNIm(){
    return nim;
}
public String getNAma(){
    return nama;
}
public String getAlamat(){
    return alamat;
}
public String getHp(){
    return hp;
}

public void cetak(){
    System.out.println("NIM : "+nim);
    System.out.println("NAma : "+nama);
    System.out.println("Alamat : "+alamat);
    System.out.println("HP : "+hp);
}

}
