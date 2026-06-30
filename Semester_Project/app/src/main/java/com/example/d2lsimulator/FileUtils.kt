package com.example.d2lsimulator

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream

fun openAssetFile(context: Context, fileName: String) {
    try {
        val file = File(context.cacheDir, fileName)

        //copy from assets to cache if not already there
        if (!file.exists()) {
            context.assets.open(fileName).use { input ->
                FileOutputStream(file).use { output ->
                    input.copyTo(output)
                }
            }
        }

        val uri: Uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.provider",
            file
        )

        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, getMimeType(fileName))
            flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
        }

        context.startActivity(intent)

    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun getMimeType(fileName: String): String {
    return when {
        fileName.endsWith(".pdf") -> "application/pdf"
        else -> "*/*"
    }
}

fun openLink(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}