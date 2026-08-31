package p036E2;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: E2.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0329Y implements zzhpx {

    /* JADX INFO: renamed from: a */
    private final zzhqg f1344a;

    /* JADX INFO: renamed from: b */
    private final zzhqg f1345b;

    /* JADX INFO: renamed from: c */
    private final zzhqg f1346c;

    /* JADX INFO: renamed from: d */
    private final zzhqg f1347d;

    /* JADX INFO: renamed from: e */
    private final zzhqg f1348e;

    private C0329Y(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.f1344a = zzhqgVar;
        this.f1345b = zzhqgVar2;
        this.f1346c = zzhqgVar3;
        this.f1347d = zzhqgVar4;
        this.f1348e = zzhqgVar5;
    }

    /* JADX INFO: renamed from: a */
    public static C0329Y m1498a(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new C0329Y(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0308C(((zzchd) this.f1344a).zza(), ((Long) this.f1345b.zzb()).longValue(), (PackageInfo) this.f1346c.zzb(), (C0330Z) this.f1347d.zzb(), (ScheduledExecutorService) this.f1348e.zzb());
    }
}
