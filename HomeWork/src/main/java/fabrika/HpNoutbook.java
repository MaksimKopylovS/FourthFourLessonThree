package fabrika;

import fabrika.calss_f.HpMonitor;
import fabrika.calss_f.IntelProcessor;
import fabrika.calss_f.Patriot;
import fabrika.fabrika_f.Noutbook;
import fabrika.interfcace_f.Memory;
import fabrika.interfcace_f.Monitor;
import fabrika.interfcace_f.Procesor;

public class HpNoutbook implements Noutbook {

    public void HpNoutbook(){
        System.out.println("Создаём ноутбук HP");
    }

    @Override
    public Memory createMemory() {
        System.out.println("Память Patriot");
        return new Patriot();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Монитор HP");
        return new HpMonitor();
    }

    @Override
    public Procesor createProcesor() {
        System.out.println("Процессор Intel");
        return new IntelProcessor();
    }
}
