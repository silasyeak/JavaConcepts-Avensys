package SpringPrac;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculator {
    private final DataProvider dataProvider;

    @Autowired
    public BusinessCalculator(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public int findMaxValue() {
        return Arrays.stream(dataProvider.provideData()).max().orElse(0);
    }
}

