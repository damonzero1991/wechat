package com.damonzero1991.wechat.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by damonzero1991 on 17/8/9.
 */

public class DateUtil {

    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String HM_PATTERN = "HH:mm";
    public static final String YMD_PATTERN = "yyyy-MM-dd";

    /**
     * long类型转换成字符串
     *
     * @param timeMillis
     *            毫秒时间
     * @return
     */
    public static String formatDateTime(long timeMillis) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        return simpleDateFormat.format(timeMillis);
    }

    public static String formatDateTime(long timeMillis, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(timeMillis);
    }
    public static String formatDateTime(String timeMillis, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(timeMillis);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return simpleDateFormat.format(date);
    }

    public static Date parseDate(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String parseDateToStr(String date,String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        SimpleDateFormat newSimpleDateFormat = new SimpleDateFormat(pattern);
        try {
            Date formatDate =  simpleDateFormat.parse(date);
            String dateStr = newSimpleDateFormat.format(formatDate);
            return dateStr;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseDate(String date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String getCurrentTime() {
        return getCurrentTime(DEFAULT_PATTERN);
    }

    /**
     * 获取当前时间
     *
     * @param pattern
     *            时间格式
     * @return
     */
    public static String getCurrentTime(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取当前日期，时分秒均为00
     *
     * @return
     */
    public static String getCurrentDate() {
        return getCurrentDate(DEFAULT_PATTERN);
    }

    /**
     * 获取当前日期时间，秒为00
     *
     * @return
     */
    public static String getCurrentDateTime() {
        return getCurrentDateTime(DEFAULT_PATTERN);
    }

    /**
     * 明天的日期，时分秒为00
     *
     * @return
     */
    public static String getNextDate() {
        Calendar calendar = Calendar.getInstance();
        return getNextDate(calendar);
    }

    /**
     * 后天的日期，时分秒为00
     *
     * @return
     */
    public static String getThreeDate() {
        Calendar calendar = Calendar.getInstance();
        return getThreeDate(calendar);
    }

    /**
     * 获取calendar第二天的日期，时分秒为00
     *
     * @param calendar
     * @return
     */
    public static String getNextDate(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, 1);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取date第二天的日期，时分秒为：00
     *
     * @param date
     *            yyyy-MM-dd HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static String getNextDate(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(date));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, 1);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取calendar第三天的日期，时分秒为00
     *
     * @param calendar
     * @return
     */
    public static String getThreeDate(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, 2);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取当前日期，时分秒均为00
     *
     * @return
     */
    public static String getCurrentDate(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取当前日期时间，秒为00
     *
     * @return
     */
    public static String getCurrentDateTime(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 获取以往一周的日期，时分秒为00
     *
     * @return
     */
    public static String getPastWeekDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, -7);
        return simpleDateFormat.format(calendar.getTime());
    }
    /**
     * 获取以往一月的日期，时分秒为00
     *
     * @return
     */
    public static String getPastMonthDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MONTH,-1);
        return simpleDateFormat.format(calendar.getTime());
    }

    /**
     * 把指定日期的时分秒设置为:00
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String getStandardDate(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(date));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return simpleDateFormat.format(calendar.getTime());
    }
    /**
     * 获取4小时之前的时间
     * @return
     */
    public static String getAfterQeuryDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY)-4);
        return simpleDateFormat.format(calendar.getTime());
    }
    /**
     * 判断两个日期之间相隔的天数
     */
    public static long checkDateDiff(String date1,String date2){
        Date d1=parseDate(date1);
        Date d2=parseDate(date2);
        long n1 = d1.getTime();
        long n2 = d2.getTime();
        long diff = Math.abs(n2 - n1);
        diff /= 3600 * 1000 * 24;
        return diff;
    }

    /**
     * 判断两个日期之间相隔的天数
     */
    public static long checkDateDiff2(String date1,String date2){
        Date d1=parseDate(date1);
        Date d2=parseDate(date2);
        long n1 = d1.getTime();
        long n2 = d2.getTime();
        long diff = n2 - n1;
        diff /= 3600 * 1000 * 24;
        return diff;
    }

    /**
     * 比较当前时间与输入时间，输出时间：
     * 1.当前时间与输入时间都在当天，输出HH:mm
     * 2.当前时间与输入时间不在当天，
     * 如果输入时间为昨天 ，输出为昨天 hh:mm
     * 如果输入时间早于昨天，输出为yy-MM-dd
     * @param inputDateStr
     * @return
     */
    public static String getCurrentDateCompareInputDate(String inputDateStr){
        String reusltTime = inputDateStr;
        String Hms = " 00:00:00";
        String currentTimeStr = getCurrentDate(YMD_PATTERN);
        String inputTimeStr = parseDateToStr(inputDateStr, YMD_PATTERN);
        long diff = checkDateDiff(inputTimeStr+Hms, currentTimeStr+Hms);
        System.out.println("diff="+diff);
        if(diff < 1){//1.当前时间与输入时间都在当天，输出HH:mm
            reusltTime = "今天    " ;
            reusltTime =  parseDateToStr(inputDateStr, HM_PATTERN);
        }else if(diff >= 1 && diff < 2){
            reusltTime = "昨天    " ;
            reusltTime +=  parseDateToStr(inputDateStr, HM_PATTERN);
        }else if(diff >= 2 && diff < 3){
            reusltTime = "前天    " ;
            reusltTime +=  parseDateToStr(inputDateStr, HM_PATTERN);
        }else{
            reusltTime =  inputDateStr;
        }
        System.out.println("reusltTime="+reusltTime);
        return reusltTime;
    }

}
