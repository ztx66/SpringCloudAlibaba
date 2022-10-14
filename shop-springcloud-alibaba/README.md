其中各模块的说明如下所示：
shop-springcloud-alibaba：Maven父工程。
shop-bean：各服务都会使用的JavaBean模块，包含实体类、Dto、Vo等JavaBean。
shop-utils：各服务都会使用的工具类模块。
shop-order：订单微服务。
shop-product：商品微服务。
shop-user：用户微服务。


项目总体上包含一个Maven父工程，实体类模块、工具类模块、用户微服务、商品微服务和订单微服务都以Maven子模块的形式存在，项目总体结构如下所示。

其中各模块的说明如下所示：

shop-springcloud-alibaba：Maven父工程。
shop-bean：各服务都会使用的JavaBean模块，包含实体类、Dto、Vo等JavaBean。
shop-utils：各服务都会使用的工具类模块。
shop-order：订单微服务，监听的端口为8080。
shop-product：商品微服务，监听的端口为8070。
shop-user：用户微服务，监听的端口为8060。
