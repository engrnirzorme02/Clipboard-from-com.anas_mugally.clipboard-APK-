package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3632w {

    /* JADX INFO: renamed from: a */
    private final C1839d[] f14692a;

    /* JADX INFO: renamed from: b */
    private final boolean f14693b;

    /* JADX INFO: renamed from: c */
    private final int f14694c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private InterfaceC3622r f14695a;

        /* JADX INFO: renamed from: c */
        private C1839d[] f14697c;

        /* JADX INFO: renamed from: b */
        private boolean f14696b = true;

        /* JADX INFO: renamed from: d */
        private int f14698d = 0;

        /* synthetic */ a(AbstractC3601g0 abstractC3601g0) {
        }

        /* JADX INFO: renamed from: a */
        public AbstractC3632w m17947a() {
            AbstractC3718s.m18073b(this.f14695a != null, "execute parameter required");
            return new C3599f0(this, this.f14697c, this.f14696b, this.f14698d);
        }

        /* JADX INFO: renamed from: b */
        public a m17948b(InterfaceC3622r interfaceC3622r) {
            this.f14695a = interfaceC3622r;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m17949c(boolean z7) {
            this.f14696b = z7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m17950d(C1839d... c1839dArr) {
            this.f14697c = c1839dArr;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m17951e(int i7) {
            this.f14698d = i7;
            return this;
        }
    }

    protected AbstractC3632w(C1839d[] c1839dArr, boolean z7, int i7) {
        this.f14692a = c1839dArr;
        boolean z8 = false;
        if (c1839dArr != null && z7) {
            z8 = true;
        }
        this.f14693b = z8;
        this.f14694c = i7;
    }

    /* JADX INFO: renamed from: a */
    public static a m17942a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo17869b(C3553a.b bVar, TaskCompletionSource taskCompletionSource);

    /* JADX INFO: renamed from: c */
    public boolean m17943c() {
        return this.f14693b;
    }

    /* JADX INFO: renamed from: d */
    public final int m17944d() {
        return this.f14694c;
    }

    /* JADX INFO: renamed from: e */
    public final C1839d[] m17945e() {
        return this.f14692a;
    }
}
