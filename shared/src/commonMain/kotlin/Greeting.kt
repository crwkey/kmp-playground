class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
    
    fun getWelcomeMessage(): String {
        return "欢迎使用 Kotlin Multiplatform 应用！\n运行平台: ${platform.name}"
    }
    
    fun getFeatures(): List<String> {
        return listOf(
            "跨平台代码共享",
            "原生性能",
            "类型安全",
            "现代化 UI (Jetpack Compose)",
            "简洁的 Kotlin 语法"
        )
    }
}

