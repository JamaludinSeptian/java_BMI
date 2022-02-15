import java.util.*;
import java.text.*;
public class arrayBMII
{
    public static void main(String[] args){
       try {
           Scanner sc=new Scanner(System.in);
           int jdata;
           String tgl, dokter;
           DecimalFormat df=new DecimalFormat("0.00");
       
           System.out.print("Tanggal : "); tgl = sc.next();
           System.out.print("Dokter  : "); dokter = sc.next();
           System.out.println();
           System.out.print("Jumlah Data : ");jdata=sc.nextInt();
           System.out.println("-----------------------------------------------------");
       
           String id[][] = new String [jdata] [1];
           int data[][]  = new int [jdata] [2];
        
           for(int i = 0; i < jdata; i++){
               System.out.print("ID Pasien                 : "); id  [i] [0]=sc.next();
               System.out.print("Berat Badan (kg)          : "); data[i] [0]=sc.nextInt();
               System.out.print("Tinggi Badan(cm)          : "); data[i] [1]=sc.nextInt();
               System.out.println();
            }
            System.out.println("==============================================================================");
            System.out.println("                               KLINIK GIZI                                    ");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Dokter:"+dokter+"                                          Tanggal : "+tgl     );
            System.out.println("==============================================================================");
            System.out.println("No \tID Pasien\tBerat Badan\tTinggi Badan\tBMI\tStatus");
            System.out.println("==============================================================================");
           for(int i = 0; i < jdata; i++){
               double tb = (double) data[i] [1]/ 100;
               tb *= tb;
               double bmi = data[i] [0] / tb;
               if(bmi <= 18.4 ){
                   System.out.print((i+1)+"\t  "+id[i] [0]+"\t\t   "+data[i] [0]+"\t\t   "+data[i] [1]+"\t\t"+df.format(bmi)+"\tKekurangan BB");
               }else if(bmi >= 18.5 && bmi <= 24.99){
                   System.out.print((i+1)+"\t  "+id[i] [0]+"\t\t   "+data[i] [0]+"\t\t   "+data[i] [1]+"\t\t"+df.format(bmi)+"\tIdeal");
               }else if(bmi >= 25.0 && bmi <= 29.99){
                   System.out.print((i+1)+"\t  "+id[i] [0]+"\t\t   "+data[i] [0]+"\t\t   "+data[i] [1]+"\t\t"+df.format(bmi)+"\tKelebihan BB");
               }else{
                   System.out.print((i+1)+"\t  "+id[i] [0]+"\t\t   "+data[i] [0]+"\t\t   "+data[i] [1]+"\t\t"+df.format(bmi)+"\tObesitas");
               }
               System.out.println();
           }
        }   catch(Exception e){System.out.println(e);}
    }
}
