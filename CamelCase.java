static int camelcase(String s) {
        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == letter.toUpperCase()) {
                count++;
            }
        }

        return count;


    }
