package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3501u;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcug implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzcug(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzcug zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcug(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final C7584a c7584aZza = ((zzchs) this.zzb).zza();
        final zzfdc zzfdcVarZza = ((zzcvj) this.zzc).zza();
        return new zzggr() { // from class: com.google.android.gms.internal.ads.zzcuf
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzfcj zzfcjVar = (zzfcj) obj;
                C3501u c3501u = new C3501u(context);
                c3501u.m17570e(zzfcjVar.zzB);
                c3501u.m17571f(zzfcjVar.zzC.toString());
                c3501u.m17569d(c7584aZza.f30226a);
                c3501u.m17568c(zzfdcVarZza.zzg);
                return c3501u;
            }
        };
    }
}
