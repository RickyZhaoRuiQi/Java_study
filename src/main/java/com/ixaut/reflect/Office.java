package com.ixaut.reflect;

class Office
{
	public static void main(String[] args)
	{
		//new �������� �Ǿ�̬�����࣬�ڱ���ʱ�̾���Ҫ�������п���ʹ�õ���
		
		//��̬���أ�������Ҫʱ�ټ���
		
		if("Word".equals(args[0]))
		{
			Word w = new Word();
			w.start();
		}
		if("Excel".equals(args[0]))
		{
			Excel e = new Excel();
			e.start();
		}
	}
}