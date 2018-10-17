/*
 *泛型类
 * class GeneralType<Type>
 * {...}
 *
 * 泛型方法
 * class GeneralMethod
 * {
 *      <Type> void printClassName(Type object)
 *      {
 *          System.out.println(object.getClass().getName());
 *      }
 * }
 *
 * 使用通配符
 * class GeneralType<Type>
 * {...}
 * class ShowType
 * {
 *      public void show(GeneralType<?> o)
 *      {
 *          System.out.println(o.getObj().getClass().getName());
 *      }
 * }
 *
 */

public class Generics
{
}
