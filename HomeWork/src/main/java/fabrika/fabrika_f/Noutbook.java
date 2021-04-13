package fabrika.fabrika_f;

import fabrika.interfcace_f.Memory;
import fabrika.interfcace_f.Monitor;
import fabrika.interfcace_f.Procesor;

public interface Noutbook {
    Memory createMemory();
    Monitor createMonitor();
    Procesor createProcesor();
}
