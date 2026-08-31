package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zziz extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziz(zzja zzjaVar, zzen zzenVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zziz(this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (p318o6.AbstractC6644X0.m28136c(20000, r6, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zzb;
        try {
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                zzja zzjaVar = this.zzc;
                this.zzb = 1;
                if (zzjaVar.zzx(this) != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else if (i7 != 2) {
                zzbdVar = (zzbd) this.zza;
                AbstractC1437o.m6082b(obj);
                this.zzd.zzb(zzbdVar);
            } else {
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
            zziy zziyVar = new zziy(this.zzc, this.zzd, null);
            this.zzb = 2;
        } catch (Exception e7) {
            e7.getMessage();
            zzbd zzbdVarZza = zzf.zza(e7, new zzbd(zzbb.zzb, zzba.zzV, e7.getMessage()));
            zzcb zzcbVarZzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zzbdVarZza;
            this.zzb = 3;
            if (zzcbVarZzm.zzc(zzjeVar, this) != objE) {
                zzbdVar = zzbdVarZza;
            }
            return objE;
        }
    }
}
