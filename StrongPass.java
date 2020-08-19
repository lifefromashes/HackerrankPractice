// Return the minimum number of characters to make the password strong

static int minimumNumber(int n, String password) {
         int lowerCase=0;
         int upperCase=0;
         int number=0; 
         int specialChar=0;
        int sum=0;
        
        String lowercase = ".*[a-z]+.*";
        String uppercase = ".*[A-Z]+.*";
        String num = ".*[0-9]+.*";
        String specialchar = ".*[-!@#$%^&*()+]+.*"; 
        //Regex for pattern matching
        
        if(!(password.matches(lowercase)))
            lowerCase++; 
        //if there is no match to a lowercase,"lc" is increased by 1.
    
        if(!(password.matches(uppercase)))
            upperCase++; 
        //if there is no match to an uppercase,"uc" is increased by 1.
    
        if(!(password.matches(num)))
            number++; 
        //if there is no match to a number,"no" is increased by 1.
    
        if(!(password.matches(specialchar)))
            specialChar++; 
        //if there is no match to a specialCharacter,"sc" is increased by 1.
        
        
        sum=lowerCase + upperCase + number + specialChar;
        
        return (sum>(6-n))?sum:(6-n);
    }