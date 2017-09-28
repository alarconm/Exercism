class RaindropConverter {

    private int number;

    String convert(int number) {

        String rainDrop = "";

        if (number % 3 == 0) {
            rainDrop += "Pling";
        } if (number % 5 == 0) {
            rainDrop += "Plang";
        } if (number % 7 == 0) {
            rainDrop += "Plong";
        }
          if (rainDrop.equals("")) {
              return Integer.toString(number);
          }

        return rainDrop;
    }

}
