package br.com.start.uni_clin.dtos.response;

import br.com.start.uni_clin.entities.Patient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientResponse {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public PatientResponse(Patient patient) {
        this.id = patient.getId();
        this.name = patient.getName();
        this.surname = patient.getSurname();
        this.email = patient.getEmail();
        this.phone = patient.getPhone();
    }
}
