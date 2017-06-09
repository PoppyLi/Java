
《java基础教程》22讲

--------------------------------------------<br>
《java基础教程》23讲，super关键字

--------------------------------------------<br>
《java基础教程》24讲，抽象方法

--------------------------------------------<br>
《java基础教程》25讲，抽象类 

概念：在一个类里面有一个或多个抽象方法，就必须声明为抽象类。 
注意： 
抽象类不能被实例化（new） 
抽象类只能用做超类（父类） 
继续抽象类的子类，必须实现抽象方法，或本身也是抽象类

--------------------------------------------<br>
《java基础教程》26讲，final的用法 

1、在类前面，阻止继承。例如：java.lang.Math 
2、在方法面前阻止方法覆盖。 
3、在属性前面常量。

--------------------------------------------<br>
《java基础教程》27讲，Object 

1、是java中所有类的父类 
2、常用方法： 
public boolean equals(Object obj) 
protected void finalize() throws Throwable 
public final Class getClass() 
public int hashCode() 
public String toString()

--------------------------------------------<br>
《java基础教程》28讲，接口 

1、概念：现实生活中接口的例子很多，例如：USB接口、串口（Com）、鼠标、键盘、接口是一种特殊的抽象类，在其中只能定义常量和方法。 
2、语法 
[public] [abstract] interface interfaceName{ 
//常量方法的定义 
} 
3、实例 InterfaceTest.java 
4、接口分类，常量接口、单方法接口、标识接口 
5、注意： 
接口只有方法的定义，而没有方法的实现。 
接口像一个“管理者”，只告诉你做什么What，而不管你怎么做How。 
接口中的属性默认是public static final的，也只能是这样。 
接口中的方法默认是public abstract的，也只能是这样 

--------------------------------------------<br>
《java基础教程》29讲，接口的实现 

使用implements关键字实现接口 
一个类实现接口必须实现接口中的所有方法 
一个类可以实现多个接口 
接口可以实现多态，是设计系统的灵魂

--------------------------------------------<br>
《java基础教程》30讲，接口的继承 

1、接口的继承和类的继承相似 
2、MP3 play() ← Mobile talk()

--------------------------------------------<br>
《java基础教程》31讲，内部类 

1、定义在一个类内部的类叫内部类，包含内部类的类称为外部类。 
2、内部类可以声明public、protected、private等访问限制，可以声明为abstract的供其他内部类或外部类继承与扩展static、final的，也可以实现特定的接口。 
3、static的内部类行为上像一个独立的类，非static在行为上类似的属性或方法且禁止声明static的方法。 
4、内部类可以访问外部类的所有方法与属性，但static的内部类只能访问外部类的静态属性与方法。 
5、内部类的分类（静态内部类、实例内部类、局部内部类、匿名内部类）

--------------------------------------------<br>
《java基础教程》32讲，引用类型的类型转换 

1、向上转换(upcasting) 
子类对象可以直接当作父类对象使用，无需强制转换 
Animal 
↑ ↑ 
Horse Dog 

2、向下转换(downcasting) 
父类对象当作子类对象使用，需要强制类型转换，可能抛出异常 
Horse 
↑ 
WhiteHorse

--------------------------------------------<br>
《java基础教程》33讲，里氏代换原则 

任何父类能够出现的地方，子类一定能够出现 
Fruit ← Gardener 
↑ ↑ 
Apple Orange

--------------------------------------------<br>
《java基础教程》34讲，方法的动态绑定 

Java在运行期间判断所引用对象的实际类型，根据实际的类型调用其相应的方法。

--------------------------------------------<br>
《java基础教程》35讲，多态 

1、机制是动态绑定 
2、同一个类型，多种实现 
3、接口实现和继承具有多态性

--------------------------------------------<br>
《java基础教程》36讲，异常的概念 

异常时java在运行期间出现的错误，如：空指针、数组越界等。 
java异常提供了处理运行期错误的机制，java异常是面向对象的，当异常发生时自动产生一个异常对象，再由catch方法来捕获处理。

--------------------------------------------<br>
《java基础教程》37讲，异常的分类 

