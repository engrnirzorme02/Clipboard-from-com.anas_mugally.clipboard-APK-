package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import com.google.android.gms.ads.internal.client.InterfaceC3280N;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.client.InterfaceC3403v0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p324p2.InterfaceC6738e;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeli implements InterfaceC6738e, zzcyy, zzcxg, zzcvv, zzcwm, InterfaceC3318a, zzcvs, zzcyj, zzcwi, zzddz {
    final zzdsm zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) C3250D.m17200c().zzd(zzbci.zzjF)).intValue());

    public zzeli(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    private final void zzr() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekt
                    @Override // com.google.android.gms.internal.ads.zzezp
                    public final /* synthetic */ void zza(Object obj) {
                        Pair pair2 = pair;
                        ((InterfaceC3375o0) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlB)).booleanValue()) {
            return;
        }
        zzezq.zza(this.zzc, zzeky.zza);
    }

    @Override // p324p2.InterfaceC6738e
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekr
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC3375o0) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("The queue for app events is full, dropping the new event.");
            zzdsm zzdsmVar = this.zza;
            if (zzdsmVar != null) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "dae_action");
                zzdslVarZza.zzc("dae_name", str);
                zzdslVarZza.zzc("dae_data", str2);
                zzdslVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(final C3324b1 c3324b1) {
        zzezp zzezpVar = new zzezp() { // from class: com.google.android.gms.internal.ads.zzeku
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3271K) obj).zzd(c3324b1);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzezq.zza(atomicReference, zzezpVar);
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3271K) obj).zzc(c3324b1.f13918a);
            }
        });
        zzezq.zza(this.zzf, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3280N) obj).zzc(c3324b1);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzezq.zza(this.zzc, zzekv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzezq.zza(this.zzc, zzekz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzezq.zza(this.zzc, zzelb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzezq.zza(this.zzc, zzelc.zza);
        zzezq.zza(this.zzg, zzelh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzezq.zza(this.zzc, zzekx.zza);
        AtomicReference atomicReference = this.zzg;
        zzezq.zza(atomicReference, zzele.zza);
        zzezq.zza(atomicReference, zzelf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlB)).booleanValue()) {
            zzezq.zza(this.zzc, zzela.zza);
        }
        zzezq.zza(this.zzg, zzelg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        zzezq.zza(this.zzc, zzekw.zza);
        zzezq.zza(this.zzf, zzeld.zza);
        this.zzj.set(true);
        zzr();
    }

    public final synchronized InterfaceC3271K zzi() {
        return (InterfaceC3271K) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final C3324b1 c3324b1) {
        zzezq.zza(this.zzg, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3403v0) obj).mo17203Y(c3324b1);
            }
        });
    }

    public final synchronized InterfaceC3375o0 zzk() {
        return (InterfaceC3375o0) this.zzd.get();
    }

    public final void zzl(InterfaceC3271K interfaceC3271K) {
        this.zzc.set(interfaceC3271K);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final C3377o2 c3377o2) {
        zzezq.zza(this.zze, new zzezp() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3301U0) obj).mo17215j0(c3377o2);
            }
        });
    }

    public final void zzn(InterfaceC3375o0 interfaceC3375o0) {
        this.zzd.set(interfaceC3375o0);
        this.zzi.set(true);
        zzr();
    }

    public final void zzo(InterfaceC3301U0 interfaceC3301U0) {
        this.zze.set(interfaceC3301U0);
    }

    public final void zzp(InterfaceC3280N interfaceC3280N) {
        this.zzf.set(interfaceC3280N);
    }

    public final void zzq(InterfaceC3403v0 interfaceC3403v0) {
        this.zzg.set(interfaceC3403v0);
    }
}
