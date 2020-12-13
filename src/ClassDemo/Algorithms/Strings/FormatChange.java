package ClassDemo.Algorithms.Strings;

public class FormatChange {
    public static String changeFormatNumber(String number){
        for(int i = number.length()-1; i>=0; i--){
            if(Character.isDigit(number.charAt(i)) || number.charAt(i) == '-'){
                continue;
            }
            else return "INPUTERROR";
        }
        int numint = Integer.valueOf(number);
        if(numint > 32767 || numint <-32768) return "NODATA";
        StringBuffer sb = new StringBuffer();

        for(int i = 15; i>=0; i--){
            sb.append(numint >>> i & 1);
        }
        sb.append(',');
        numint = Integer.valueOf(number);
        for(int i =0; i<4-Integer.toHexString(numint).length(); i++){
            sb.append('0');

        }
        if(Integer.toHexString(numint).length() >4){
            sb.append(Integer.toHexString(numint).substring(Integer.toHexString(numint).length()-4));
            return sb.toString().toUpperCase();
        }
        sb.append(Integer.toHexString(numint));
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(changeFormatNumber("-1"));
    }
}
