package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {

        boolean can_it_spell = false;

        for (int i = 0; i < tiles.length(); i++) {

            char tiles_character_check = tiles.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char word_character_check = word.charAt(j);

                if (word_character_check == tiles_character_check) {

                    int char_index_word = word.indexOf(word_character_check);

                    word = word.substring(0,char_index_word) + word.substring((char_index_word+1),word.length());
                }

            } //word string for loop
            if(word.length()==0){
                can_it_spell = true;

            }
        }   //tile string for loop
      return can_it_spell;
    }





    public static void main(String[] args){

        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("apple","applesauce"));
        System.out.println(!canSpell("impress", "pmiserghvf"));
        System.out.println(canSpell("21b!?3/","abcd1234!?/"));
        System.out.println(!canSpell("string with space", "stringwithnospace"));

    }
}
