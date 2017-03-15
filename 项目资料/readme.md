dex2jar是将Android APP反编译到jar包的工具。
具体用法：将apk后缀格式改为zip并解压，得到classes.dex.
	  在命令行中启动dex2jar，将classes.dex编译为jar包。
	  后续可有其他工具查看jar包或者查看源码。
但dex2jar尚有很多缺陷。如遇到混淆或加固后的app表现不佳。又比如其得到的.class文件
与原class文件相比有出入。等等这些问题需要去解决。