package p100M2;

import android.os.Bundle;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: M2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0892g implements C3553a.d {

    /* JADX INFO: renamed from: d */
    public static final C0892g f3492d = new C0892g(new C0891f());

    /* JADX INFO: renamed from: a */
    private final String f3493a = null;

    /* JADX INFO: renamed from: b */
    private final boolean f3494b;

    /* JADX INFO: renamed from: c */
    private final String f3495c;

    public C0892g(C0891f c0891f) {
        this.f3494b = c0891f.f3490a.booleanValue();
        this.f3495c = c0891f.f3491b;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m4049a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f3494b);
        bundle.putString("log_session_id", this.f3495c);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean m4050b() {
        return this.f3494b;
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String m4051c() {
        return this.f3495c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0892g)) {
            return false;
        }
        C0892g c0892g = (C0892g) obj;
        String str = c0892g.f3493a;
        return AbstractC3714q.m18053b(null, null) && this.f3494b == c0892g.f3494b && AbstractC3714q.m18053b(this.f3495c, c0892g.f3495c);
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(null, Boolean.valueOf(this.f3494b), this.f3495c);
    }
}
