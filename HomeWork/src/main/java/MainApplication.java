import builder.class_b.Brand;
import builder.class_b.NoutBook;
import fabrika.AccerNoutbook;
import fabrika.HpNoutbook;
import fabrika.Info;
import fabrika.calss_f.AMDprocasor;
import fabrika.calss_f.HpMonitor;
import fabrika.calss_f.SeageteMemory;
import prototype.MacBook;
import singleton.singleton_leazy.LeazyNoutSingleton;
import singleton.singleton_s.NoutSingleton;
import singleton.singleton_thread.ThreadNoutSingleton;

public class MainApplication {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Патерн Фарбика
        {
            AccerNoutbook accerNoutbook = new AccerNoutbook();
            HpNoutbook hpNoutbook = new HpNoutbook();
            Info info = new Info();
            info.Information(accerNoutbook);
            info.Information(hpNoutbook);
        }
        //Патерн Строитель
        {
            NoutBook noutBook = new NoutBook.NoutbookBuilder(new HpMonitor(), new SeageteMemory())
                    .withBuilder(new Brand("HP"))
                    .withProcessor(new AMDprocasor())
                    .build();
        }
        //Патерн Singleton
        {
            NoutSingleton.getInstance();
            LeazyNoutSingleton.getInstance();
            ThreadNoutSingleton.getInstance();
        }
        //Патерн Prototype
        {
            MacBook macBook = new MacBook("Intel", "1024", "100 руб.");
            MacBook macBookClone = macBook.clone();
            macBookClone.setProcessor("AMD");
            System.out.println(macBook.getProcessor() + " " + macBookClone.getProcessor());

        }

    }
}
