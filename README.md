# dlshare
#### Here I come, I am `dlshare`.
一个用于介绍`项目分享经验`及过程中遇到的坑的地方，教你快速实现将`你的lib`分享到`Jcenter`。
#### 1.修改github名
准备在github上分享自己的代码了，准备让大家认识自己了，github名字不好听怎么办？去改。<br>
http://blog.csdn.net/yangyangzhang1990/article/details/45869215
#### 2.上传源码、提交更新到github
分享中若遇到问题，查看一下代码版本管理工具是否为git如下图
![image](https://github.com/dlshare/dlshare/blob/master/screenshot/version_control_by_git.png)
使用AndroidStudio创建好一个准备分享的项目，按照下面操作步骤
http://www.jianshu.com/p/d995d263549c
1. 成功将源代码上传到github
2. 提交修改成功，更新成功
#### 3.Mac 安装jdk1.8.0_131
为什么非要安装jdk8呢？因为接下来会使用bintray-release插件来发布自己的lib库到Jcenter，<br>
在执行命令提交的时候报错：UnsupportedClassVersionError
1. 解决AndroidStudio出现UnsupportedClassVersionError
http://www.jianshu.com/p/a591c7ae6872
2. Mac终端命令大全
http://www.jianshu.com/p/3291de46f3ff
3. jdk下载
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
4. 成功安装
![image](https://github.com/dlshare/dlshare/blob/master/screenshot/idk1.8.0_131_installed.png)
#### 4. 使用bintray-release上传library到Jcenter
bintray-release项目github地址:
https://github.com/novoda/bintray-release
<br>Android快速发布开源项目到Jcenter
http://blog.csdn.net/lmj623565791/article/details/51148825
#### 5. 编写README.md介绍项目
http://blog.csdn.net/kaitiren/article/details/38513715
#### 6. 中途遇到的坑
1. 
2. 
3. 