1、Throwable所有异常类的父类 
2、Error JVM异常，用户无法处理的异常 
3、Exception java异常类的父类 
4、Runtime Exception 运行时异常，也称作unchecked exception，不必捕获异常 
5、其它的异常 除了Runtime Exception以外其它的异常称为checked exception，必须捕获的异常

--------------------------------------------<br>
《java基础教程》38讲，异常块结构 

try{ 
// 
}catch(ExceptionType1 exOb){ 
// 
}catch(ExceptionType2 exOb){ 
// 
}finally{ 
// 
} 

注意事项： 
1、try、catch、finally三个语句块均不能单独使用，三者可以组成try..catch...finally、try...catch、try...finally三种结构，catch语句可以有一个或多个，finally语句最多一个。 
2、try、catch、finally三个代码块中变量的作用域为代码块内部，分别独立而不能相互访问。如果要在三个块中都可以访问，则需要将变量定义到这些块的外面 。 
3、多个catch块时候，只会匹配其中一个异常类并执行catch块代码，而不会再执行别的catch块，并且匹配catch语句的顺序是由上到下。

--------------------------------------------<br>
《java基础教程》39讲，异常的处理 

1、捕获异常catch 
可以使用try catch finally异常处理块来捕获异常，当异常发生是程序终止当前的执行路劲，跳转到catch块中执行，catch中的异常对象由系统自动产生，无论是否有异常产生finally块始终执行。 
2、异常类的相关方法 
可以使用异常类的相关方法显示异常信息，便于调试，如：getMessage()、printStackTrace()等。 
3、抛出异常throws 
在方法声明处使用throws关键字声明可能抛出的异常 
在方法中使用throw抛出异常对象 

--------------------------------------------<br>
《java基础教程》40讲，自定义异常 

1、定义一个类并继承Exception 
2、使用throw关键字，在方法体中抛出异常对象 
3、使用throws关键字，在方法声明中抛出异常

--------------------------------------------<br>
《java基础教程》41讲，集合框架简介 

1、集合也称容器，是装载一组对象的容器，例如：客户列表、订单列表 
2、学习集合框架的总体思路： 
如何添加元素、如何获得元素、如何删除元素、如何遍历元素

--------------------------------------------<br>
《java基础教程》42讲，集合框架图示 

详见收藏

--------------------------------------------<br>
《java基础教程》43讲，集合中的常用接口 

1、Collectiong：一组允许重复的对象 
2、List：继承Collection，也许重复，以元素安插的次序来放置元素，不会重新排列 
3、Set：继承Collection，但不允许重复，使用自己内部的一个排列机制 
4、Map：是一组成对的键·值对象，即所持有的是key-value对，Map中不能有重复的key，拥有自己的内部排列机制。

--------------------------------------------<br>
《java基础教程》44讲，Collection接口 

常用方法： 
boolean add(Object obj) 
boolean addAll(Collection c) 
void clear() 
boolean contains(Object obj) 
boolean containsAll(Collection c) 
boolean equals(Object obj) 
int hashCode() 
boolean isEmpty() 
boolean iterator() 
boolean remove(Object obj) 
boolean removeAll(Collection c) 
boolean retainAll(Collection c) 
int size() 
Object[] toArray()

--------------------------------------------<br>
《java基础教程》45讲，Iterator 接口 

常用方法 
boolean hasNext() 
Object next() 
void remove()

--------------------------------------------<br>
《java基础教程》46讲，List 接口 

1、特性：继承Collection，允许重复，以元素安插的次序来放置元素，不会重新排列 
2、常用方法： 
boolean add(int index,Object obj) 
boolean addAll(int index,Collection c) 
Object get(int index) 
int indexOf(Object obj) 
int lastIndexOf(Object obj) 
ListIterator listIterator() 
ListIterator listIterator(int index) 
Object remove(int index) 
Object set(int index,Object obj) 
List subList(int start, int end) 
3、List接口实现类 
ArrayList类封装了一个动态再分配的Object[]数组，是用数组实现的，读取速度快，插入与删除速度慢（因为插入与删除时要移动后面的元素），适合于随机访问。
LinkedList类添加了一些处理列表两端元素的方法，删除与插入速度快，读取速度较慢，因为它读取时是从头到尾（如果节点在链的前半部分），或尾向头（如果节点在链的后半部分）查找元素。因此适合于元素的插入与删除操作。 
方法： 
Linkedlist() 
LinkedList(Collection c) 
void addFirst(Object o) 
void addLast(Object o) 
Object getFirst() 
Object getLast() 
Object removeFirst() 
Object removeLast() 

