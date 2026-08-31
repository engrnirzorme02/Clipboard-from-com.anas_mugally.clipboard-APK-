package p036E2;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzckg;
import com.google.android.gms.internal.ads.zzepw;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: renamed from: E2.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0336c0 implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1376a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1377b;

    private C0336c0(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.f1376a = zzhqgVar;
        this.f1377b = zzhqgVar4;
    }

    /* JADX INFO: renamed from: a */
    public static C0336c0 m1527a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new C0336c0(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0334b0(((zzchd) this.f1376a).zza(), zzckg.zza(), zzepw.zzc(), ((zzchs) this.f1377b).zza());
    }
}
