package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyv implements zzfzp {
    private final Map zza;
    private final zzarw zzb;
    private final zzgdy zzc;
    private final long zzd;

    zzfyv(zzarw zzarwVar, Map map, zzfui zzfuiVar, zzgea zzgeaVar) {
        this.zza = map;
        this.zzb = zzarwVar;
        this.zzc = zzgeaVar.zza(112);
        this.zzd = zzfuiVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zza();
        return null;
    }

    public final Void zza() {
        zzast zzastVar;
        try {
            try {
                this.zzc.zza();
                InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) this.zza.get("gs");
                if (interfaceFutureC1673e != null && (zzastVar = (zzast) interfaceFutureC1673e.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzarw zzarwVar = this.zzb;
                    synchronized (zzarwVar) {
                        zzarwVar.zzad(zzastVar.zzg());
                        zzarwVar.zzN(zzastVar.zzc());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e7) {
            this.zzc.zzb(e7);
        }
        this.zzc.zzc();
        return null;
    }
}