4、对list的选择 
a.对于随机查询与迭代遍历操作，数组比所有的容器都要快。 
b.从中间的位置插入和删除元素，LinkedList要不ArrayList快，特别是删除操作。 
c.Vector通常不如ArrayList快，且应该避免使用，它目前仍然存在于类库中的原因是为了支持过去的代码。 
d.最佳实践：将ArrayList作为默认首选，只有当程序的性能因为经常从list中间进行插入和删除而变差的时候，才去选择LinkedList。当然如果只使用固定数量的元素，就应该选择数组。

--------------------------------------------<br>
《java基础教程》47讲，Set接口 

1、特性：继承Collection，但不允许重复，使用自己内部的一个排列机制，Set接口没有引入新方法，所以Set就是一个Collection，只不过其行为不同。 
2、HashSet：是最常用的，查询速度最快，因为内部以HashMap来实现，所以插入元素不能保持插入次序。 
创建自己的要添加到HashSet的类时，别忘了覆盖hashCode()和equals() 
当两个对象的equals返回true时，这两个对象的hashCode应该相等 
对象中用作equals比较标准的属性，都应该用来计算hashCode值 
3、Set接口 
取得hashCode值的方式 
f为每个有意义的属性 
为了避免直接相加产生 
偶然相等，各属性乘以一个质数再相加f1.hashCode()*17+(int)f2*13 
4、TreeSet 
基于TreeMap，生成一个总是处于排序状态的set，它实现了SortedSet接口，内部以TreeMap来实现 
TreeMap是实现了SortedSet接口的唯一实现，TreeSet可以确保集合元素处于排序状态 
TreeSet提供的方法： 
Comparator compatrator(); 返回当前Set使用的Comparator 
Object first();返回集合中的第一个元素 
Object last();返回集合中的最后一个元素 
Object lower(Object o);返回集合中位于指定元素之前的元素 
Object highter(Object o);返回集合中位于指定元素之后的元素 
5、Comparable接口 
添加到TreeSet中的自定义类必须首先Comparable接口以实现自然排序 
该接口中有一个obj1.compareTo(Object obj2)方法，该方法返回正数，表明obj1大于obj2，该方法返回负数，表明obj1小于obj2，该方法返回0，表明obj1等于obj2 
6、Comparator接口 
TreeSet通过实现Comparator接口实现了自然排序，如果要实现定制排序，则需要为TreeSet提供Comparator接口的实现 
7、对set的选择 
a.HashSet的性能总比TreeSet好，特别是最常用的添加和查找元素操作 
b.TreeSet存在的唯一原因是，它可以维持元素的排序状态，所以只有当你需要一个排好序的Set时，才应该使用TreeSet 
c.对于插入操作，LinkedHashSet比HashSet略微慢一点，这是由于维护链表所带来额外开销造成的，不过因为有了链表，遍历LinkedHashSet会比HashSet更快。

--------------------------------------------<br>
《java基础教程》48讲，Map接口 <br>
<br>
1、特征：是一组成对的键 - 值对象，即所持有的是key - value对。Map中不能有重复的key，拥有自己的内部排列机制 <br>
2、方法： <br>
void clear() <br>
boolean containsKey(Object k) <br>
boolean containsValue(Object v) <br>
Set entrySet() <br>
boolean equals(Object obj) <br>
Object get(Objectk) <br>
int hashCode() <br>
boolean isEmpty() <br>
Set keySet() <br>
Object put(Object k ,Object v) <br>
void putAll(Map m) <br>
Object remove(Object k) <br>
int size() <br>
Collection values() <br>
3、Map实现类 <br>
HashMap以哈希表数据结构实现，查找对象时通过哈希函数计算其位置，它是为快速查询而设计的，其内部定义了一个hash表数组(Entry[] table)，元素会通过哈希转换函数将元素的哈希地址转换成数组中存放的索引，如果有冲突，则使用散列链表的形式将所有相同哈希地址的元素串起来，可能通过查看HashMap.Entry的源码它是一个单链表结构。 <br>
TreeMap键以某种排序规则排序，内部以red - black(红 - 黑)树数据结构实现，实现了SortedMap接口 <br>
Hashtable也是以哈希表数据结构实现的，解决冲突时与HashMap也一样也是采用了散列链表的形式，不过性能比HashMap要低。<br>
4、对Map的选择 <br>
a.Hashtable和HashMap的效率大致相同，通常HashMap要快一点，所以HashMap有意取代HashTable。 <br>
b.TreeMap通常比HashMap慢，因为要维护排序。 <br>
c.HashMap正是为快速查询而设计的。 <br>
d.LinkedHashMap比HashMap慢一点，因为它维护散列数据结构的同时还要维护链表。<br>

