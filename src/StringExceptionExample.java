public class StringExceptionExample {

    public int convertStringToInt(String inputValue) throws CustomStringException {
        int outputValue = 0;
        try {
            if ((inputValue.charAt(inputValue.length() - 1)) == 'f') {
                float f = Float.parseFloat(inputValue);
                int x = (int) f;
                outputValue = x;
            } else if (inputValue.contains(".")) {
                double d = Double.parseDouble(inputValue);
                int y = (int) d;
                outputValue = y;
            } else {
                outputValue = Integer.parseInt(inputValue);
            }
        } catch (RuntimeException re) {
            try{
                throw new CustomStringException("String contains all alphabets....");
            }catch (CustomStringException e){
                System.out.println(e.toString());
            }

        }
        return outputValue;
    }

    public static void main(String[] args) {
        StringExceptionExample sc = new StringExceptionExample();

        try {
            int value = sc.convertStringToInt("23");
            System.out.println("Value converted: " + value);
            int value1 = sc.convertStringToInt("45.67");
            System.out.println("Value converted: " + value1);
            int value2 = sc.convertStringToInt("test");
            System.out.println("Value converted: " + value2);
            int value3 = sc.convertStringToInt("123f");
            System.out.println("Value converted: " + value3);
        } catch (CustomStringException e) {
            System.out.println(e.toString());
        }
    }
}


