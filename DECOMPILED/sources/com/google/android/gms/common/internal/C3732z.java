package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3553a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.z */
/* JADX INFO: loaded from: classes.dex */
public class C3732z implements C3553a.d {

    /* JADX INFO: renamed from: b */
    public static final C3732z f14866b = m18111a().m18113a();

    /* JADX INFO: renamed from: a */
    private final String f14867a;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.z$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f14868a;

        /* synthetic */ a(AbstractC3659C abstractC3659C) {
        }

        /* JADX INFO: renamed from: a */
        public C3732z m18113a() {
            return new C3732z(this.f14868a, null);
        }

        /* JADX INFO: renamed from: b */
        public a m18114b(String str) {
            this.f14868a = str;
            return this;
        }
    }

    /* synthetic */ C3732z(String str, AbstractC3660D abstractC3660D) {
        this.f14867a = str;
    }

    /* JADX INFO: renamed from: a */
    public static a m18111a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m18112b() {
        Bundle bundle = new Bundle();
        String str = this.f14867a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3732z) {
            return AbstractC3714q.m18053b(this.f14867a, ((C3732z) obj).f14867a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f14867a);
    }
}
