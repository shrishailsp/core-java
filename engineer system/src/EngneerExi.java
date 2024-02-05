import com.xworkz.engineer.engineers.CsEngneer;
import com.xworkz.engineer.engineers.Engineer;
import com.xworkz.engineer.engineers.MerainEngg;

public class EngneerExi {


    public static void main(String[] args) {
        Engineer eng=new CsEngneer();

        CsEngneer csEngneer=(CsEngneer) eng;
             csEngneer.problemSolve();
             csEngneer.Developer();

             Engineer eng1 =new MerainEngg();

             MerainEngg merainEngg=(MerainEngg) eng1;
             merainEngg.problemSolve();
        merainEngg.enjoy();

    }
}
