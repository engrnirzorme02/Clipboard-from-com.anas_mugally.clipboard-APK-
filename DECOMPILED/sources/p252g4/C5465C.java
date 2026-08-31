package p252g4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p164V3.C1762g;
import p228d4.C5235g;
import p260h4.AbstractC5646b;

/* JADX INFO: renamed from: g4.C */
/* JADX INFO: loaded from: classes.dex */
public class C5465C {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f20771a;

    /* JADX INFO: renamed from: b */
    private final C1762g f20772b;

    /* JADX INFO: renamed from: c */
    private final Object f20773c;

    /* JADX INFO: renamed from: d */
    TaskCompletionSource f20774d;

    /* JADX INFO: renamed from: e */
    boolean f20775e;

    /* JADX INFO: renamed from: f */
    private boolean f20776f;

    /* JADX INFO: renamed from: g */
    private Boolean f20777g;

    /* JADX INFO: renamed from: h */
    private final TaskCompletionSource f20778h;

    public C5465C(C1762g c1762g) {
        Object obj = new Object();
        this.f20773c = obj;
        this.f20774d = new TaskCompletionSource();
        this.f20775e = false;
        this.f20776f = false;
        this.f20778h = new TaskCompletionSource();
        Context contextM7405l = c1762g.m7405l();
        this.f20772b = c1762g;
        this.f20771a = AbstractC5499i.m24799q(contextM7405l);
        Boolean boolM24675b = m24675b();
        this.f20777g = boolM24675b == null ? m24674a(contextM7405l) : boolM24675b;
        synchronized (obj) {
            try {
                if (m24680d()) {
                    this.f20774d.trySetResult(null);
                    this.f20775e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Boolean m24674a(Context context) {
        Boolean boolM24678g = m24678g(context);
        if (boolM24678g == null) {
            this.f20776f = false;
            return null;
        }
        this.f20776f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolM24678g));
    }

    /* JADX INFO: renamed from: b */
    private Boolean m24675b() {
        if (!this.f20771a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f20776f = false;
        return Boolean.valueOf(this.f20771a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* JADX INFO: renamed from: e */
    private boolean m24676e() {
        try {
            return this.f20772b.m7409v();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m24677f(boolean z7) {
        String str;
        String str2 = z7 ? "ENABLED" : "DISABLED";
        if (this.f20777g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f20776f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        C5235g.m24179f().m24180b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    /* JADX INFO: renamed from: g */
    private static Boolean m24678g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e7) {
            C5235g.m24179f().m24183e("Could not read data collection permission from manifest", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m24679c(boolean z7) {
        if (!z7) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f20778h.trySetResult(null);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m24680d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f20777g;
            zBooleanValue = bool != null ? bool.booleanValue() : m24676e();
            m24677f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: h */
    public Task m24681h() {
        Task task;
        synchronized (this.f20773c) {
            task = this.f20774d.getTask();
        }
        return task;
    }

    /* JADX INFO: renamed from: i */
    public Task m24682i() {
        return AbstractC5646b.m25128b(this.f20778h.getTask(), m24681h());
    }
}
