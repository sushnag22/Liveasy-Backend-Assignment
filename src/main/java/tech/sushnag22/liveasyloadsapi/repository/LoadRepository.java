package tech.sushnag22.liveasyloadsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.sushnag22.liveasyloadsapi.model.Load;

public interface LoadRepository extends JpaRepository<Load, Integer> {
}