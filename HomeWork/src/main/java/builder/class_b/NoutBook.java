package builder.class_b;

import fabrika.interfcace_f.Memory;
import fabrika.interfcace_f.Monitor;
import fabrika.interfcace_f.Procesor;


public final class NoutBook {
    private final Monitor monitor;
    private final Memory memory;
    private final Procesor procesor;
    private final Brand brand;

    public NoutBook(NoutbookBuilder noutbookBuilder) {
        this.monitor = noutbookBuilder.monitor;
        this.memory = noutbookBuilder.memory;
        this.procesor = noutbookBuilder.procesor;
        this.brand = noutbookBuilder.brand;
    }

    public static class NoutbookBuilder {
        private final Monitor monitor;
        private final Memory memory;
        private Procesor procesor;
        private Brand brand;

        public NoutbookBuilder(Monitor monitor, Memory memory) {
            this.monitor = monitor;
            this.memory = memory;
        }

        public NoutbookBuilder withProcessor(Procesor procesor) {
            this.procesor = procesor;
            return this;
        }

        public NoutbookBuilder withBuilder(Brand brand) {
            this.brand = brand;
            return this;
        }

        public NoutBook build() {
            return new NoutBook(this);
        }
    }


}
