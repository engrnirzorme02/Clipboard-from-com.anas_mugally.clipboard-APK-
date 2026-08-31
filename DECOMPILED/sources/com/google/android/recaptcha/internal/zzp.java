package com.google.android.recaptcha.internal;

import p145S5.AbstractC1430h;
import p145S5.AbstractC1440r;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final InterfaceC1429g zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i7 = zzav.zza;
        this.zzb = AbstractC1430h.m6066b(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, InterfaceC1875e interfaceC1875e) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(AbstractC1638q.m6759d(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, InterfaceC1875e interfaceC1875e) {
        zzen zzenVarZzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return C1444v.f4971a;
        }
        zzg().zzb(AbstractC1610H.m6624f(AbstractC1440r.m6083a("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzenVarZzc.zza();
        return C1444v.f4971a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
