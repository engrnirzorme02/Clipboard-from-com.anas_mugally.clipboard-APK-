package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzft implements zzfo {
    private final InterfaceC6624N zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(InterfaceC6624N interfaceC6624N, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = interfaceC6624N;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, InterfaceC1875e interfaceC1875e) {
        Object objM28102e = AbstractC6626O.m28102e(new zzfq(zzgdVar, list, this, null), interfaceC1875e);
        return objM28102e == AbstractC2005b.m8369e() ? objM28102e : C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, InterfaceC1875e interfaceC1875e) {
        Object objM28102e = AbstractC6626O.m28102e(new zzfr(exc, zzgdVar, this, null), interfaceC1875e);
        return objM28102e == AbstractC2005b.m8369e() ? objM28102e : C1444v.f4971a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3, null);
    }
}
