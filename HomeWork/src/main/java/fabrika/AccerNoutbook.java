package fabrika;

import fabrika.calss_f.ACERmonitor;
import fabrika.calss_f.AMDprocasor;
import fabrika.calss_f.SeageteMemory;
import fabrika.fabrika_f.Noutbook;
import fabrika.interfcace_f.Memory;
import fabrika.interfcace_f.Monitor;
import fabrika.interfcace_f.Procesor;

public class AccerNoutbook implements Noutbook {
    @Override
    public Memory createMemory() {
        System.out.println("Память Seagate");
        return new SeageteMemory();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Монитор ACER");
        return new ACERmonitor();
    }

    @Override
    public Procesor createProcesor() {
        System.out.println("Процессор AMD");
        return new AMDprocasor();
    }
}
