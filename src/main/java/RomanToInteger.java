public class RomanToInteger {
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String cNext = (i+1==s.length())? "null": String.valueOf(s.charAt(i+1));
            switch (c){
                case 'I':{
                    if(cNext.equals("V")){
                        sum+=4;
                        i++;
                    }else if(cNext.equals("X")){
                        sum+=9;
                        i++;
                    }else {
                        sum+=1;
                    }
                    break;
                }
                case 'V':{
                    sum+=5;
                    break;
                }
                case 'X':{
                    if(cNext.equals("L")){
                        sum+=40;
                        i++;
                    }else if(cNext.equals("C")){
                        sum+=90;
                        i++;
                    }else {
                        sum+=10;
                    }
                    break;
                }
                case 'L':{
                    sum+=50;
                    break;
                }
                case 'C':{
                    if(cNext.equals("D")){
                        sum+=400;
                        i++;
                    }else if(cNext.equals("M")){
                        sum+=900;
                        i++;
                    }else {
                        sum+=100;
                    }
                    break;
                }
                case 'D':{
                    sum+=500;
                    break;
                }
                case 'M':{
                    sum+=1000;
                    break;
                }
                default: throw new IllegalArgumentException("Wrong input value");
            }
        }
        return sum;
    }
}
