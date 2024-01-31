package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.company.CompanyDTO;
import example.job_hunter_jpa.dto.company.CompanyResDTO;
import example.job_hunter_jpa.entity.Company;
import example.job_hunter_jpa.mapper.impl.CompanyMap;
import example.job_hunter_jpa.repository.CompanyRepository;
import example.job_hunter_jpa.service.CompanyService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class CompanyServiceimpl implements CompanyService {
    private final CompanyRepository repository;
    private final CompanyMap mapper;
    @Override
    public CompanyResDTO getById(Integer id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<CompanyResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public CompanyResDTO create(CompanyDTO companyDTO) {
        return mapper.toDTO(repository.save(mapper.toENT(companyDTO)));
    }

    @Override
    public CompanyResDTO update(Integer id, CompanyDTO companyDTO) {
        Company company = repository.getReferenceById(id);
        company.setName(companyDTO.getName());
        company.setDescription(companyDTO.getDescription());
        company.setUser_id(companyDTO.getUser_id());
        company.setAddress(companyDTO.getAddress());
        company.setCreated_year(companyDTO.getCreated_year());
        company.setWeb_link(companyDTO.getWeb_link());
        company.setEmail(companyDTO.getEmail());
        return mapper.toDTO(repository.save(company));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
