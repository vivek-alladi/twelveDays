class TwelveDay {
    String verse(int verseNumber) {
        switch(verseNumber){
            case 1: return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
            case 2: return "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 3: return "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 4: return "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 5: return "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 6: return "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 7: return "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
                    "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            case 8: return "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 9: return "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
                    " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 10: return "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                    " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 11: return "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                    "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                    "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            case 12: return "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                    "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        }
        return "hello";
    }

    String verses(int startVerse, int endVerse) {
        String dayWise = new String();
        for(int i=startVerse; i<endVerse;i++){
            dayWise+= verse(i) + "\n";
        }
        dayWise=dayWise+verse(endVerse);
        return dayWise;
    }

    String sing() {

        String song = new String();
        for(int i=0;i<11;i++){
            song = song + verse(i+1) +"\n";
        }
        song=song+verse(12);
        return song;
    }
}


public class twelveDays {
    public static void main(String[]args) {
        TwelveDay td =new TwelveDay();
        System.out.println(td.verse(2));
        System.out.println(td.verses(4,6));
        System.out.println(td.sing());
    }
}
