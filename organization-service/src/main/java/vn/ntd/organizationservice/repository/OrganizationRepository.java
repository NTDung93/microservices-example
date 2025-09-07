package vn.ntd.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ntd.organizationservice.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
