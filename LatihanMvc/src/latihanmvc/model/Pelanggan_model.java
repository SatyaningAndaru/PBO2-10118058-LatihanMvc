/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvc.model;

import javax.swing.JOptionPane;
import latihanmvc.event.PelangganListener;

/**
 *
 * @author toshiba
 */
public class Pelanggan_model {
    private String nama;
    private String email;
    private String noTelp; 
    
    private PelangganListener PelangganListener;

    public PelangganListener getPelangganListener() {
        return PelangganListener;
    }

    public void setPelangganListener(PelangganListener PelangganListener) {
        this.PelangganListener = PelangganListener;
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

    

    
    protected void fireOnChange(){
        if(PelangganListener!=null){
            PelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    public void simpanForm(){
        
        JOptionPane.showMessageDialog(null,"berhasil disimpan");
    
     }


    
}
