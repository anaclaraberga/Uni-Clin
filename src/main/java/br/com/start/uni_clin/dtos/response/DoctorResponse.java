package br.com.start.uni_clin.dtos.response;
import br.com.start.uni_clin.entities.Doctor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String crm;

    public DoctorResponse(Doctor doctor) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.email = doctor.getEmail();
        this.phone = doctor.getPhone();
        this.crm = doctor.getCrm();
    }
}
