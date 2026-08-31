package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcz extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcz(zzdc zzdcVar, long j7, RecaptchaAction recaptchaAction, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzdcVar;
        this.zzc = j7;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) throws zzbd {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j7 = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j7, this);
            if (obj == objE) {
                return objE;
            }
        }
        return C1436n.m6072a(C1436n.m6073b((String) obj));
    }
}
