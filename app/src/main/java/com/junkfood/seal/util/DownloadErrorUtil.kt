package com.junkfood.seal.util

import android.content.Context
import com.junkfood.seal.R

internal object DownloadErrorUtil {
    fun getUserMessage(
        context: Context,
        throwable: Throwable,
        isFetchingInfo: Boolean,
    ): String {
        val text = buildString {
            append(throwable.message.orEmpty())
            append('\n')
            append(throwable.stackTraceToString())
        }.lowercase()

        val resId =
            when {
                "cloudflare" in text || "anti-bot" in text || "cf-chl" in text -> {
                    R.string.error_cloudflare_protected
                }

                "login required" in text ||
                    "sign in" in text ||
                    "authentication required" in text ||
                    "account required" in text -> {
                    R.string.error_login_required
                }

                "cookies" in text || "cookie" in text -> {
                    R.string.error_cookies_required
                }

                "permission denied" in text -> {
                    R.string.error_storage_access
                }

                "no supported javascript runtime" in text -> {
                    R.string.error_javascript_runtime
                }

                "http error 403" in text || "access denied" in text || "forbidden" in text -> {
                    R.string.error_access_denied
                }

                "already been downloaded" in text -> {
                    R.string.download_archive_error
                }

                isFetchingInfo -> R.string.error_fetching_video_info_detailed

                else -> R.string.error_downloading_media_detailed
            }

        return context.getString(resId)
    }
}
