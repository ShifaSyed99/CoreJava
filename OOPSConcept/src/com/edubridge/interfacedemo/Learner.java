package com.edubridge.interfacedemo;

public class Learner implements Deletable {
	//provides runtime info of
	public boolean delete(Object o)
	{
		if(o instanceof Deletable)
			return true;
		return false;
	}

}
