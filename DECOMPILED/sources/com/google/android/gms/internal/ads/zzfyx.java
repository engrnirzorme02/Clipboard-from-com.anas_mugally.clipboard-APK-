package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyx extends zzfzq {
    private final Map zza;
    private final Context zzb;
    private final zzfvd zzc;
    private final long zzd;
    private final long zze;

    zzfyx(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzfvd zzfvdVar, zzfui zzfuiVar, zzgea zzgeaVar) {
        super("mLLgbGPnthnmbtiY4qwSRZlP76fxHEn5RINQ3z6Wy79B89SpuoxQV8DFaf5u5bey", "s6mOQtxGebk+yjD4WdDHHvKqxnbPaF0rtJwo8mM3ABY=", zzarwVar, zzfymVar, zzgeaVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzfvdVar;
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) {
        zzast zzastVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        int i7 = 1;
        try {
            InterfaceFutureC1673e interfaceFutureC1673e = (InterfaceFutureC1673e) this.zza.get("gs");
            if (interfaceFutureC1673e != null && ((Build.VERSION.SDK_INT < 31 || interfaceFutureC1673e.isDone()) && (zzastVar = (zzast) interfaceFutureC1673e.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzastVar.zzb().length() > 1)) {
                strZzb = zzastVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                InterfaceFutureC1673e interfaceFutureC1673e2 = (InterfaceFutureC1673e) this.zza.get("ai");
                if (interfaceFutureC1673e2 != null) {
                    String str = (String) interfaceFutureC1673e2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzu(((Long) objArr[0]).longValue());
                zzarwVar.zzt((String) objArr[1]);
                zzarwVar.zzD((String) objArr[2]);
                zzarwVar.zzE((String) objArr[3]);
                zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzarwVar.zzp(zzgmkVarZzi.zzj(bArr, 0, bArr.length));
                zzarwVar.zzo(strZzb);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i7 = 2;
                    }
                    zzarwVar.zzai(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
