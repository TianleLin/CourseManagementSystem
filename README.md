# 用Java面向对象方法设计并实现简易课程管理

### 项目功能

1.编程实现分别输入5条记录的教师、学生、课程、排课、选课等信息，并利用文件类的方法，将类序列化再写入文件中；

2.利用自己类的readfile方法，将文件的信息反序列化分别读入对象数组中。

3.编写程序任意输入学生的学号，查询显示该学生所选课程的名称、教师、上课地点。

4.将上述程序以GUI的方式进行实现。

### 项目效果

##### 	程序界面

​	<img src="C:\Users\Lin\OneDrive\UESTC\SophomoreFirstSemester\Object-orientedProgrammingJava\JavaExperiment\CourseManagementSystemGUI\images\Menu.png" alt="Menu" style="zoom:38%;" />

##### 	

##### 	功能

​	实现了添加、搜索，并将对象数据序列化存入文件和从文件中反序列化。

​	添加：在Add按钮之后的输入栏输入格式形如 sid/name/sex/age/major的字符串，即可将数据添加进入表中，并同时序列化对象并写	入文件。

​	搜索：点击Search按钮进入search界面（如下）

<img src="C:\Users\Lin\OneDrive\UESTC\SophomoreFirstSemester\Object-orientedProgrammingJava\JavaExperiment\CourseManagementSystemGUI\images\Search.png" alt="Search" style="zoom:38%;" />

​	输入sid进行搜索，搜索结果在表中呈现（如下）：

<img src="C:\Users\Lin\OneDrive\UESTC\SophomoreFirstSemester\Object-orientedProgrammingJava\JavaExperiment\CourseManagementSystemGUI\images\SearchResult.png" alt="SearchResult" style="zoom:38%;" />

​	表中的内容都是动态更新的，因此无需点击按钮打印所有的数据。

### 项目不足

​	搜索采用暴力算法。GUI相关类与数据控制类重复。