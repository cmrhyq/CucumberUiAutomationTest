Feature: 用户登录功能

  Scenario: 成功的用户登录
    Given 用户打开登录页面
    When 用户输入有效的用户名 "standard_user" 和密码 "secret_sauce"
    And 用户点击登录按钮
    Then 用户应该被重定向到首页
    And 页面上应该显示 "Products" 文本

  Scenario: 无效的用户登录
    Given 用户打开登录页面
    When 用户输入无效的用户名 "invalid_user" 和密码 "wrong_password"
    And 用户点击登录按钮
    Then 页面上应该显示错误消息 "Epic sadface: Username and password do not match any user in this service"