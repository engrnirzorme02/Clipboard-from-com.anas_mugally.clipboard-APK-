package p324p2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.common.internal.AbstractC3718s;
import p314o2.AbstractC6559k;
import p314o2.C6556h;
import p314o2.C6573y;
import p314o2.C6574z;

/* JADX INFO: renamed from: p2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6735b extends AbstractC6559k {
    public C6735b(Context context) {
        super(context, 0);
        AbstractC3718s.m18084m(context, "Context cannot be null");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29539e(InterfaceC3312Y interfaceC3312Y) {
        return this.f24760a.m17301c(interfaceC3312Y);
    }

    public C6556h[] getAdSizes() {
        return this.f24760a.m17307k();
    }

    public InterfaceC6738e getAppEventListener() {
        return this.f24760a.m17309m();
    }

    public C6573y getVideoController() {
        return this.f24760a.m17297C();
    }

    public C6574z getVideoOptions() {
        return this.f24760a.m17300b();
    }

    public void setAdSizes(C6556h... c6556hArr) {
        if (c6556hArr == null || c6556hArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f24760a.m17316t(c6556hArr);
    }

    public void setAppEventListener(InterfaceC6738e interfaceC6738e) {
        this.f24760a.m17318v(interfaceC6738e);
    }

    public void setManualImpressionsEnabled(boolean z7) {
        this.f24760a.m17319w(z7);
    }

    public void setVideoOptions(C6574z c6574z) {
        this.f24760a.m17299a(c6574z);
    }
}
