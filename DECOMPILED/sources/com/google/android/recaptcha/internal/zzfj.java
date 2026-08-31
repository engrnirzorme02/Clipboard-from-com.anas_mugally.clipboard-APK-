package com.google.android.recaptcha.internal;

import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6626O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    private final InterfaceC1429g zza;

    public zzfj() {
        int i7 = zzav.zza;
        this.zza = AbstractC1430h.m6066b(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, InterfaceC1875e interfaceC1875e) {
        zzfg zzfgVar;
        if (interfaceC1875e instanceof zzfg) {
            zzfgVar = (zzfg) interfaceC1875e;
            int i7 = zzfgVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, interfaceC1875e);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, interfaceC1875e);
        }
        Object obj = zzfgVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfgVar.zzc;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return obj;
        }
        AbstractC1437o.m6082b(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objM28102e = AbstractC6626O.m28102e(zzfhVar, zzfgVar);
        return objM28102e == objE ? objE : objM28102e;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, InterfaceC1875e interfaceC1875e) {
        return zzc(this, zzbrVar, zzspVar, interfaceC1875e);
    }
}
