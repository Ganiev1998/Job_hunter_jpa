package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.company.CompanyDTO;
import example.job_hunter_jpa.dto.company.CompanyResDTO;
import example.job_hunter_jpa.entity.Company;
import example.job_hunter_jpa.mapper.Mapper;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Data
@Component
public class CompanyMap implements Mapper<CompanyResDTO, Company, CompanyDTO> {
    @Override
    public CompanyResDTO toDTO(Company company) {
        return CompanyResDTO.builder().id(company.getId())
                .name(company.getName()).description(company.getDescription())
                .user_id(company.getUser_id()).address(company.getAddress())
                .created_year(company.getCreated_year()).web_link(company.getWeb_link())
                .email(company.getEmail()).build();
    }

    @Override
    public Company toENT(CompanyDTO e) {
        return Company.builder().name(e.getName()).description(e.getDescription())
                .user_id(e.getUser_id()).address(e.getAddress()).created_year(e.getCreated_year())
                .web_link(e.getWeb_link()).email(e.getEmail()).build();
    }

    @Override
    public List<CompanyResDTO> toDTOs(List<Company> companies) {
        return companies.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
