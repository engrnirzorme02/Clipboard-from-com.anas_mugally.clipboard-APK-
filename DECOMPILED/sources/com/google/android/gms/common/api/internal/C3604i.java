package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC2592j;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i */
/* JADX INFO: loaded from: classes.dex */
public class C3604i {

    /* JADX INFO: renamed from: a */
    private final Object f14660a;

    public C3604i(Activity activity) {
        AbstractC3718s.m18084m(activity, "Activity must not be null");
        this.f14660a = activity;
    }

    /* JADX INFO: renamed from: a */
    public final Activity m17904a() {
        return (Activity) this.f14660a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractActivityC2592j m17905b() {
        return (AbstractActivityC2592j) this.f14660a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17906c() {
        return this.f14660a instanceof Activity;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17907d() {
        return this.f14660a instanceof AbstractActivityC2592j;
    }
}
