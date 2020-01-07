/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.Pelanggan_model;
import latihanmvc.view.Pelanggan;

/**
 *
 * @author toshiba
 */
public class PelangganController {
    
    private Pelanggan_model model ;

    public void setModel(Pelanggan_model model) {
        this.model = model;
    }
    
    
    
    public void resetForm(Pelanggan view){
     
        String nama = view.getTxtnama().getText();
        String email= view.getTxtemail().getText();
        String noTlp= view.getTxttelp().getText();
        
        if(nama.equals("")&& email.equals("")&& noTlp.equals("")){
        
         }else{
            model.resetForm();
        }
    }
    
    public void simpanForm(Pelanggan view){
        String nama= view.getTxtnama().getText();
        String email= view.getTxtemail().getText();
        String noTlp= view.getTxttelp().getText();
        
        if(nama.trim().equals("")){
            
            JOptionPane.showMessageDialog(view,"Nama masih kosong");
                    }else if(email.trim().equals("")){
                     JOptionPane.showMessageDialog(view,"email masih kosong");
                    }else if(noTlp.trim().equals("")){
                     JOptionPane.showMessageDialog(view," No Telp masih kosong");
                    }else{
                    model.simpanForm();
        }
    
    }
}
