package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.common.util.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3765t {

    /* JADX INFO: renamed from: a */
    private static final Pattern f14911a = Pattern.compile("\\$\\{(.*?)\\}");

    /* JADX INFO: renamed from: a */
    public static String m18208a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18209b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
