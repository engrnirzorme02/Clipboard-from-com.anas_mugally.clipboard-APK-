package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxg extends zzaxl {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxg(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", zzarwVar, i7, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzs(zzh.longValue());
        }
    }
}
