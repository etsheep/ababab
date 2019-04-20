package service;

/**
 * Created by etsheep on 2019-4-20.
 */
public class FizzBuzzSerivce {

    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private static final String FIZZ_String = "Fizz";
    private static final String BUZZ_String = "Buzz";

    /**
     * get the FizzBuzz game number(or String)
     * @param playNumber
     * @return the String convert by the playNumber
     */
    public String getFizzBuzz(int playNumber){
        checkRange(playNumber);
        StringBuilder result = new StringBuilder();
        if (canDivisible(playNumber, FIZZ_NUMBER)){
            result.append(FIZZ_String);
        }
        if (canDivisible(playNumber, BUZZ_NUMBER)){
            result.append(BUZZ_String);
        }
        return result.length() > 0 ? result.toString() : String.valueOf(playNumber);
    }

    /**
     * get the FizzBuzz stage 2 game number(or String)
     * @param playNumber
     * @return the String convert by the playNumber
     */
    public String getFizzBuzzStage2(int playNumber){
        checkRange(playNumber);
        StringBuilder result = new StringBuilder();
        if (canDivisible(playNumber, FIZZ_NUMBER) || hasNumber(playNumber, FIZZ_NUMBER)){
            result.append(FIZZ_String);
        }
        if (canDivisible(playNumber, BUZZ_NUMBER) || hasNumber(playNumber, BUZZ_NUMBER)){
            result.append(BUZZ_String);
        }
        return result.length() > 0 ? result.toString() : String.valueOf(playNumber);
    }

    /**
     * check the playNumber can be divided by conditionNumber
     * @param playNumber  dividend
     * @param conditionNumber  divisor
     * @return  true if playNumber can be divided by conditionNumber otherwise false
     */
    private boolean canDivisible(int playNumber, int conditionNumber){
        if (conditionNumber == 0){
            throw new IllegalArgumentException("playNumber must not be zero");
        }
        return 0 == playNumber % conditionNumber;
    }

    /**
     * check the playNumber has conditionNumber or not
     * @param playNumber
     * @param conditionNumber
     * @return true if playNumber conditionNumber in it otherwise false
     */
    private boolean hasNumber(int playNumber, int conditionNumber){
        return String.valueOf(playNumber).indexOf(String.valueOf(conditionNumber)) > -1;
    }

    /**
     * check the playNumber is in range of 1 to 100
     * @param playNumber
     */
    private void checkRange(int playNumber){
        if (playNumber < 0 || playNumber > 100){
            throw new IllegalArgumentException("playNumber must be 0 to 100");
        }
    }
}
