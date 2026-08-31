package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzed zzedVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d7;
        zzef zzefVar;
        String str3;
        zzef zzefVar2;
        if (interfaceC1875e instanceof zzed) {
            zzedVar = (zzed) interfaceC1875e;
            int i7 = zzedVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzedVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzedVar = new zzed(this, interfaceC1875e);
            }
        } else {
            zzedVar = new zzed(this, interfaceC1875e);
        }
        zzed zzedVar2 = zzedVar;
        Object objZzl = zzedVar2.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzedVar2.zzd;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    double d8 = zzedVar2.zza;
                    recaptchaAction2 = zzedVar2.zzg;
                    String str4 = zzedVar2.zzf;
                    zzef zzefVar3 = zzedVar2.zze;
                    AbstractC1437o.m6082b(objZzl);
                    d7 = d8;
                    zzefVar = zzefVar3;
                    str2 = str4;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = zzedVar2.zzf;
                    zzefVar2 = zzedVar2.zze;
                    AbstractC1437o.m6082b(objZzl);
                }
                zzsr zzsrVar = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar);
                return zzsrVar.zzj();
            }
            AbstractC1437o.m6082b(objZzl);
            if (!AbstractC6118n.m27183a(this.zzb, zzcm.zzb)) {
                throw new zzbd(zzbb.zzb, zzba.zzar, null);
            }
            double d9 = j7;
            zzdt zzdtVar = this.zza;
            double d10 = 0.45d * d9;
            zzedVar2.zze = this;
            zzedVar2.zzf = str;
            zzedVar2.zzg = recaptchaAction;
            double d11 = d9 * 0.55d;
            zzedVar2.zza = d11;
            zzedVar2.zzd = 1;
            objZzl = zzdtVar.zzl(str, (long) d10, zzedVar2);
            if (objZzl != objE) {
                str2 = str;
                recaptchaAction2 = recaptchaAction;
                d7 = d11;
                zzefVar = this;
            }
            return objE;
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar.zza;
            zzsc zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            objZzl = zzefVar.zza.zzm(zzspVarZzi, str2, (long) d7, zzedVar2);
            if (objZzl != objE) {
                str3 = str2;
                zzefVar2 = zzefVar;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return objE;
        } catch (zzbd e7) {
            throw e7;
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e8.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r12 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzee zzeeVar;
        Object obj;
        double d7;
        zzef zzefVar;
        if (interfaceC1875e instanceof zzee) {
            zzeeVar = (zzee) interfaceC1875e;
            int i7 = zzeeVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzeeVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzeeVar = new zzee(this, interfaceC1875e);
            }
        } else {
            zzeeVar = new zzee(this, interfaceC1875e);
        }
        Object obj2 = zzeeVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzeeVar.zzd;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    double d8 = zzeeVar.zza;
                    zzef zzefVar2 = zzeeVar.zze;
                    try {
                        AbstractC1437o.m6082b(obj2);
                        obj = obj2;
                        d7 = d8;
                        zzefVar = zzefVar2;
                        zzsc zzscVar = (zzsc) obj;
                        zzefVar.zzc = zzscVar;
                        zzeeVar.zze = zzefVar;
                        zzeeVar.zzd = 2;
                        Object objZzn = zzefVar.zza.zzn(zzscVar, (long) d7, zzeeVar);
                        j7 = zzefVar;
                    } catch (zzbd e7) {
                        e = e7;
                        j7 = zzefVar2;
                        j7.zzb = zzcm.zzd;
                        throw e;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzef zzefVar3 = zzeeVar.zze;
                    AbstractC1437o.m6082b(obj2);
                    j7 = zzefVar3;
                }
                j7.zzb = zzcm.zzb;
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj2);
            if (AbstractC6118n.m27183a(this.zzb, zzcm.zzb) || AbstractC6118n.m27183a(this.zzb, zzcm.zzd)) {
                return C1444v.f4971a;
            }
            this.zzb = zzcm.zzc;
            double d9 = j7;
            try {
                zzdt zzdtVar = this.zza;
                double d10 = 0.6d * d9;
                zzeeVar.zze = this;
                double d11 = d9 * 0.4d;
                zzeeVar.zza = d11;
                zzeeVar.zzd = 1;
                Object objZzo = zzdtVar.zzo((long) d10, zzeeVar);
                if (objZzo != objE) {
                    obj = objZzo;
                    d7 = d11;
                    zzefVar = this;
                    zzsc zzscVar2 = (zzsc) obj;
                    zzefVar.zzc = zzscVar2;
                    zzeeVar.zze = zzefVar;
                    zzeeVar.zzd = 2;
                    Object objZzn2 = zzefVar.zza.zzn(zzscVar2, (long) d7, zzeeVar);
                    j7 = zzefVar;
                }
                return objE;
            } catch (zzbd e8) {
                e = e8;
                j7 = this;
                j7.zzb = zzcm.zzd;
                throw e;
            }
        } catch (zzbd e9) {
            e = e9;
        }
    }
}
