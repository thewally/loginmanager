package nl.thewally.loginmanager.usermanagement.domain.domainrepository;

import nl.thewally.loginmanager.usermanagement.domain.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, String> {
    UserGroup findByGroupName(String groupName);

    UserGroup findById(Long id);
}
