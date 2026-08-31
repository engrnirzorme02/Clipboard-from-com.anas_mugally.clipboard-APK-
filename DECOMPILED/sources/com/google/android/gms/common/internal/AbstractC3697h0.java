package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3697h0 {

    /* JADX INFO: renamed from: a */
    private Object f14789a;

    /* JADX INFO: renamed from: b */
    private boolean f14790b = false;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC3686c f14791c;

    public AbstractC3697h0(AbstractC3686c abstractC3686c, Object obj) {
        this.f14791c = abstractC3686c;
        this.f14789a = obj;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo17990a(Object obj);

    /* JADX INFO: renamed from: b */
    protected abstract void mo17991b();

    /* JADX INFO: renamed from: c */
    public final void m18031c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f14789a;
                if (this.f14790b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            mo17990a(obj);
        }
        synchronized (this) {
            this.f14790b = true;
        }
        m18033e();
    }

    /* JADX INFO: renamed from: d */
    public final void m18032d() {
        synchronized (this) {
            this.f14789a = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18033e() {
        m18032d();
        synchronized (this.f14791c.zzt) {
            this.f14791c.zzt.remove(this);
        }
    }
}
