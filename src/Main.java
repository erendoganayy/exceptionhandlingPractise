
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ATATÜRK Havalimanına hosgeldiniz***** ");
        String sartlar="Yurtdisina cikis kuralları... \n"
                + "1- Herhangi bir siyasi yasaginizin bulunmaması gerekmektedir. \n"
                + "2-50 TL harc bedeli tam olarak yatırılmış olması gerekmektedir. \n"
                + "3-Gideceginiz ülkeye vizeniz bulunmalıdır.";
        String message="Yurtdisi sartlarindan hepsini saglamaniz gerekmektedir.!";
        System.out.println(sartlar);
        while (true) {            
            System.out.println("------------------------------------");
            System.out.println(message);
            System.out.println("------------------------------------");
            
            Yolcu yolcu =new Yolcu();
            System.out.println("Harc bedeli kontrol ediliyor. ");
            Thread.sleep(1000);
            System.out.println("***");
            Thread.sleep(1000);
            System.out.println("**");
            Thread.sleep(1000);
            System.out.println("*");
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor... ");
            Thread.sleep(1000);
            System.out.println("***");
            Thread.sleep(1000);
            System.out.println("**");
            Thread.sleep(1000);
            System.out.println("*");
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(1000);
            System.out.println("***");
            Thread.sleep(1000);
            System.out.println("**");
            Thread.sleep(1000);
            System.out.println("*");
            try {
                yolcu.vizeDurumuKontrol();
            }
            catch (VizeException e){
                e.printStackTrace();
                continue;
            }

            
            System.out.println("Islemlerınız tamamdır yurtdısına cıkabılırsınız... ");
            break;
        }
    }
}
