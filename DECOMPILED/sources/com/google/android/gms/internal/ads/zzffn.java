package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayDeque;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffn {
    private final zzfer zza;
    private final zzffk zzb;
    private final zzfen zzc;
    private zzfft zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzffn(zzfer zzferVar, zzfen zzfenVar, zzffk zzffkVar) {
        this.zza = zzferVar;
        this.zzc = zzfenVar;
        this.zzb = zzffkVar;
        zzfenVar.zza(new zzfem() { // from class: com.google.android.gms.internal.ads.zzffm
            @Override // com.google.android.gms.internal.ads.zzfem
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgI)).booleanValue() && !C7351t.m32354l().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzffl zzfflVar = (zzffl) arrayDeque.pollFirst();
                if (zzfflVar == null || (zzfflVar.zzb() != null && this.zza.zzc(zzfflVar.zzb()))) {
                    zzfft zzfftVar = new zzfft(this.zza, this.zzb, zzfflVar);
                    this.zze = zzfftVar;
                    zzfftVar.zza(new zzffi(this, zzfflVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzffl zzfflVar) {
        this.zzd.add(zzfflVar);
    }

    public final synchronized InterfaceFutureC1673e zzb(zzffl zzfflVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfflVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfft zzfftVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
