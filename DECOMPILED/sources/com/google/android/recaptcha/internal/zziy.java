package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
final class zziy extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziy(zzja zzjaVar, zzen zzenVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zziy(this.zzf, this.zzg, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzcg zzcgVar;
        zzja zzjaVar2;
        InterfaceC6698x interfaceC6698xZzA;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zze;
        if (i7 != 0) {
            if (i7 != 1) {
                AbstractC1437o.m6082b(obj);
                if (i7 == 2) {
                    AbstractC6087b.m27122c(this.zzf.zzA().hashCode());
                    interfaceC6698xZzA = this.zzf.zzA();
                    this.zze = 3;
                    if (interfaceC6698xZzA.await(this) != objE) {
                    }
                    return objE;
                }
                if (i7 == 3) {
                }
                zzcb zzcbVarZzm = this.zzf.zzm();
                zzje zzjeVar = zzje.zzc;
                this.zze = 4;
            } else {
                zzcgVar = (zzcg) this.zzd;
                zzscVar = (zzsc) this.zzc;
                zzjaVar = (zzja) this.zzb;
                zzjaVar2 = (zzja) this.zza;
                AbstractC1437o.m6082b(obj);
            }
            this.zzg.zza();
            return C1444v.f4971a;
        }
        AbstractC1437o.m6082b(obj);
        zzjaVar = this.zzf;
        zzsc zzscVar2 = zzjaVar.zzf;
        if (zzscVar2 == null) {
            zzscVar2 = null;
        }
        zzsc zzscVar3 = this.zzf.zzf;
        if (zzscVar3 == null) {
            zzscVar3 = null;
        }
        zzcg zzcgVar2 = new zzcg(zzscVar3.zzf());
        zzja zzjaVar3 = this.zzf;
        this.zza = zzjaVar;
        this.zzb = zzjaVar;
        this.zzc = zzscVar2;
        this.zzd = zzcgVar2;
        this.zze = 1;
        Object objZzw = zzjaVar3.zzw(this);
        if (objZzw != objE) {
            zzscVar = zzscVar2;
            obj = objZzw;
            zzcgVar = zzcgVar2;
            zzjaVar2 = zzjaVar;
        }
        return objE;
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar, zzcgVar, (WebView) obj);
        AbstractC6087b.m27122c(this.zzf.zzA().hashCode());
        this.zzf.zzh.zzd();
        this.zzf.zzh.zze();
        zzja zzjaVar4 = this.zzf;
        zzsc zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        if (zzjaVar4.zzE(zzscVar4, this) != objE) {
            AbstractC6087b.m27122c(this.zzf.zzA().hashCode());
            interfaceC6698xZzA = this.zzf.zzA();
            this.zze = 3;
            if (interfaceC6698xZzA.await(this) != objE) {
                zzcb zzcbVarZzm2 = this.zzf.zzm();
                zzje zzjeVar2 = zzje.zzc;
                this.zze = 4;
            }
        }
        return objE;
    }
}
