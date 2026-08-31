package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4763G {

    /* JADX INFO: renamed from: a */
    private final String f18366a;

    public C4763G(String str) {
        this.f18366a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: f */
    private static String m21889f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e7) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e7);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m21890a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m21889f(this.f18366a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m21891b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m21889f(this.f18366a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m21892c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m21889f(this.f18366a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m21893d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m21889f(this.f18366a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m21894e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m21889f(this.f18366a, str, objArr));
        }
        return 0;
    }
}
