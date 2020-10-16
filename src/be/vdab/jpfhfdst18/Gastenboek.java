package be.vdab.jpfhfdst18;

import java.io.Serializable;
import java.util.ArrayList;

public class Gastenboek implements Serializable {
    private static final long serialVersion = 1l;
    private final ArrayList<GastenboekEntry> gastenboek = new ArrayList<>();

    public void toevoegen(GastenboekEntry entry) {
        gastenboek.add(entry);
    }

    public ArrayList<GastenboekEntry> getGastenboek() {
        return gastenboek;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var index = gastenboek.size() - 1; index >= 0; index--) {
            builder.append(gastenboek.get(index)).append("\n");
        }
        return builder.toString();
    }
}
