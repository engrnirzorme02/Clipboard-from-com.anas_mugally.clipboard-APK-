package p100M2;

import android.os.Bundle;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: M2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0888c implements C3553a.d {

    /* JADX INFO: renamed from: b */
    public static final C0888c f3488b = new C0888c(new Bundle(), null);

    /* JADX INFO: renamed from: a */
    private final Bundle f3489a;

    /* synthetic */ C0888c(Bundle bundle, AbstractC0894i abstractC0894i) {
        this.f3489a = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m4047a() {
        return new Bundle(this.f3489a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0888c) {
            return AbstractC3714q.m18052a(this.f3489a, ((C0888c) obj).f3489a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.f3489a);
    }
}
