package com.muhamadarief.tongsik.Model;

/**
 * Created by Muhamad Arief on 30/08/2016.
 */
public class Tongkrongan {

    private int mImage;
    private String mNama;
    private String mAlamat;
    private String mHarga;


    public Tongkrongan(int mImage, String mNama, String mAlamat, String mHarga) {
        this.mImage = mImage;
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mHarga = mHarga;
    }



    public int getmImage() {
        return mImage;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public String getmHarga() {
        return mHarga;
    }

}
