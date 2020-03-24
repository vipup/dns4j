/*
 * Copyright (C) 2010 - Lorenzo Ingrilli' - info@lorenzoingrilli.it
 * 
 * Licensed under LGPL3 only.
 * See http://www.gnu.org/licenses/lgpl.html
 */
package it.lorenzoingrilli.dns4j.protocol.impl;

import it.lorenzoingrilli.dns4j.protocol.Message;

public class TestCase {
	
	private int id;
	private String b64;
	private Message msg;
		
	public TestCase() {
	}

	@Override
	public String toString() {
		return "TestCase(id="+id+", b64="+b64+", message="+msg+")";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB64() {
		return b64;
	}
	public void setB64(String b64) {
		this.b64 = b64;
	}
	public Message getMsg() {
		return msg;
	}
	public void setMsg(Message m) {
		this.msg = m;
	}
}