class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
       
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE, day);
            c.set(Calendar.MONTH, month - 1);
            c.set(Calendar.YEAR, year);
            String dayOfWeek = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;

            
                    
    }

}
