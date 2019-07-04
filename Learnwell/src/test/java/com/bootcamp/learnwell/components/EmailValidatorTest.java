package com.bootcamp.learnwell.components;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintValidatorContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmailValidatorTest {

	@Mock
	ConstraintValidatorContext context;
	
	EmailAddressValidator emailValidator = new EmailAddressValidator();
	
    @Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void email_has_correct_format() {
		
		assertTrue(emailValidator.isValid("andrea.bertieri@gmail.com", context));
	}
	@Test
	public void email_without_at() {
		assertFalse(emailValidator.isValid("andrea.bertierigmail.com", context));
	}
	@Test
	public void email_without_dot() {
		assertFalse(emailValidator.isValid("andrea.bertieri@gmailcom", context));
	}
	@Test
	public void email_has_two_dots() {
		assertTrue(emailValidator.isValid("andrea.bertieri@gmail.gov.co", context));
	}
	@Test
	public void email_has_chinese_characters() {
		assertFalse(emailValidator.isValid("汉字i@汉字.gov.co", context));
	}
	@Test
	public void email_has_puntuation_characters() {
		assertTrue(emailValidator.isValid("andreita_b912@hotmail.com", context));
	}

}
