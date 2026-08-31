package p036E2;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfgc;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0358n0 implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1433a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1434b;

    private C0358n0(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.f1433a = zzhqgVar;
        this.f1434b = zzhqgVar2;
    }

    /* JADX INFO: renamed from: a */
    public static C0358n0 m1549a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new C0358n0(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0352k0(((zzchd) this.f1433a).zza(), (zzdsr) this.f1434b.zzb(), zzfgc.zzc());
    }
}
