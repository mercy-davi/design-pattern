单例模式总结:
1、私有化构造器
2、保证线程安全
3、延迟加载
4、防止序列化和反序列化破坏单例
5、防御反射攻击单例

优点:
1、在内存中只有一个实例，全局唯一，减少了内存开销。
2、可以避免对资源的多重占用。
3、设置全局访问点，严格控制访问。

缺点:
1、没有接口，扩展困难。
2、如果要扩展单例对象，只有修改代码，没有其他途径，不符合开闭原则。