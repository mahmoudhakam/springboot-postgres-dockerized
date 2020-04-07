package com.sample;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;

@Configuration
@Profile("test")
public class DevConfig
{

	@Bean
	@Primary
	public DataSource inMemoryDS() throws Exception
	{
		DataSource embeddedPostgresDS = EmbeddedPostgres.builder().start().getPostgresDatabase();
		return embeddedPostgresDS;
	}
}
