package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzal extends AbstractC6097l implements InterfaceC5371p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ C6099B zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzan zzanVar, zzen zzenVar, C6099B c6099b, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = c6099b;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzal(this.zzd, this.zze, this.zzf, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (p318o6.AbstractC6645Y.m28137a(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:13:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        long j7;
        boolean z7;
        boolean z8;
        int errorCode;
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zzc;
        if (i7 != 0) {
            if (i7 != 1) {
                z8 = this.zzb;
                j7 = this.zza;
                AbstractC1437o.m6082b(obj);
                z7 = z8;
                j7 += j7;
            } else {
                j7 = this.zza;
                try {
                    AbstractC1437o.m6082b(obj);
                } catch (Exception e7) {
                    this.zzf.f23859a = e7;
                    z8 = (e7 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e7).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                    if (!z8) {
                        throw e7;
                    }
                    this.zza = j7;
                    this.zzb = true;
                    this.zzc = 2;
                }
            }
            this.zzd.zzf().mo28289p0((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzao.zzc;
            this.zze.zza();
            z7 = false;
        } else {
            AbstractC1437o.m6082b(obj);
            j7 = 1000;
            z7 = true;
        }
        if (!z7) {
            return C1444v.f4971a;
        }
        zzan zzanVar = this.zzd;
        this.zza = j7;
        this.zzc = 1;
        obj = zzanVar.zzi(this);
    }
}
