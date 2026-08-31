package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzac extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzae zzaeVar, String str, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzac(this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        Object objE = AbstractC2005b.m8369e();
        zzen zzenVar = this.zzb;
        try {
            if (zzenVar == 0) {
                AbstractC1437o.m6082b(obj);
                zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
                zzae zzaeVar = this.zzc;
                zzan zzanVar = zzaeVar.zzc;
                String str = zzaeVar.zze;
                this.zza = zzenVarZzb;
                this.zzb = 1;
                obj = zzanVar.zzc(str, this);
                zzenVar = zzenVarZzb;
            } else {
                if (zzenVar != 1) {
                    zzyVar = (zzy) this.zza;
                    AbstractC1437o.m6082b(obj);
                    int iZza = zzyVar.zza();
                    zztd zztdVar = (zztd) ((zzte) obj).zzr();
                    zztdVar.zzf(zzyVar.zza());
                    return new zzw(iZza, (zzte) zztdVar.zzk());
                }
                zzen zzenVar2 = (zzen) this.zza;
                AbstractC1437o.m6082b(obj);
                zzenVar = zzenVar2;
            }
            zzenVar.zza();
            zzae zzaeVar2 = this.zzc;
            zztf zztfVarZzf = zzti.zzf();
            zztg zztgVarZzf = zzth.zzf();
            zztgVarZzf.zzw((String) obj);
            zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
            return zzz.zza(zzaeVar2, (zzti) zztfVarZzf.zzk());
        } catch (Exception e7) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e7.getMessage()));
            zzae zzaeVar3 = this.zzc;
            this.zza = zzaeVar3;
            int i7 = 2;
            this.zzb = 2;
            if (e7 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e7).getErrorCode();
                if (errorCode == -100) {
                    i7 = 44;
                } else if (errorCode == -12) {
                    i7 = 39;
                } else if (errorCode == -3) {
                    i7 = 30;
                } else if (errorCode == -2) {
                    i7 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i7 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i7 = 53;
                            break;
                        case -17:
                            i7 = 52;
                            break;
                        case -16:
                            i7 = 43;
                            break;
                        case -15:
                            i7 = 42;
                            break;
                        case -14:
                            i7 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i7 = 36;
                                    break;
                                case -8:
                                    i7 = 35;
                                    break;
                                case -7:
                                    i7 = 34;
                                    break;
                                case -6:
                                    i7 = 33;
                                    break;
                                case -5:
                                    i7 = 32;
                                    break;
                            }
                            break;
                    }
                } else {
                    i7 = 28;
                }
            } else {
                i7 = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i7);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj != objE) {
                zzyVar = zzaeVar3;
            }
            return objE;
        }
    }
}
