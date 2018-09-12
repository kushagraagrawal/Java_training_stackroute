public class StudentGrades {
    public float getAverage(int[] marks) {
        long sum = 0;
        long size = marks.length;
        for(int i=0;i<size;i++)
            sum += marks[i];
        return ((float)sum)/((float)size);
    }

    public int getMinimum(int[] marks) {
        int minimumelement = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i] < minimumelement)
                minimumelement = marks[i];

        }
        return minimumelement;

    }

    public int getMaximum(int[] marks) {
        int maximumlement = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i] > maximumlement)
                maximumlement = marks[i];

        }
        return maximumlement;
    }
}
