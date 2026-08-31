package p036E2;

import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzfgc;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0317L implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1313a;

    private C0317L(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.f1313a = zzhqgVar2;
    }

    /* JADX INFO: renamed from: b */
    public static C0317L m1494b(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new C0317L(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0316K zzb() {
        return new C0316K(zzfgc.zzc(), ((zzdyc) this.f1313a).zzb());
    }
}
