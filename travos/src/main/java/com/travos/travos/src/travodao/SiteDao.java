package com.travos.travos.src.travodao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travos.travos.src.travomodels.Site;

public interface SiteDao extends JpaRepository<Site, Long> {

	public Site findByName(String name);
}
