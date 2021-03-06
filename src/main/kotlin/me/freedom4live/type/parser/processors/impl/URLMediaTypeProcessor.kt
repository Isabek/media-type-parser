package me.freedom4live.type.parser.processors.impl

import me.freedom4live.type.parser.processors.AbstractMediaTypeProcessor
import me.freedom4live.type.parser.processors.MediaTypeProcessor
import java.io.File
import java.net.URLConnection

internal class URLMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = URLConnection.guessContentTypeFromName(file.name)
}
