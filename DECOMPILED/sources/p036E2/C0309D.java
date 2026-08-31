package p036E2;

import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqf;

/* JADX INFO: renamed from: E2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0309D implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final C0306A f1294a;

    private C0309D(C0306A c0306a) {
        this.f1294a = c0306a;
    }

    /* JADX INFO: renamed from: a */
    public static C0309D m1488a(C0306A c0306a) {
        return new C0309D(c0306a);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        String strM1476b = this.f1294a.m1476b();
        zzhqf.zzb(strM1476b);
        return strM1476b;
    }
}
