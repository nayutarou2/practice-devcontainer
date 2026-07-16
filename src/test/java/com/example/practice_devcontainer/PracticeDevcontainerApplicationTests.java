package com.example.practice_devcontainer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfig.class) // テスト用Postgresコンテナを起動して接続
class PracticeDevcontainerApplicationTests {

	@Test
	void contextLoads() {
	}

}
