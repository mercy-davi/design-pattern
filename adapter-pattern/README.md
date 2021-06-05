目标：
1、学习通过适配器模式，优雅地解决代码功能的兼容问题。

适配器模式的定义：
1、适配器模式（Adapter Pattern）是指将一个类的接口转换成客户期望的另一个接口，
使原本的接口不兼容的类可以一起工作。
2、属于结构型设计模式。

适配器模式的适用场景：
1、已经存在的类，它的方法和需求不匹配（方法结果相同或相似）的情况。
2、适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能类似而接口
不相同情况下的解决方案。

适配器的优缺点：
优点：
1、能提高类的透明性和复用，现有的类复用但不需要改变。
2、目标类和适配器类解耦，提高程序的扩展性。
3、在很多业务场景中符合开闭原则。
缺点：
1、适配器编写过程需要全面考虑，可能会增加系统的复杂性。
2、增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。