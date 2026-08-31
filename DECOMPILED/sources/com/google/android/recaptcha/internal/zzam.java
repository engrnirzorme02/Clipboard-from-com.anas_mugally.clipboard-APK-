package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6644X0;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(zzan zzanVar, zzen zzenVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzam(this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        C6099B c6099b;
        Exception e7;
        Throwable th;
        Object objE = AbstractC2005b.m8369e();
        if (this.zzb != 0) {
            c6099b = (C6099B) this.zza;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (Exception e8) {
                e7 = e8;
                InterfaceC6698x interfaceC6698xZzf = this.zzc.zzf();
                th = (Throwable) c6099b.f23859a;
                if (th == null) {
                    th = e7;
                }
                interfaceC6698xZzf.mo28288o0(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e7.getMessage()));
            }
        } else {
            AbstractC1437o.m6082b(obj);
            C6099B c6099b2 = new C6099B();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, c6099b2, null);
                this.zza = c6099b2;
                this.zzb = 1;
                if (AbstractC6644X0.m28136c(60000L, zzalVar, this) == objE) {
                    return objE;
                }
            } catch (Exception e9) {
                c6099b = c6099b2;
                e7 = e9;
                InterfaceC6698x interfaceC6698xZzf2 = this.zzc.zzf();
                th = (Throwable) c6099b.f23859a;
                if (th == null) {
                    th = e7;
                }
                interfaceC6698xZzf2.mo28288o0(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e7.getMessage()));
            }
        }
        return C1444v.f4971a;
    }
}
