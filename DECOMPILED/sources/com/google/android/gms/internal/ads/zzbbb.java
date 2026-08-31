package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.io.IOException;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbb implements AbstractC3686c.a {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbat zza;
    final /* synthetic */ zzbzm zzb;
    final /* synthetic */ zzbbd zzc;

    zzbbb(zzbbd zzbbdVar, zzbat zzbatVar, zzbzm zzbzmVar) {
        this.zza = zzbatVar;
        this.zzb = zzbzmVar;
        Objects.requireNonNull(zzbbdVar);
        this.zzc = zzbbdVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        zzbbd zzbbdVar = this.zzc;
        synchronized (zzbbdVar.zzf()) {
            try {
                if (zzbbdVar.zzd()) {
                    return;
                }
                zzbbdVar.zze(true);
                final zzbas zzbasVarZzc = zzbbdVar.zzc();
                if (zzbasVarZzc == null) {
                    return;
                }
                zzgpd zzgpdVar = zzbzh.zza;
                final zzbat zzbatVar = this.zza;
                final zzbzm zzbzmVar = this.zzb;
                final InterfaceFutureC1673e interfaceFutureC1673eSubmit = zzgpdVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbzm zzbzmVar2 = zzbzmVar;
                        zzbas zzbasVar = zzbasVarZzc;
                        zzbbb zzbbbVar = this.zza;
                        try {
                            zzbav zzbavVarZzq = zzbasVar.zzq();
                            boolean zZzp = zzbasVar.zzp();
                            zzbat zzbatVar2 = zzbatVar;
                            zzbaq zzbaqVarZzf = zZzp ? zzbavVarZzq.zzf(zzbatVar2) : zzbavVarZzq.zze(zzbatVar2);
                            if (!zzbaqVarZzf.zza()) {
                                zzbzmVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbbVar.zzc.zzb();
                                return;
                            }
                            zzbay zzbayVar = new zzbay(zzbbbVar, zzbaqVarZzf.zzb(), 1);
                            int i7 = zzbayVar.read();
                            if (i7 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbayVar.unread(i7);
                            zzbzmVar2.zzc(zzbbf.zza(zzbayVar, zzbaqVarZzf.zzd(), zzbaqVarZzf.zzg(), zzbaqVarZzf.zzf(), zzbaqVarZzf.zze()));
                        } catch (RemoteException e7) {
                            e = e7;
                            int i8 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33329d("Unable to obtain a cache service instance.", e);
                            zzbzmVar2.zzd(e);
                            zzbbbVar.zzc.zzb();
                        } catch (IOException e8) {
                            e = e8;
                            int i9 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33329d("Unable to obtain a cache service instance.", e);
                            zzbzmVar2.zzd(e);
                            zzbbbVar.zzc.zzb();
                        }
                    }
                });
                zzbzmVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbaz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzbzmVar.isCancelled()) {
                            interfaceFutureC1673eSubmit.cancel(true);
                        }
                    }
                }, zzbzh.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
    }
}
