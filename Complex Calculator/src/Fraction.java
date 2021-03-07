public class Fraction implements Number{

    private int num;
    private int denom;

    public Fraction(){
        num = 0;
        denom = 0;
    }

    public Fraction(int numerator, int denominator){
        num = numerator;
        denom = denominator;
    }
    int gcm;
    public void setNum(int x){
        num = x;
    }

    public int getNum(){
        return num;
    }

    public void setDenom(int y){
        denom = y;
    }

    public int getDenom(){
        return denom;
    }

    @Override
    public Number add(Number num) {
       // Fraction fraction = (Fraction) num;
        int num1 = ((Fraction)num).num;
        int denom1 = ((Fraction)num).denom;
        int num2 = this.num;
        int denom2 = this.denom;
        System.out.println(num1);

    return null;
    }

    @Override
    public Number subtract(Number num) {
        return null;
    }

    @Override
    public Number multiply(Number num) {
        return null;
    }

    @Override
    public Number divide(Number num) {
        return null;
    }

    public int gcm(Number num){
        gcm = 0;
        Fraction fraction = (Fraction) num;
        gcm = denom * fraction.getDenom();
        for(int i = 1; i < gcm; i++){
            if(i % denom == 0 && i % fraction.getDenom() == 0){
                gcm = i;
                break;
            }
        }
        return gcm;
    }

    public void print() {
        System.out.println(this.num + "/" + this.denom);
    }

    /*
    public Fraction simplify(){

    }
    */
}
