package p036E2;

import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0370t0 implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1463a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1464b;

    /* JADX INFO: renamed from: c */
    private final zzhqg f1465c;

    /* JADX INFO: renamed from: d */
    private final zzhqg f1466d;

    private C0370t0(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.f1463a = zzhqgVar;
        this.f1464b = zzhqgVar2;
        this.f1465c = zzhqgVar3;
        this.f1466d = zzhqgVar4;
    }

    /* JADX INFO: renamed from: a */
    public static C0370t0 m1562a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new C0370t0(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0368s0((zzdsg) this.f1463a.zzb(), (C0366r0) this.f1464b.zzb(), (String) this.f1465c.zzb(), ((Integer) this.f1466d.zzb()).intValue());
    }
}
