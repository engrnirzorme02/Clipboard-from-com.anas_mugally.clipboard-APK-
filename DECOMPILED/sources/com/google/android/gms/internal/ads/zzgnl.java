package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgnl extends zzgok implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    InterfaceFutureC1673e zza;
    Class zzb;
    Object zzc;

    zzgnl(InterfaceFutureC1673e interfaceFutureC1673e, Class cls, Object obj) {
        interfaceFutureC1673e.getClass();
        this.zza = interfaceFutureC1673e;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzr;
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((interfaceFutureC1673e == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = interfaceFutureC1673e instanceof zzgpv ? ((zzgpv) interfaceFutureC1673e).zzl() : null;
            objZzr = th == null ? zzgot.zzr(interfaceFutureC1673e) : null;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(interfaceFutureC1673e.getClass());
                String strValueOf2 = String.valueOf(e7.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length() + 16);
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            zza(objZzr);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(interfaceFutureC1673e);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th2) {
            try {
                zzgpl.zza(th2);
                zzb(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        String string;
        InterfaceFutureC1673e interfaceFutureC1673e = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
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
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = cls.toString();
        int length2 = string3.length();
        String string4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 13 + string4.length() + 1);
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(string3);
        sb2.append("], fallback=[");
        sb2.append(string4);
        sb2.append("]");
        return sb2.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Throwable th);
}
