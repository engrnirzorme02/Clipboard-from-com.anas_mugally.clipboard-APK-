package com.google.android.recaptcha.internal;

import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6626O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff {
    private final InterfaceC1429g zza;
    private final InterfaceC1429g zzb;
    private final InterfaceC1429g zzc;

    public zzff() {
        int i7 = zzav.zza;
        this.zza = AbstractC1430h.m6066b(zzfc.zza);
        this.zzb = AbstractC1430h.m6066b(zzfd.zza);
        this.zzc = AbstractC1430h.m6066b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, InterfaceC1875e interfaceC1875e) throws Exception {
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String str = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    String strZza = zzffVar.zzf().zza(strZzM);
                    if (strZza != null) {
                        zzenVarZzf.zza();
                        str = strZza;
                    } else {
                        zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                    }
                } catch (Exception e7) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e7.getMessage()));
                }
            }
            if (str == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    String strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e8) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e8.getMessage()));
                    }
                    str = strZzb;
                } catch (zzbd e9) {
                    zzenVarZzf2.zzb(e9);
                    throw e9;
                }
            }
            return AbstractC6406h.m27551E(zzscVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, null);
        } catch (Exception e10) {
            if (e10 instanceof zzbd) {
                throw e10;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e10.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, InterfaceC1875e interfaceC1875e) {
        return AbstractC6626O.m28102e(new zzfb(this, str, zztoVar, null), interfaceC1875e);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, InterfaceC1875e interfaceC1875e) {
        return zze(this, zzscVar, zzekVar, interfaceC1875e);
    }
}
