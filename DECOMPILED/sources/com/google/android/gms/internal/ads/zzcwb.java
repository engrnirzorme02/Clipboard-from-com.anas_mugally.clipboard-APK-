package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwb extends zzdbq implements zzcvw {
    public zzcwb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(final C3324b1 c3324b1) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzcwi) obj).zzj(c3324b1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(final zzdgo zzdgoVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                zzcwi zzcwiVar = (zzcwi) obj;
                String message = zzdgoVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwiVar.zzj(zzfee.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        zzs(zzcvz.zza);
    }
}
