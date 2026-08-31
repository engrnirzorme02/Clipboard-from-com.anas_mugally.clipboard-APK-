package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeiy implements zzcxb {
    boolean zza;
    final /* synthetic */ zzeec zzb;
    final /* synthetic */ zzbzm zzc;

    zzeiy(zzejb zzejbVar, zzeec zzeecVar, zzbzm zzbzmVar) {
        this.zzb = zzeecVar;
        this.zzc = zzbzmVar;
        Objects.requireNonNull(zzejbVar);
        this.zza = false;
    }

    private final synchronized void zze(C3324b1 c3324b1) {
        int i7 = 1;
        if (true == ((Boolean) C3250D.m17200c().zzd(zzbci.zzfY)).booleanValue()) {
            i7 = 3;
        }
        this.zzc.zzd(new zzeed(i7, c3324b1));
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzb(int i7) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new C3324b1(i7, zzejb.zze(this.zzb.zza, i7), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzc(int i7, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzejb.zze(this.zzb.zza, i7);
            }
            zze(new C3324b1(i7, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zzd(C3324b1 c3324b1) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(c3324b1);
    }
}
