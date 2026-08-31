package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AbstractBinderC3309X;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3356j1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3391s0;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.client.InterfaceC3262H;
import com.google.android.gms.ads.internal.client.InterfaceC3271K;
import com.google.android.gms.ads.internal.client.InterfaceC3280N;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.client.InterfaceC3403v0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.concurrent.atomic.AtomicBoolean;
import p380w2.C7351t;
import p396y2.InterfaceC7536x;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyr extends AbstractBinderC3309X implements InterfaceC7536x, zzazv {
    protected zzcoe zza;
    private final zzcgv zzb;
    private final Context zzc;
    private final String zze;
    private final zzeyl zzf;
    private final zzeyj zzg;
    private final C7584a zzh;
    private final zzdsm zzi;
    private zzcnr zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzeyr(zzcgv zzcgvVar, Context context, String str, zzeyl zzeylVar, zzeyj zzeyjVar, C7584a c7584a, zzdsm zzdsmVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzeylVar;
        this.zzg = zzeyjVar;
        this.zzh = c7584a;
        this.zzi = zzdsmVar;
        zzeyjVar.zzq(this);
    }

    private final synchronized void zzV(int i7) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzt();
                zzcnr zzcnrVar = this.zzk;
                if (zzcnrVar != null) {
                    C7351t.m32353k().zzc(zzcnrVar);
                }
                if (this.zza != null) {
                    long jMo18161c = -1;
                    if (this.zzj != -1) {
                        jMo18161c = C7351t.m32357o().mo18161c() - this.zzj;
                    }
                    this.zza.zze(jMo18161c, i7);
                }
                zzc();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zzB() {
        return this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzC(zzbvn zzbvnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized InterfaceC3340f1 zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzG(C3321a2 c3321a2) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzH(C3356j1 c3356j1) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzI(C3393s2 c3393s2) {
        this.zzf.zzd(c3393s2);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzJ(zzbae zzbaeVar) {
        this.zzg.zzo(zzbaeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzK(boolean z7) {
    }

    final /* synthetic */ void zzL() {
        zzV(5);
    }

    final /* synthetic */ void zzM() {
        this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzL();
            }
        });
    }

    final /* synthetic */ zzeyj zzN() {
        return this.zzg;
    }

    final /* synthetic */ zzdsm zzO() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzQ(C3349h2 c3349h2, InterfaceC3280N interfaceC3280N) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzR(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzS(InterfaceC3403v0 interfaceC3403v0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzT(long j7) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final long zzU() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzY(C3391s0 c3391s0) {
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final void zza() {
        zzV(3);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzc() {
        AbstractC3718s.m18076e("destroy must be called on the main UI thread.");
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar != null) {
            zzcoeVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zzd() {
        return false;
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdA() {
        zzcoe zzcoeVar = this.zza;
        if (zzcoeVar != null) {
            zzcoeVar.zze(C7351t.m32357o().mo18161c() - this.zzj, 1);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 0) {
            zzV(2);
            return;
        }
        if (i8 == 1) {
            zzV(4);
        } else if (i8 != 2) {
            zzV(6);
        } else {
            zzV(3);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized boolean zze(C3349h2 c3349h2) {
        boolean z7;
        try {
            if (!c3349h2.m17231U()) {
                if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (this.zzh.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzlY)).intValue() || !z7) {
                    AbstractC3718s.m18076e("loadAd must be called on the main UI thread.");
                }
            }
            C7351t.m32349g();
            if (C3431F0.m17421l(this.zzc) && c3349h2.f13939D == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Failed to load the ad because app ID is missing.");
                this.zzg.zzdN(zzfee.zzd(4, null, null));
                return false;
            }
            if (zzB()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            return this.zzf.zza(c3349h2, this.zze, new zzeyn(this), new zzeyo(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzf() {
        AbstractC3718s.m18076e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzg() {
        AbstractC3718s.m18076e("resume must be called on the main UI thread.");
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzh() {
        if (this.zza != null) {
            this.zzj = C7351t.m32357o().mo18161c();
            int iZzc = this.zza.zzc();
            if (iZzc > 0) {
                zzcnr zzcnrVar = new zzcnr(this.zzb.zzc(), C7351t.m32357o());
                this.zzk = zzcnrVar;
                zzcnrVar.zzb(iZzc, new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzM();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzj(InterfaceC3331d0 interfaceC3331d0) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized C3369m2 zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzo(C3369m2 c3369m2) {
        AbstractC3718s.m18076e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzp(zzbtf zzbtfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzq(zzbti zzbtiVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized InterfaceC3328c1 zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized String zzu() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzx(zzbdd zzbddVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final synchronized void zzz(boolean z7) {
    }
}
