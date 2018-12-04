package com.ixaut.reflect;

public class OfficeBetter
{
	public	static void main(String[] args)
	{
		try
		{
			//��̬�����࣬������ʱ�̼���
			Class c = Class.forName(args[0]);
			//ͨ�������ͣ���������Ķ���
			OfficeAble oa = (OfficeAble)c.getDeclaredConstructor().newInstance();
			oa.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}