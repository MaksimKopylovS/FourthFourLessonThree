package fabrika;

import fabrika.fabrika_f.Noutbook;
import fabrika.interfcace_f.Memory;
import fabrika.interfcace_f.Monitor;
import fabrika.interfcace_f.Procesor;

public class Info {
    private  Monitor monitor;
    private  Procesor procesor;
    private  Memory memory;

    public void Information(Noutbook noutbook) {
        this.monitor = noutbook.createMonitor();
        this.procesor = noutbook.createProcesor();
        this.memory = noutbook.createMemory();
    }



}
