/*
 *  Nama : Fatahillah Satria Bima Seno
 *  Kelas : IF01
 *  NIM : 10118039
 *  Deskripsi Program : 
 */
package edu.fatahseno.latihanmvc.controller;

import edu.fatahseno.latihanmvc.model.PelangganModel;
import edu.fatahseno.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Achapasya2109
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama masih belum terisi");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email masih belum terisi");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No. Telepon masih belum terisi");
        } else {
            model.simpanForm();
        }
    }

    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();

        if (nama.equals("") && email.equals("") && noTlp.equals("")) {

        } else {
            model.resetForm();
        }

    }
}
