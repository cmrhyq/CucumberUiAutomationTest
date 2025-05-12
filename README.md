# CucumberUiAutomationTest
<div style="font-family: 'Kanit', sans-serif;text-align: center;border: 10px solid #fff;box-shadow: 1px 1px 2px #e6e6e6;background: linear-gradient(to left top, #11998e, #38ef7d); padding: 50px 0;">
<div style="color: #fff;">
    <h3 style="font-size: 25px;font-weight: 600;letter-spacing: 1px;text-transform: uppercase;margin: 0;">
       Java Cucumber UI Test
    </h3>
    <span style="font-size: 16px;text-transform: capitalize;">
    	Java Cucumber UI 测试
    </span>
</div>
</div>


## 简介 Introduction

- 本库包含的代码封装了UI自动化测试的基本框架，使用 Java + Cucumber + Selenium

### Cucumber 的基本概念

Cucumber 的核心概念围绕着行为驱动开发（BDD），它将软件开发的重点放在可观察的行为上。


## 项目结构

```
Project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/yourcompany/
│   │           └── application/        # 应用程序的主入口、配置等
│   │           └── domain/             # 领域模型、实体类
│   │           └── service/            # 业务逻辑服务
│   │           └── stepdefinitions/    # Step Definitions 类
│   │           └── support/            # 通用辅助类、测试数据生成等
│   └── test/
│       └── java/
│           └── com/yourcompany/
│               └── runners/            # Cucumber 测试运行器
│               └── stepdefinitions/    # Step Definitions 类
│               └── support/            # 测试相关的辅助类、hooks 等
│       └── resources/
│           └── features/           # Feature 文件 (.feature)
│           └── application.properties  # 应用配置
│           └── cucumber.properties     # Cucumber 配置
├── pom.xml                         # (Maven 项目)
```