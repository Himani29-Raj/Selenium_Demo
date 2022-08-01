import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Data


public class Student {
    private String name;
    private int roll_No;
}

class DemoLombok {
    public static void main(String[] args) {
//        Student s = new Student();
//        final Student s1 = Student.builder().name("Himani").roll_No(12).build();
    }
}