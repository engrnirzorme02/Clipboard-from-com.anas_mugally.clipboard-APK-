package com.google.android.recaptcha.internal;

import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(2:12|13)(2:14|15))(4:16|35|17|18)|28|(1:30)(1:34))(1:21)|37|22|(1:33)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r15 = r13;
        r13 = r1;
        r1 = r15;
        r15 = r11;
        r11 = r9;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (p318o6.AbstractC6645Y.m28137a(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(InterfaceC5367l interfaceC5367l, long j7, long j8, double d7, InterfaceC5367l interfaceC5367l2, InterfaceC1875e interfaceC1875e) throws Exception {
        zzbp zzbpVar;
        long jE;
        long j9;
        double d8;
        InterfaceC5367l interfaceC5367l3;
        zzbp zzbpVar2;
        InterfaceC5367l interfaceC5367l4;
        InterfaceC5367l interfaceC5367l5;
        long j10;
        double d9;
        Exception e7;
        if (interfaceC1875e instanceof zzbp) {
            zzbpVar = (zzbp) interfaceC1875e;
            int i7 = zzbpVar.zzh;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i7 - Integer.MIN_VALUE;
            } else {
                zzbpVar = new zzbp(this, interfaceC1875e);
            }
        } else {
            zzbpVar = new zzbp(this, interfaceC1875e);
        }
        Object obj = zzbpVar.zzf;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzbpVar.zzh;
        if (i8 != 0) {
            if (i8 == 1) {
                jE = zzbpVar.zzd;
                d9 = zzbpVar.zze;
                j10 = zzbpVar.zzc;
                interfaceC5367l3 = (InterfaceC5367l) zzbpVar.zzb;
                interfaceC5367l5 = (InterfaceC5367l) zzbpVar.zza;
                try {
                    AbstractC1437o.m6082b(obj);
                    return obj;
                } catch (Exception e8) {
                    e7 = e8;
                }
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jE = zzbpVar.zzd;
                d9 = zzbpVar.zze;
                j10 = zzbpVar.zzc;
                interfaceC5367l3 = (InterfaceC5367l) zzbpVar.zzb;
                interfaceC5367l5 = (InterfaceC5367l) zzbpVar.zza;
                AbstractC1437o.m6082b(obj);
                InterfaceC5367l interfaceC5367l6 = interfaceC5367l5;
                zzbpVar2 = zzbpVar;
                interfaceC5367l4 = interfaceC5367l6;
                long j11 = j10;
                d8 = d9;
                j9 = j11;
            }
            if (!((Boolean) interfaceC5367l5.invoke(e7)).booleanValue()) {
                throw e7;
            }
            jE = AbstractC5905g.m26657e((long) (jE * d9), j10);
            zzbpVar.zza = interfaceC5367l5;
            zzbpVar.zzb = interfaceC5367l3;
            zzbpVar.zzc = j10;
            zzbpVar.zze = d9;
            zzbpVar.zzd = jE;
            zzbpVar.zzh = 2;
        } else {
            AbstractC1437o.m6082b(obj);
            jE = j7;
            j9 = j8;
            d8 = d7;
            interfaceC5367l3 = interfaceC5367l2;
            zzbpVar2 = zzbpVar;
            interfaceC5367l4 = interfaceC5367l;
        }
        zzbpVar2.zza = interfaceC5367l4;
        zzbpVar2.zzb = interfaceC5367l3;
        zzbpVar2.zzc = j9;
        zzbpVar2.zze = d8;
        zzbpVar2.zzd = jE;
        zzbpVar2.zzh = 1;
        Object objInvoke = interfaceC5367l3.invoke(zzbpVar2);
        return objInvoke == objE ? objE : objInvoke;
    }
}
