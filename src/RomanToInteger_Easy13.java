public class RomanToInteger_Easy13 {
    public static int romanToInt(String s){
        int res=0;
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'M':
                    res+=1000;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'C':
                    if(i+1 != s.length()) {
                        if (s.charAt(i + 1) == 'D'){
                            res += 400;
                            i++;
                            break;
                        }
                        else if (s.charAt(i + 1) == 'M'){
                            res += 900;
                            i++;
                            break;
                        }
                    }
                    res+=100;
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'X':
                    if(i+1 != s.length()) {
                        if (s.charAt(i + 1) == 'L'){
                            res += 40;
                            i++;
                            break;
                        }
                        else if (s.charAt(i + 1) == 'C'){
                            res += 90;
                            i++;
                            break;
                        }
                    }
                    res+=10;
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'I':
                    if(i+1 != s.length()) {
                        if (s.charAt(i + 1) == 'V'){
                            res += 4;
                            i++;
                            break;
                        }
                        else if (s.charAt(i + 1) == 'X'){
                            res += 9;
                            i++;
                            break;
                        }
                    }
                    res+=1;
                    break;
                default:
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //String target = "IX";
        String target = "MCMXCIV";
        //String target = "III";
        //String target = "LVIII";
        System.out.println(romanToInt(target));
        System.out.println("Hello World!");
    }
}
