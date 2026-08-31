package com.google.android.gms.common.util;

import android.util.Base64;

/* JADX INFO: renamed from: com.google.android.gms.common.util.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3748c {
    /* JADX INFO: renamed from: a */
    public static byte[] m18153a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18154b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* JADX INFO: renamed from: c */
    public static String m18155c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* JADX INFO: renamed from: d */
    public static String m18156d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: renamed from: e */
    public static String m18157e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
