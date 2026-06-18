class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = hour * 30 + 0.5 * minutes;
        double min = 6 * minutes;

        double angle = Math.abs(hourAngle - min);
        
        return Math.min(360 - angle, angle);
        
    }
}