/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan56.umurbarangantik;

/**
 *
  * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    Radio() {
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void tampilUmur() {
        super.tampilUmur(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
