import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Game {

    private static final Integer[] DIGITS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    private Integer[] _secret = {null,null,null,null};


    Game(){
        Integer[] digits = DIGITS.clone();
        List<Integer> digitsList = Arrays.asList(digits);

        Collections.shuffle(digitsList);

        for(int counter = 0; counter< _secret.length; counter++){
            _secret[counter]=digitsList.get(counter);
        }
    }

    public String getSecret(){

        StringBuilder resoult = new StringBuilder();

        for(Integer secretDigit: _secret){
            resoult.append(secretDigit);
        }

        return resoult.toString();
    }
}
