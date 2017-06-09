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
