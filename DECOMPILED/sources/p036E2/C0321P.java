package p036E2;

import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0321P implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1327a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1328b;

    /* JADX INFO: renamed from: c */
    private final zzhqg f1329c;

    private C0321P(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.f1327a = zzhqgVar;
        this.f1328b = zzhqgVar2;
        this.f1329c = zzhqgVar3;
    }

    /* JADX INFO: renamed from: a */
    public static C0321P m1497a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new C0321P(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0320O((C0308C) this.f1327a.zzb(), ((Integer) this.f1328b.zzb()).intValue(), (String) this.f1329c.zzb());
    }
}
