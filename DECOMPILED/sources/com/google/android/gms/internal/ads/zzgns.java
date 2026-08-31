package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgns extends zzgok implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    InterfaceFutureC1673e zza;
    Object zzb;

    zzgns(InterfaceFutureC1673e interfaceFutureC1673e, Object obj) {
        interfaceFutureC1673e.getClass();
        this.zza = interfaceFutureC1673e;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (interfaceFutureC1673e == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (interfaceFutureC1673e.isCancelled()) {
            zzk(interfaceFutureC1673e);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgot.zzr(interfaceFutureC1673e));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzgpl.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e7) {
            zzb(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e8) {
            zzb(e8.getCause());
        } catch (Exception e9) {
            zzb(e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        String string;
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (interfaceFutureC1673e != null) {
            String string2 = interfaceFutureC1673e.toString();
            StringBuilder sb = new StringBuilder(string2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(string2);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + string3.length() + 1);
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(string3);
        sb2.append("]");
        return sb2.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Object obj2);
}
