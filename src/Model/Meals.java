package Model;
public class Meals {
    private int ID;
    private int MILKTEA;//泰奶鬆餅220
    private int MANGO;  //芒果鬆餅220
    private int MOCHA;  //抹茶鬆餅250
    private int BEEF;   //牛排480
    private int CHICKEN;//雞排350
    private int PORK;   //豬排400
    private int MEMBERSUM;//會員小計

    public Meals(){}
    public Meals(int MILKTEA, int MANGO, int MOCHA, int BEEF, int CHICKEN, int PORK, int MEMBERSUM) {
        
        this.MILKTEA = MILKTEA;
        this.MANGO = MANGO;
        this.MOCHA = MOCHA;
        this.BEEF = BEEF;
        this.CHICKEN = CHICKEN;
        this.PORK = PORK;
        this.MEMBERSUM = (int)((MILKTEA*220+MANGO*220+MOCHA*250+BEEF*480+CHICKEN*350+PORK*400)*0.8);
    }

   


    
    
    public int getMILKTEA() {
        return MILKTEA;
    }

    public void setMILKTEA(int MILKTEA) {
        this.MILKTEA = MILKTEA;
    }

    public int getMANGO() {
        return MANGO;
    }

    public void setMANGO(int MANGO) {
        this.MANGO = MANGO;
    }

    public int getMOCHA() {
        return MOCHA;
    }

    public void setMOCHA(int MOCHA) {
        this.MOCHA = MOCHA;
    }

    public int getBEEF() {
        return BEEF;
    }

    public void setBEEF(int BEEF) {
        this.BEEF = BEEF;
    }

    public int getCHICKEN() {
        return CHICKEN;
    }

    public void setCHICKEN(int CHICKEN) {
        this.CHICKEN = CHICKEN;
    }

    public int getPORK() {
        return PORK;
    }

    public void setPORK(int PORK) {
        this.PORK = PORK;
    }


    public int getMEMBERSUM() {
        return MEMBERSUM;
    }

    public void setMEMBERSUM(int MEMBERSUM) {
        this.MEMBERSUM =(int)((MILKTEA*220+MANGO*220+MOCHA*250+BEEF*480+CHICKEN*350+PORK*400)*0.8);
    }
}
