package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
final class zzeb extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC6698x zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzec zzecVar, InterfaceC6698x interfaceC6698x, long j7, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzecVar;
        this.zzc = interfaceC6698x;
        this.zzd = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzeb(this.zzb, this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e7;
        Object objE = AbstractC2005b.m8369e();
        if (this.zza != 0) {
            try {
                AbstractC1437o.m6082b(obj);
                zzebVar = this;
            } catch (zzbd e8) {
                zzbdVar = e8;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.mo28288o0(zzbdVar);
            }
        } else {
            AbstractC1437o.m6082b(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == objE) {
                        return objE;
                    }
                } catch (zzbd e9) {
                    e7 = e9;
                    zzbdVar = e7;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    zzebVar.zzc.mo28288o0(zzbdVar);
                }
            } catch (zzbd e10) {
                e7 = e10;
                zzebVar = this;
                zzbdVar = e7;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.mo28288o0(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return C1444v.f4971a;
    }
}
