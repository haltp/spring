package emp;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data; //앞으로 이것만 추가하면 source에 set get tostring 추가 안해도 됨
import lombok.NoArgsConstructor;



@Data  //다 합친게 Data 각각 뜻 알아오기
/*@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor*/
@Builder                    //생성자 대체 가능
@NoArgsConstructor          //인수가 없는 빈 생성자
@AllArgsConstructor         //모든 생성자

public class EmpVO {
	private String employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private String salary;
	private String commission_pct;
	private String manager_id;
	private String department_id;
	
	
}
