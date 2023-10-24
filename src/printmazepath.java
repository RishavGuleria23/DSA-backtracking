import java.lang.reflect.Array;
import java.util.ArrayList;

public class printmazepath {
    public static int mazepath2(int sr, int sc, int er, int ec , String psf, ArrayList<String> ans ){
        if(sr==er && sc==ec){
            ans.add(psf);
            return 1;
        }



        int count = 0;
        if( sr +1 <= er)
            count += mazepath2(sr+1,sc,er,ec, psf + "V",ans);

        if( sr +1 <= er && sc+1 <= ec)
            count += mazepath2(sr+1,sc+1,er,ec, psf + "D",ans);
        if( sc +1 <= ec)
            count += mazepath2(sr,sc+1,er,ec, psf + "H",ans);
        return count ;
    }

    public static void main(String[] args) {
        // mazepath2(1,1,1,1 ,"");
    }}

