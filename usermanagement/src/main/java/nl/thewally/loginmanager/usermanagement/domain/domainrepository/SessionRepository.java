package nl.thewally.loginmanager.usermanagement.domain.domainrepository;

import nl.thewally.loginmanager.usermanagement.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
    Session findBySessionId(String sessionId);
}
