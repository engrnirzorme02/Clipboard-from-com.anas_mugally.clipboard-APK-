package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzfs extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzgd zzgdVar, zzft zzftVar, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzfs(this.zzd, this.zze, this.zzf, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.zzh(r7, r2, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzub zzubVar;
        zzjh zzjhVar;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zzc;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    AbstractC1437o.m6082b(obj);
                } else {
                    zzjhVar = (zzjh) this.zzb;
                    zzubVar = (zzub) this.zza;
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            this.zzd.zza = new zzbn();
            zzub zzubVarZzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzubVarZzi.zzf();
            zztz zztzVarZza = this.zze.zzc.zza(zzubVarZzi);
            zzjh zzjhVarZzb = zzjh.zzb();
            zzft zzftVar = this.zze;
            List listZzi = zztzVarZza.zzi();
            zzgd zzgdVar = this.zzd;
            this.zza = zzubVarZzi;
            this.zzb = zzjhVarZzb;
            this.zzc = 1;
            if (zzftVar.zzg(listZzi, zzgdVar, this) != objE) {
                zzubVar = zzubVarZzi;
                zzjhVar = zzjhVarZzb;
            }
            return objE;
            zzjhVar.zzf();
            AbstractC6087b.m27123d(zzjhVar.zza(TimeUnit.MICROSECONDS));
            zzubVar.zzf();
        } catch (Exception e7) {
            zzft zzftVar2 = this.zze;
            zzgd zzgdVar2 = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        return C1444v.f4971a;
    }
}
