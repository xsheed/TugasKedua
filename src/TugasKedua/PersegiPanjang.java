  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKedua;

/**
 *
 * @author hp
 */
public class PersegiPanjang implements MenghitungBidang{
    protected int p, l;

    @Override
    public double Luas() {
        return p*l;
    }

    @Override
    public double Keliling() {
        return 2*(p+l);
    }
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }
}
