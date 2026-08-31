package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.InterfaceC3641k;
import java.lang.ref.WeakReference;
import java.util.Map;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccq implements InterfaceC3641k {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzccq(zzcbd zzcbdVar) {
        Context context = zzcbdVar.getContext();
        this.zza = context;
        this.zzb = C7351t.m32349g().m17439O(context, zzcbdVar.zzs().f30226a);
        this.zzc = new WeakReference(zzcbdVar);
    }

    @Override // com.google.android.gms.common.api.InterfaceC3641k
    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzcci zzcciVar) {
        return zze(str);
    }

    protected void zzh(int i7) {
    }

    protected void zzi(int i7) {
    }

    protected void zzj(int i7) {
    }

    protected void zzk(int i7) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j7, long j8, boolean z7, long j9, long j10, long j11, int i7, int i8) {
        C7590g.f30239b.post(new zzccl(this, str, str2, j7, j8, j9, j10, j11, z7, i7, i8));
    }

    public final void zzn(String str, String str2, int i7, int i8, long j7, long j8, boolean z7, int i9, int i10) {
        C7590g.f30239b.post(new zzccm(this, str, str2, i7, i8, j7, j8, z7, i9, i10));
    }

    protected final void zzo(String str, String str2, int i7) {
        C7590g.f30239b.post(new zzccn(this, str, str2, i7));
    }

    public final void zzp(String str, String str2, long j7) {
        C7590g.f30239b.post(new zzcco(this, str, str2, j7));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        C7590g.f30239b.post(new zzccp(this, str, str2, str3, str4));
    }

    final /* synthetic */ void zzw(String str, Map map) {
        zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null) {
            zzcbdVar.zze("onPrecacheEvent", map);
        }
    }
}
