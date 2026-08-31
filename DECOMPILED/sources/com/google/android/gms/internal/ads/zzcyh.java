package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3377o2;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p036E2.AbstractC0335c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyh extends zzdbq implements zzcwm, zzcxr {
    private final zzfcj zzb;
    private final AtomicBoolean zzc;
    private final zzfcu zzd;

    public zzcyh(Set set, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfcjVar;
        this.zzd = zzfcuVar;
    }

    private final void zzb() {
        final C3377o2 c3377o2;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziA)).booleanValue() && this.zzc.compareAndSet(false, true) && (c3377o2 = this.zzb.zzae) != null && c3377o2.f14049a == 3) {
            zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcyg
                @Override // com.google.android.gms.internal.ads.zzdbp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzcyj) obj).zzm(c3377o2);
                }
            });
        }
    }

    public final void zza(final C3377o2 c3377o2) {
        if (AbstractC0335c.m1519a(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcyf
                @Override // com.google.android.gms.internal.ads.zzdbp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzcyj) obj).zzm(c3377o2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        int i7 = this.zzb.zzb;
        if (i7 == 2 || i7 == 5 || i7 == 4 || i7 == 6 || i7 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
