public class DateThree {
    private int day=0;
    private int month=0;
    private int year=0;

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDate(int year,int month,int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    private void setDay(int day) {
        if (!valiteDay(day)){
            System.out.println("dia invalido");
            return;
        }
            this.day=day;
    }
    private void setMonth(int month) {
        if (invaliteMonth(month)){
            System.out.println("invalite month");
            return;
        }
        this.month=month;
    }
    private void setYear(int year) {
        if (invaliteYear(year)){
            System.out.println("invalite year");
            return;
        }
        this.year=year;
    }
    private boolean invaliteYear(int year){
        final int minYear=1000;
        final int maxYear=10000;
       return year > maxYear || year < minYear;
    }
    private boolean invaliteMonth(int month){
        final int minMonth=1;
        final int maxMonth=12;
        return month < minMonth || month > maxMonth;
    }
    private boolean valiteDay(int day){
       final int [] mDay={28,29,30,31};
       final int minDay=1;
       final boolean mMd2 = day <= mDay[2];
       final boolean mMd3 = day <= mDay[3];
       if (day < minDay)
           return false;
        if (month == 2) {
            if (isBisiesto())
                    return day <= mDay[1];
            return day <= mDay[0];
        }
        if (month % 2 == 0){
            if (month < 7 && month > 2)
                return mMd2;
            return mMd3;
        }
        if (month <= 7)
            return mMd3;
        return mMd2;

    }
    private boolean isBisiesto(){
        if (year % 4 == 0){
            if (year % 100 == 0)
                    return year % 400 == 0;
            return true;
        }
        return false;
    }
    public void print(){
        if ( invaliteYear(year) && invaliteMonth(month) && !valiteDay(day)){
            System.out.println("data erronea");
            return;
        }
        System.out.printf("date one : %d \\ %d \\ %d \n",day,month,year);


    }
}
