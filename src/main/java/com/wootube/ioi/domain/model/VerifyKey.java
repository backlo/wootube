package com.wootube.ioi.domain.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class VerifyKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String verifyKey;

	public VerifyKey(String inActiveUserEmail, String key) {
		this.email = inActiveUserEmail;
		this.verifyKey = key;
	}
}