package vn.ntd.organizationservice.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import vn.ntd.organizationservice.dto.OrganizationDto;
import vn.ntd.organizationservice.entity.Organization;
import vn.ntd.organizationservice.mapper.OrganizationMapper;
import vn.ntd.organizationservice.repository.OrganizationRepository;
import vn.ntd.organizationservice.service.OrganizationService;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
