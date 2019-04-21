package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by etsheep on 2019-4-20.
 */
public class FizzBuzzServiceTest {

    private static final int NO_CHANGE = 2;
    private static final String NO_CHANGE_EXPECTED = "2";
    private static final int FIZZ_NUMBER = 33;
    private static final String FIZZ_EXPECTED = "Fizz";
    private static final int BUZZ_NUMBER = 55;
    private static final String BUZZ_EXPECTED = "Buzz";
    private static final int FIZZ_BUZZ_NUMBER = 30;
    private static final String FIZZ_BUZZ_EXPECTED = "FizzBuzz";

    private final FizzBuzzSerivce fizzBuzzSerivce = new FizzBuzzSerivce();

    @Test
    public void getFizzBuzzTest(){
        assertAll("FizzBuzz",
                () -> assertEquals(NO_CHANGE_EXPECTED, fizzBuzzSerivce.getFizzBuzz(NO_CHANGE)),
                () -> assertEquals(FIZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzz(FIZZ_NUMBER)),
                () -> assertEquals(BUZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzz(BUZZ_NUMBER)),
                () -> assertEquals(FIZZ_BUZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzz(FIZZ_BUZZ_NUMBER)),
                () -> assertNotEquals(FIZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzz(BUZZ_NUMBER))
        );
    }

    @Test
    public void getFizzBuzzStage2Test(){
        int fizzStage2Number = 37;
        String fizzStage2Expected = "Fizz";
        int buzzStage2Number = 59;
        String buzzStage2Expected = "Buzz";
        int fizzBuzzStage2Number = 53;
        String fizzBuzzStage2Expected = "FizzBuzz";

        assertAll("FizzBuzzStage2",
                () -> assertEquals(NO_CHANGE_EXPECTED, fizzBuzzSerivce.getFizzBuzzStage2(NO_CHANGE)),
                () -> assertEquals(FIZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzzStage2(FIZZ_NUMBER)),
                () -> assertEquals(BUZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzzStage2(BUZZ_NUMBER)),
                () -> assertEquals(FIZZ_BUZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzzStage2(FIZZ_BUZZ_NUMBER)),
                () -> assertNotEquals(FIZZ_EXPECTED, fizzBuzzSerivce.getFizzBuzzStage2(BUZZ_NUMBER)),

                () -> assertEquals(fizzStage2Expected, fizzBuzzSerivce.getFizzBuzzStage2(fizzStage2Number)),
                () -> assertEquals(buzzStage2Expected, fizzBuzzSerivce.getFizzBuzzStage2(buzzStage2Number)),
                () -> assertEquals(fizzBuzzStage2Expected, fizzBuzzSerivce.getFizzBuzzStage2(fizzBuzzStage2Number))
        );
    }
}
