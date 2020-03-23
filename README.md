# springboot-mybatis-thymeleaf
springboot+mybatis+thymeleaf简单整合，实现增删改查，一看就上手。本地部署只要下载之后导入依赖，版本过高就降低版本，
然后修改yml文件中的个人数据库信息，然后导入数据库就可以直接运行了！
## 项目的实现 

### 第一步，面向对象编程
    当然啦，你可以面向自己的对象编程，这样肯定是生活幸福美满的，走向人生巅峰的，哈哈哈！一个项目的开始肯定是底层开始的嘛，
    首先确定有什么对象，有了对象之后我们才能进行后面的操作。那就是实体类的编写与数据库的设计。
有了这些东西之后，后面的东西才能在这些的基础上一步步进行操作与实现。
### 功能实现
#### 登录页面国际化:自定义实现类重写LocaleResolver，使用split()获得前端传回的国家和地区两个参数，从而实现国际化
```java @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的参数
        String lang =request.getParameter("l");

        Locale locale=Locale.getDefault();//如果没有参数,为默认的

        //如果请求携带了国际化参数
        if(!StringUtils.isEmpty(lang)){
            //zh_CN
            String [] split=lang.split("_");
            //国家，地区
            locale=new Locale(split[0],split[1]);

        }
        return locale;
    }

#### 后续增删改查等等

## 往后发展
. 数据的分页显示
. Security的授权和认证,密码的加密存储。
. shiro 与springboot整合
. ......永无止境
. 
