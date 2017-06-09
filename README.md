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


--------------------------------------------
--------------------------------------------
--------------------------------------------
--------------------------------------------

