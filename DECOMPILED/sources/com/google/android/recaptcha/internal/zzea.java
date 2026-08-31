package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
final class zzea extends AbstractC6097l implements InterfaceC5367l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC6698x zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzec zzecVar, long j7, InterfaceC6698x interfaceC6698x, InterfaceC1875e interfaceC1875e) {
        super(1, interfaceC1875e);
        this.zzc = zzecVar;
        this.zzd = j7;
        this.zze = interfaceC6698x;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
        return new zzea(this.zzc, this.zzd, this.zze, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5367l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((InterfaceC1875e) obj)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        zzbd e7;
        zzen zzenVar2;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zzb;
        if (i7 == 0) {
            AbstractC1437o.m6082b(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j7 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j7, this);
                if (objZzo != objE) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return objE;
            } catch (zzbd e8) {
                zzenVar = zzenVarZzf;
                e7 = e8;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        }
        if (i7 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC1437o.m6082b(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return AbstractC6087b.m27120a(this.zze.mo28289p0(C1444v.f4971a));
            } catch (zzbd e9) {
                e7 = e9;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            AbstractC1437o.m6082b(obj);
        } catch (zzbd e10) {
            e7 = e10;
            zzenVar = zzenVar2;
            this.zzc.zzd = e7;
            zzenVar.zzb(e7);
            throw e7;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j8 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j8, this) != objE) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return AbstractC6087b.m27120a(this.zze.mo28289p0(C1444v.f4971a));
        }
        return objE;
    }
}
