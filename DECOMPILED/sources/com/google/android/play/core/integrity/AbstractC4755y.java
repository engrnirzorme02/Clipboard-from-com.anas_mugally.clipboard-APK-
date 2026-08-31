package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.C4763G;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.y */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4755y {

    /* JADX INFO: renamed from: b */
    private final String f18361b;

    /* JADX INFO: renamed from: c */
    private final long f18362c;

    /* JADX INFO: renamed from: e */
    private boolean f18364e;

    /* JADX INFO: renamed from: a */
    private final C4763G f18360a = new C4763G("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d */
    private final Object f18363d = new Object();

    AbstractC4755y(String str, long j7) {
        this.f18361b = str;
        this.f18362c = j7;
    }

    /* JADX INFO: renamed from: a */
    public final Task m21883a(Activity activity, int i7) {
        synchronized (this.f18363d) {
            try {
                if (this.f18364e) {
                    return Tasks.forResult(0);
                }
                this.f18364e = true;
                this.f18360a.m21890a("checkAndShowDialog(%s)", Integer.valueOf(i7));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f18361b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f18362c);
                return mo21835b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    abstract Task mo21835b(Activity activity, Bundle bundle);
}
