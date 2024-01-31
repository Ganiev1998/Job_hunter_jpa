package example.job_hunter_jpa.dto.company;

import example.job_hunter_jpa.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private String name;
    private String description;
    private Users user_id;
    private String address;
    private Date created_year;
    private String web_link;
    private String email;
}
