package com.snapchat.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class snapchatControllerTest {
	
	private snapchatControllerInterface snapchatController;

	@Before
	public void setUp() throws Exception {
		snapchatController = new snapchatController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateProfileController() {
		snapchatController.createProfileController();
	}

	@Test
	public void testViewProfileController() {
		snapchatController.viewallProfileController();
	}

	@Test
	public void testViewallProfileController() {
		snapchatController.viewallProfileController();
	}

	@Test
	public void testSearchProfileController() {
		snapchatController.searchProfileController();
	}

	@Test
	public void testEditProfileController() {
		snapchatController.editProfileController();
	}

}
