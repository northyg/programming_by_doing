// https://programmingbydoing.com/a/numbers-and-math.html
// Every programming language has some kind of way of doing numbers and math.
// Don't worry, programmers lie frequently about being math geniuses when they really aren't.
// If they were math geniuses, they would be doing math, not writing ads and social network games to steal people's money. HAH!

public class NumbersAndMath
{
    public static void main( String[] args )
    {
        System.out.println( "I will now count my chickens:" );

        System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

        System.out.println( "Now I will count the eggs:" );

        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        // 5 < -2. False

        System.out.println( 3 + 2 < 5 - 7 );

        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        System.out.println( "Oh, that's why it's false." );

        System.out.println( "How about some more." );

        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }
}