原型模式的定义:
1.原型模式(Prototype Pattern)是指原型实例指定创建对象的种类，并且通过拷贝(克隆)这些原型创建新的对象。
2.调用者不需要知道任何创建细节，不调用构造函数。
3.属于创建型模式。

原型模式的适用场景:
1.类初始化消耗资源较多。
2.new产生的一个对象需要非常繁琐的过程(数据准备、访问权限等)。
3.构造函数比较复杂。
4.循环体中生产大量对象时，可读性下降。

举例：
1.BeanUtils.copyXXX();
2.JSON.parseObject();
3.Guava.copy工具类;
4.scope = "prototype"。

原型模式的优缺点：
缺点：
1.必须配备克隆(或者可拷贝)方法。
2.对克隆复杂对象或对克隆出的对象进行复杂改造时，易带来风险。
3.深拷贝、浅拷贝要运用得当。