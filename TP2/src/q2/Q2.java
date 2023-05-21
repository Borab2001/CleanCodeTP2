package q2;

public class Q2 {
    public static void main(String[] args) {
        LengthCalculator calculator = new LastNameLengthCalculator();
        int myNameLength = calculator.calculate("BOBO");
        System.out.println(myNameLength);

        LengthCalculator firstNameCalculator = new LengthCalculator() {
            @Override
            public int calculate(String string) {
                return string.length();
            }
        };
        int myFirstNameLength = firstNameCalculator.calculate("BORA");
        System.out.println(myFirstNameLength);

        LengthCalculator cityNameCalculator1 = (String cityName) -> {return cityName.length();};
        LengthCalculator cityNameCalculator2 = (cityName) -> {return cityName.length();};
        LengthCalculator cityNameCalculator3 = cityName -> {return cityName.length();};
        LengthCalculator cityNameCalculator4 = cityName -> cityName.length();

        int myCityNameLength = cityNameCalculator4.calculate("PARIS");
        System.out.println(myCityNameLength);

    }
}
