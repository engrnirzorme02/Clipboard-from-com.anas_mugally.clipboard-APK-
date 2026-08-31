package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdk extends zzfi implements zzgm {
    private static final zzdk zzb;
    private zzfn zzd = zzfi.zzr();

    static {
        zzdk zzdkVar = new zzdk();
        zzb = zzdkVar;
        zzfi.zzw(zzdk.class, zzdkVar);
    }

    private zzdk() {
    }

    public static zzdj zza() {
        return (zzdj) zzb.zzl();
    }

    static /* synthetic */ void zzd(zzdk zzdkVar, Iterable iterable) {
        zzfn zzfnVar = zzdkVar.zzd;
        if (!zzfnVar.zzc()) {
            int size = zzfnVar.size();
            zzdkVar.zzd = zzfnVar.zzd(size + size);
        }
        zzds.zzg(iterable, zzdkVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzdi.class});
        }
        if (i8 == 3) {
            return new zzdk();
        }
        zzdl zzdlVar = null;
        if (i8 == 4) {
            return new zzdj(zzdlVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
