package fabrika.calss_f;

import fabrika.interfcace_f.Monitor;

public class ACERmonitor implements Monitor {
    @Override
    public void screenResolition() {
        System.out.println("650х480");
    }
}
