package type;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TypeInferenceShould {

    @Test
    void works() {
        int before = 1;
        var after = 2;

        //  Illegal :
        // var nullObject = null;
        // var i;
        // return type
        // global variable
        // ...

        // Dangerous :
        var obj = Application.doProcess();  // not with IntelliJ
        var badList = new ArrayList<>();
        // var goodList = new ArrayList<String>();
        // Stream

        // Good :
        var classWithAVeryLongName = new AClassWithAVeryLongName();
    }
}
