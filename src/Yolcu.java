
import java.awt.BorderLayout;
import java.io.PrintStream;
import java.util.Scanner;

class SiyasiException extends Exception{
    @Override
    public void printStackTrace( ) {
        System.out.println("Siyasi yasaginiz bulunmaktadır !!!!");
    }
}
class VizeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz ülkeye vizeniz bulunmamaktadır!!!");
    }
}
class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("harc odenmemis!!!!! ");
    }
}
public class Yolcu  {
    
    
    private int yurtdisi_harci;
    private boolean siyasi_yasak;
    private boolean vize_durumu;
    
    public Yolcu(){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Yatirdiginiz harc bedeli: ");
        this.yurtdisi_harci=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi yasak bulunuyor mu : ");
        String cevap=scanner.nextLine();
        if (cevap.equals("evet")) {
            this.siyasi_yasak=true;
            
        }
        else{
        this.siyasi_yasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu : ");
        String cevap2=scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.vize_durumu=true;
            
        }
        else{
        this.vize_durumu=false;
        }
    }


    public void yurtdisiHarciKontrol() throws HarcException {
        if (this.yurtdisi_harci<50) {
            throw new HarcException();
        }
        else{System.out.println("Yurtdisi Harci islemi tamamdir.");

        }
    }


    public void siyasiYasakKontrol() throws SiyasiException{
        if (this.siyasi_yasak==true) {
            throw new SiyasiException();
        }
        else{System.out.println("Siyasi yasaginiz bulunmuyor...");
        }
    }


    public void vizeDurumuKontrol() throws VizeException {
        if (vize_durumu==true) {
            System.out.println("Vize islemleri tamam.");
        }
        else{throw new VizeException();
        }
    }
    
    
}
