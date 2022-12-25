package com.mikeschvedov.ultimate_utility_box.logger

object LoggerService {

    private var logger: Logger? = null
    private const val LogFileName = "app_logs";

    fun initialize(filePath: String, logLevel: LoggerOptions.LogLevel) {
        logger = Logger(
            LoggerOptions(
                fileName = LogFileName,
                writeToFile = false,
                outputFilePath = filePath,
                minLevel = logLevel
            )
        )
    }

    fun debug(content: String) {
        if (logger != null) {
            logger?.debug(content)
        } else {
            throw Exception("Logger is being used, but is not yet initialized in the Application Class")
        }
    }

    fun info(content: String) {
        if (logger != null) {
            logger?.info(content)
        } else {
            throw Exception("Logger is being used, but is not yet initialized in the Application Class")
        }
    }

    fun error(content: String) {
        if (logger != null) {
            logger?.error(content)
        } else {
            throw Exception("Logger is being used, but is not yet initialized in the Application Class")
        }
    }

    }