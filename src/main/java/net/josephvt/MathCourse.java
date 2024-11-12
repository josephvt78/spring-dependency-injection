package net.josephvt;

import org.springframework.stereotype.Component;

@Component
public class MathCourse implements Course{
    public int getStudentCount() {
        return 40;
    }
}
