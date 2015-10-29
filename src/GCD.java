import com.sun.org.apache.xpath.internal.SourceTree;

/**Наиюбольший общий делитель по алгоритму Евклида
 * Created by Вадик on 29.10.2015.
 */
public class GCD {
    public static void main(String args[]){
        for(int i=1; i<100; i++ ){
            for(int j = 1; j<100; j++){
        System.out.print(i+" "+j+" "+ GCD(i,j));
                System.out.println();
            }
        }
    }

    public static int GCD(int a, int b) {
        if(a<b){
            int interim = a;
            a = b;
            b = interim;
        }
        if(a == 0){return b;}
        else if(b==0){return a;}
       return GCD(b, a%b);
    }
}
