public class Term {
    int coeff;
    int exp;
    Term next;
    Term prev;
    Term(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
        this.prev = null;
    }
    public void setCoeff(int x){
        this.coeff = x;
    }
    public void setExp(int x){
        this.exp = x;
    }
    public int getCoeff(){
        return this.coeff;
    }
    public int getExp(){
        return this.exp;
    }
    public boolean hasNext(){
        if(this.next!= null){
            return true;
        }
        else
            return false;
    }
    public boolean hasPrev(){
        if(this.prev != null){
            return true;
        } else
            return false;
    }
    public String toString() {
        String s = "";
        if (this.coeff != 0 && this.exp != 0) {
            if (this.coeff < 0)
                s += "-";
            else {
                s += "+";
            }
            if (this.coeff != 1 && this.coeff != -1) {
                s += Math.abs(coeff);
            }
            s += "x";
            if (this.exp > 1 || this.exp < 0) {
                s += "^" + this.exp;
            }
        }
        if (this.exp == 0 && this.coeff != 0) {
            {
                if(this.coeff > 0) {
                    s += "+" + this.coeff;
                }else{
                    s+= this.coeff;
                }
            }
        }
        return s;
    }
}