--------------------------------------------<br>
《java基础教程》49讲，Collections中的常用算法 <br>

sort //排序 <br>
shuffle //洗牌(混淆) <br>
binarySearch //二分查找所在位置，查找前要sort先排序 <br>
fill //填充 <br>
max //最大值 <br>
min //最小值 <br>
reverse //反序 <br>
swap //对调元素<br>

--------------------------------------------<br>
《java基础教程》49讲，文件和目录 <br>

1、在Java语言里，文件（File）代表的是文件和目录 <br>
2、使用文件类File可以完成如下任务： <br>
File(File parent, String child) <br>
FIle(String pathname) <br>
File(String parent,String child) <br>
新建文件 <br>
public boolean createNewFile() throws IOException <br>
新建目录 <br>
public boolean mkdir() <br>
public boolean mkdirs() <br>
删除文件 <br>
public boolean delete() <br>
获取文件信息 <br>
String getName() <br>
String getPath() <br>
String getAbsolutePath() <br>
String getParent() <br>
重命名 <br>
boolean renameTo(File newName) <br>
测试文件 <br>
public boolean canRead() <br>
public boolean canWrite() <br>
public boolean isFile() <br>
public boolean isDirectory() <br>
public boolean isHidden() <br>
遍历目录下的文件 <br>
public File[] listFiles()<br>
<br>
--------------------------------------------<br>
《java基础教程》50讲，流的分类 <br>
<br>
1、按流的方向：输入流、输出流 <br>
2、按处理数据单位不同：字节流（8位一个字节）、字符流（16位两个字节） <br>
3、按功能划分：节点流、处理流 <br>

字符流 字符流 方法 <br>
输入流 InputStream Reader read <br>
输出流 OutputStream Writer write<br>
<br>
--------------------------------------------<br>
《java基础教程》51讲，抽象流的方法 <br>
<br>
1、InputStream <br>
int read() 从输入流读取下一个数据字节。 <br>
返回0到255范围内的int字节值。 <br>
如果因已到达流末尾而没有可用的字节，则返回值 -1 <br>
int read(byte[] b) <br>
从输入流中读取一定数量的字节并将其存储在缓冲区数组b中 <br>
以整数形式返回实际读取的字节数 <br>
int read(byte[] b,int off, int len) <br>
将输入流中最多len个数据字节读入字节数组 <br>
尝试读取多达len字节，但可能读取较少数量 。 <br>
以整数形式返回实际读取的字节数。 <br>
2、OutputStream <br>
void write(int b) <br>
将指定的字节写入此输出流 <br>
void write(byte[] b,int off,int len) <br>
将指定字节数组中从偏移量off开始的len个字节写入此输出流 <br>
3、Reader <br>
Int read() 读取单个字符 <br>
Int read(char[] cbuf) 将字符读入数组 <br>
Int read(char[] cbuf,int off,int len) 将字符读入数组的某一部分 <br>
4、Writer <br>
void write(int c) 写入单个字符 <br>
void write(char[], cbuf) 写入字符数组 <br>
void write(char[] cbuf,int off, int len) 写入字符数组的某一部分 <br>
void write(String str) 写入字符串<br>

--------------------------------------------<br>
《java基础教程》52讲，输入输出流体系结构 <br>

