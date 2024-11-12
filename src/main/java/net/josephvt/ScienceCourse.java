package net.josephvt;

import org.springframework.stereotype.Component;

@Component
public class ScienceCourse implements Course {
    public int getStudentCount() {
        return 25;
    }
}
