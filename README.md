# KMP Playground

一个使用 Kotlin Multiplatform (KMP) 构建的跨平台应用示例，支持 Android 平台。

## 🚀 项目特性

- **跨平台代码共享**: 使用 Kotlin Multiplatform 在不同平台间共享业务逻辑
- **现代化 Android UI**: 使用 Jetpack Compose 构建原生 Android 界面
- **类型安全**: 利用 Kotlin 的类型安全特性
- **原生性能**: 编译为原生代码，获得最佳性能
- **简洁语法**: 使用 Kotlin 的现代化语法

## 📁 项目结构

```
KMPPlayground/
├── androidApp/                 # Android 应用模块
│   ├── src/main/kotlin/       # Android 特定代码
│   └── build.gradle.kts       # Android 构建配置
├── shared/                     # 共享模块
│   ├── src/commonMain/kotlin/ # 跨平台共享代码
│   ├── src/androidMain/kotlin/# Android 平台特定实现
│   └── build.gradle.kts       # 共享模块构建配置
├── gradle/                     # Gradle 配置
│   └── libs.versions.toml     # 版本目录
├── build.gradle.kts           # 根项目构建配置
└── settings.gradle.kts        # 项目设置
```

## 🛠️ 技术栈

- **Kotlin Multiplatform**: 跨平台开发框架
- **Jetpack Compose**: Android 现代化 UI 工具包
- **Material Design 3**: Google 最新设计系统
- **Gradle**: 构建系统
- **Android Gradle Plugin**: Android 构建工具

## 📱 支持平台

- ✅ **Android** (API 24+)
- 🚧 **iOS** (预留支持，可扩展)

## 🚀 快速开始

### 前置要求

- Android Studio Arctic Fox 或更新版本
- JDK 8 或更高版本
- Android SDK (API 24+)

### 运行项目

1. **克隆项目**
   ```bash
   git clone <repository-url>
   cd kmp-playground
   ```

2. **在 Android Studio 中打开项目**
   - 打开 Android Studio
   - 选择 "Open an existing project"
   - 选择项目根目录

3. **运行 Android 应用**
   - 选择 `androidApp` 运行配置
   - 连接 Android 设备或启动模拟器
   - 点击运行按钮

### 构建命令

```bash
# 构建整个项目
./gradlew build

# 构建 Android 应用
./gradlew :androidApp:assembleDebug

# 运行测试
./gradlew test
```

## 📚 主要组件

### Shared 模块

- **Platform.kt**: 平台抽象接口
- **Greeting.kt**: 示例业务逻辑类
- **Platform.android.kt**: Android 平台实现

### Android 应用

- **MainActivity.kt**: 主活动，使用 Jetpack Compose
- **UI 组件**: Material Design 3 风格的现代化界面

## 🔧 自定义和扩展

### 添加新的共享功能

1. 在 `shared/src/commonMain/kotlin/` 中添加通用代码
2. 在 `shared/src/androidMain/kotlin/` 中添加 Android 特定实现
3. 在 Android 应用中使用新功能

### 添加新的 UI 组件

1. 在 `androidApp/src/main/kotlin/` 中创建新的 Compose 组件
2. 在 `MainActivity.kt` 中集成新组件

## 📄 许可证

本项目仅用于学习和演示目的。

## 🤝 贡献

欢迎提交 Issue 和 Pull Request！

---

**Happy Coding with Kotlin Multiplatform! 🎉**

