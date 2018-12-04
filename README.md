这是Java学习中的一些代码以及重要的知识点

- 1 2018-10-16 熟悉idea中github使用
- 2 2018-10-17 添加.ignore插件，忽略不必要的文件
- 3 2018-10-17 添加覆盖隐藏、抽象类等学习注释
- 4 2018-10-22 添加类初始化
- 5 2018-10-26 学习Java疯狂讲义第一张，了解Java历史和基础只是
    - Java ME：只要用于控制移动设备和信息家电等有限存储设备。
    - Java SE：整个Java技术的核心和基础，它是ME和EE编程的基础。
    - Java EE：Java技术中应用最为广泛的部分，EE提供了企业应用开发相关的完整解决方案。
    - JDK：Java SE Development Kit，Java标准开发包，它提供了编译、运行Java程序所需要的各种工具和资源、包括Java编译器、Java运行时环境、以及常用的类库等。
    - JRE：Java运行时环境，它包含了JVM（Java虚拟机）还有类加载器、字节码校验器以及大量的基础类库。
- 6 2018-10-30 Java集合，HashSet和TreeSet（无序和有序）
- 7 2018-11-6 初识图形用户界面
    - JFC与Swing。JFC（Java Foundation Classes）
    - 关于GUI组建和服务的完整集合
    - 作为Java SE的一个有机部分，主要包含5个方面
    1. AWT
    2. Java2D
    3. Accessibility
    4. Drag & Drop
    5. Swing
    
    - **Swing**
    1. JFC的一部分
    2. 提供按钮、窗口、表格等所有组件
    3. 纯Java组件（完全用Java所写）
    
---

- Java反射

    1. Class类
        - 在面向对象的世界里，万事万物皆对象。java语言中，静态成员和普通数据类型不是对象。类是对象吗？
            - 类是对象，类是java.lang.Class类的实例对象（java中所有类都是Class的实例）
            - 这个对象如何表示？(ClassDemo1)
    
        - Class.forName("类的全称")
            - 不仅表示了类的类类型，还代表了动态加载类
            - 区分编译、运行
            - 编译时刻加载类是静态加载类、运行时刻加载类是动态加载类
    
        - 基本的数据类型
            - void关键字 基本数据类型都存在类类型
            
        - Class类的基本API操作   