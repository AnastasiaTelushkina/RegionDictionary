package springboot.dictionary.region.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.dictionary.region.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> { }
