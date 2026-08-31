package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6644X0;
import p318o6.C6640V0;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzdg extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdt zzdtVar, String str, long j7, zzsp zzspVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j7;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e7;
        C6640V0 e8;
        zzbd e9;
        Object objE = AbstractC2005b.m8369e();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (zzbd e10) {
                e9 = e10;
                zzbd zzbdVarZzs = this.zzc.zzs(e9, e9);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (C6640V0 e11) {
                e8 = e11;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzb, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e12) {
                e7 = e12;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            AbstractC1437o.m6082b(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j7 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objM28136c = AbstractC6644X0.m28136c(j7, zzdfVar, this);
                if (objM28136c == objE) {
                    return objE;
                }
                zzenVar = zzenVarZzf;
                obj = objM28136c;
            } catch (zzbd e13) {
                zzenVar = zzenVarZzf;
                e9 = e13;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e9, e9);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (C6640V0 e14) {
                zzenVar = zzenVarZzf;
                e8 = e14;
                zzbd zzbdVarZzs5 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzb, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs5);
                throw zzbdVarZzs5;
            } catch (Exception e15) {
                zzenVar = zzenVarZzf;
                e7 = e15;
                zzbd zzbdVarZzs6 = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzbdVarZzs6);
                throw zzbdVarZzs6;
            }
        }
        return (zzsr) obj;
    }
}
