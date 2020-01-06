/*
 *  Nama : Fatahillah Satria Bima Seno
 *  Kelas : IF01
 *  NIM : 10118039
 *  Deskripsi Program : 
 */
package edu.fatahseno.latihanmvc.model;

import edu.fatahseno.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Achapasya2109
 */
public class PelangganModel {

    private String nama;
    private String email;
    private String noTelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }

    protected void fireOnChange() {
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }

    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
        resetForm();
    }

    public void resetForm() {
        setNama("");
        setEmail("");
        setNoTelp("");
    }
}
