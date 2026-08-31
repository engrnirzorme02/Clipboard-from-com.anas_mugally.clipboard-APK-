package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.AbstractC3749d;
import com.google.android.gms.common.util.AbstractC3764s;
import p170W2.AbstractC1845j;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3478i0 {

    /* JADX INFO: renamed from: b */
    private static C3478i0 f14250b;

    /* JADX INFO: renamed from: a */
    String f14251a;

    private C3478i0() {
    }

    /* JADX INFO: renamed from: a */
    public static C3478i0 m17527a() {
        if (f14250b == null) {
            f14250b = new C3478i0();
        }
        return f14250b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: b */
    public final void m17528b(Context context) {
        SharedPreferences.Editor editorPutString;
        AbstractC3490o0.m17545k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f14251a)) {
            Context contextM7632d = AbstractC1845j.m7632d(context);
            if (AbstractC3749d.m18158a()) {
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (contextM7632d == null) {
                    editorPutString.apply();
                } else {
                    AbstractC3764s.m18207a(context, editorPutString, "admob_user_agent");
                }
            } else if (contextM7632d == null) {
                contextM7632d = null;
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (contextM7632d == null) {
                    editorPutString.apply();
                } else {
                    AbstractC3764s.m18207a(context, editorPutString, "admob_user_agent");
                }
            }
            this.f14251a = defaultUserAgent;
        }
        AbstractC3490o0.m17545k("User agent is updated.");
    }
}
