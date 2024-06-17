package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 杨洋
 * @date 2024/5/22
 */
@Component
@ConfigurationProperties(prefix = "my.config")
public class MyConfigProperties {

    private String fileType;

	public MyConfigProperties() {
	}

	public MyConfigProperties(String fileType) {
		this.fileType = fileType;
	}


	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
