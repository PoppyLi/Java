《java基础教程》51讲，抽象流的方法 

1、InputStream 
int read() 从输入流读取下一个数据字节。 
返回0到255范围内的int字节值。 
如果因已到达流末尾而没有可用的字节，则返回值 -1 
int read(byte[] b) 
从输入流中读取一定数量的字节并将其存储在缓冲区数组b中 
以整数形式返回实际读取的字节数 
int read(byte[] b,int off, int len) 
将输入流中最多len个数据字节读入字节数组 
尝试读取多达len字节，但可能读取较少数量 。 
以整数形式返回实际读取的字节数。 
2、OutputStream 
void write(int b) 
将指定的字节写入此输出流 
void write(byte[] b,int off,int len) 
将指定字节数组中从偏移量off开始的len个字节写入此输出流 
3、Reader 
Int read() 读取单个字符 
Int read(char[] cbuf) 将字符读入数组 
Int read(char[] cbuf,int off,int len) 将字符读入数组的某一部分 
4、Writer 
void write(int c) 写入单个字符 
void write(char[], cbuf) 写入字符数组 
void write(char[] cbuf,int off, int len) 写入字符数组的某一部分 
void write(String str) 写入字符串