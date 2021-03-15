package com.scheible.moduliths.test.enablejparepositories.first;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstRepository extends JpaRepository<FirstEntity, Long> {
}
