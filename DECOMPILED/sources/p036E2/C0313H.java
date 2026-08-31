package p036E2;

import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzfgc;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0313H implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1298a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1299b;

    /* JADX INFO: renamed from: c */
    private final zzhqg f1300c;

    private C0313H(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.f1298a = zzhqgVar;
        this.f1299b = zzhqgVar2;
        this.f1300c = zzhqgVar4;
    }

    /* JADX INFO: renamed from: a */
    public static C0313H m1492a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new C0313H(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj = (C0368s0) this.f1298a.zzb();
        C0320O c0320o = (C0320O) this.f1299b.zzb();
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        if (((Integer) this.f1300c.zzb()).intValue() == 2) {
            obj = c0320o;
        }
        return new zzddr(obj, zzgpdVarZzc);
    }
}
