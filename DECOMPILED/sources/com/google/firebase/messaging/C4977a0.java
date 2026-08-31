package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.messaging.a0 */
/* JADX INFO: loaded from: classes.dex */
final class C4977a0 {

    /* JADX INFO: renamed from: d */
    private static final Pattern f18899d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    private final String f18900a;

    /* JADX INFO: renamed from: b */
    private final String f18901b;

    /* JADX INFO: renamed from: c */
    private final String f18902c;

    private C4977a0(String str, String str2) {
        this.f18900a = m22438d(str2, str);
        this.f18901b = str;
        this.f18902c = str + "!" + str2;
    }

    /* JADX INFO: renamed from: a */
    static C4977a0 m22437a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new C4977a0(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: d */
    private static String m22438d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f18899d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static C4977a0 m22439f(String str) {
        return new C4977a0("S", str);
    }

    /* JADX INFO: renamed from: b */
    public String m22440b() {
        return this.f18901b;
    }

    /* JADX INFO: renamed from: c */
    public String m22441c() {
        return this.f18900a;
    }

    /* JADX INFO: renamed from: e */
    public String m22442e() {
        return this.f18902c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4977a0)) {
            return false;
        }
        C4977a0 c4977a0 = (C4977a0) obj;
        return this.f18900a.equals(c4977a0.f18900a) && this.f18901b.equals(c4977a0.f18901b);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f18901b, this.f18900a);
    }
}
