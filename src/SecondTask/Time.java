package SecondTask;

/* Решение задания IV из ClassesBlock */
public class Time {
    int seconds;
    int minutes;
    int hours;

    public Time(int seconds, int minutes, int hours) {
        if ((seconds >= 60) || (seconds < 0) || (minutes >= 60) || (minutes < 0) || (hours >= 24) || (hours < 0)){
            throw new NumberFormatException("Некорректный формат введённых данных");
        }
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if ((seconds >= 60) || (seconds < 0)){
            throw new NumberFormatException("Некорректный формат введённых данных");
        }
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if ((minutes >= 60) || (minutes < 0)){
            throw new NumberFormatException("Некорректный формат введённых данных");
        }
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if ((hours >= 24) || (hours < 0)){
            throw new NumberFormatException("Некорректный формат введённых данных");
        }
        this.hours = hours;
    }

    public void setTime(int seconds, int minutes, int hours){
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }
}
