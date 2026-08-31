package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Collections;
import java.util.List;
import p324p2.InterfaceC6738e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtl implements InterfaceC6738e, zzcyy, InterfaceC3318a, zzcvs, zzcwm, zzcwn, zzcxg, zzcvv, zzfhi {
    private final List zza;
    private final zzdsz zzb;
    private long zzc;

    public zzdtl(zzdsz zzdszVar, zzcgv zzcgvVar) {
        this.zzb = zzdszVar;
        this.zza = Collections.singletonList(zzcgvVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        zzi(InterfaceC3318a.class, "onAdClicked", new Object[0]);
    }

    @Override // p324p2.InterfaceC6738e
    public final void onAppEvent(String str, String str2) {
        zzi(InterfaceC6738e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(Context context) {
        zzi(zzcwn.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(Context context) {
        zzi(zzcwn.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(Context context) {
        zzi(zzcwn.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
        zzi(zzcvs.class, "onRewarded", zzbvhVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(C3324b1 c3324b1) {
        zzi(zzcvv.class, "onAdFailedToLoad", Integer.valueOf(c3324b1.f13918a), c3324b1.f13919b, c3324b1.f13920c);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzi(zzcvs.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th) {
        zzi(zzfha.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        this.zzc = C7351t.m32357o().mo18161c();
        zzi(zzcyy.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzi(zzcwm.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzi(zzcvs.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzi(zzcvs.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzi(zzcvs.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzi(zzcvs.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        long jMo18161c = C7351t.m32357o().mo18161c() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(jMo18161c).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jMo18161c);
        AbstractC3490o0.m17545k(sb.toString());
        zzi(zzcxg.class, "onAdLoaded", new Object[0]);
    }
}
