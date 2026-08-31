package p027D1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;

/* JADX INFO: renamed from: D1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183c {
    /* JADX INFO: renamed from: a */
    public static boolean m918a(Uri uri) {
        return m921d(uri) && uri.getPathSegments().contains("picker");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m919b(Uri uri) {
        return m921d(uri) && !m924g(uri);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m920c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m921d(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m922e(Uri uri) {
        return m921d(uri) && m924g(uri);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m923f(int i7, int i8) {
        return i7 != Integer.MIN_VALUE && i8 != Integer.MIN_VALUE && i7 <= 512 && i8 <= 384;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m924g(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* JADX INFO: renamed from: h */
    public static AssetFileDescriptor m925h(Uri uri, ContentResolver contentResolver) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }
}
