package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcy extends zzdbq implements zzdda {
    public zzdcy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(final String str) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdda) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(final String str) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdda) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(final String str, final String str2) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdda) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdbp(str2) { // from class: com.google.android.gms.internal.ads.zzdcu
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzdda) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zze() {
        zzs(zzdcv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzf() {
        zzs(zzdcw.zza);
    }
}
