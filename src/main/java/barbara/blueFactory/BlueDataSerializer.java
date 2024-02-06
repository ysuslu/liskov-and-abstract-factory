package barbara.blueFactory;

import barbara.abstractFactory.AbstractDataHolder;
import barbara.abstractFactory.AbstractDataSerializer;

public class BlueDataSerializer extends AbstractDataSerializer {
    @Override
    public String serialize(AbstractDataHolder holder) {
        return "abstract";
    }
}
